package com.rosegarden.service;

import com.rosegarden.entity.ProductEntity;
import io.smallrye.mutiny.Uni;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class ProductService {

    public Uni<List<ProductEntity>> getAllProducts() {
        return ProductEntity.listAll();
    }
}
