package com.cydeo.lab06orm.entity;

import com.cydeo.lab06orm.enums.CartState;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;

@Entity
@Data
@NoArgsConstructor
public class Cart extends BaseEntity{
    @Enumerated(EnumType.STRING)
    private CartState cartState;

    @ManyToOne
    private Customer customer;
    @ManyToOne
    private Discount discount;

    public Cart(CartState cartState, Customer customer, Discount discount) {
        this.cartState = cartState;
        this.customer = customer;
        this.discount = discount;
    }
}
