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
    private int remainingQuantity;

    @ManyToMany
    @JoinTable(name = "productCategoryRel",
    joinColumns = @JoinColumn(name = "p_id"),
    inverseJoinColumns = @JoinColumn(name = "c_id"))
    private List<Category> category;


}
