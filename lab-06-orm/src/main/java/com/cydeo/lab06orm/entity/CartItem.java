package com.cydeo.lab06orm.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.math.BigInteger;

@Entity
@Data
@NoArgsConstructor
public class CartItem extends BaseEntity{
    private int quantity;

    @ManyToOne
    private Cart cart;

    @ManyToOne
    private Product product;

    public CartItem(int quantity, Cart cart, Product product) {
        this.quantity = quantity;
        this.cart = cart;
        this.product = product;
    }
}
