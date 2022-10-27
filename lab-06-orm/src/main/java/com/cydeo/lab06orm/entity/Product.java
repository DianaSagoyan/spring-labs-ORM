package com.cydeo.lab06orm.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Product extends BaseEntity{
    private String Name;
    private BigDecimal price;
    private int quantity;
    private int remaining_quantity;

    @ManyToMany
    @JoinTable(name = "productCategoryRel",
    joinColumns = @JoinColumn(name = "p_id"),
    inverseJoinColumns = @JoinColumn(name = "c_id"))
    private List<Category> category;

    public Product(String name, BigDecimal price, int quantity, int remaining_quantity, List<Category> category) {
        Name = name;
        this.price = price;
        this.quantity = quantity;
        this.remaining_quantity = remaining_quantity;
        this.category = category;
    }
}
