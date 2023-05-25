package com.rosegarden.entity;

import io.quarkus.hibernate.reactive.panache.PanacheEntityBase;
import javax.persistence.*;

@Entity(name = "product")
@Table(name = "products")
public class ProductEntity extends PanacheEntityBase {

    @Id
    private Long id;
    private String name;
    private double price;

    public ProductEntity() {
    }

    public ProductEntity(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
