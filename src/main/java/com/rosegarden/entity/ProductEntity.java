package com.rosegarden.entity;

import io.quarkus.hibernate.reactive.panache.PanacheEntityBase;
import javax.persistence.*;

@Entity(name = "product")
@Table(name = "products")
public class ProductEntity extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String productName;
    private double price;
    private String productImage;

    public ProductEntity() {
    }

    public ProductEntity(Long id, String productName, double price, String productImage) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.productImage = productImage;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }
}
