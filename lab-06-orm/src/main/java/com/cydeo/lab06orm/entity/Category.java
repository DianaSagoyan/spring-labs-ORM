package com.cydeo.lab06orm.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Category extends BaseEntity{
    private String name;

    @ManyToMany(mappedBy = "category")
    private List<Product> product;
}
