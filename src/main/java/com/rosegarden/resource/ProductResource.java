package com.rosegarden.resource;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rosegarden.service.ProductService;
import io.smallrye.mutiny.Uni;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/rg")
public class ProductResource {

    @Inject
    ProductService productService;

    @GET
    @Path("/products")
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<Response> getProducts() {
        ObjectMapper mapper = new ObjectMapper();

        return productService.getAllProducts()
                .map(products -> {
                    try {
                        return Response.ok(mapper.writeValueAsString(products)).build();
                    } catch (JsonProcessingException e) {
                        throw new RuntimeException(e);
                    }
                });
    }
}
