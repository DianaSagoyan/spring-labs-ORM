package com.cydeo.lab06orm.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
@Table(name = "orders")
public class Order extends BaseEntity{
    private BigDecimal paidPrice;
    private BigDecimal totalPrice;

    @OneToOne
    private Cart cart;

    @ManyToOne
    private Customer customer;

    @OneToOne
    private Payment payment;

    public Order(BigDecimal paidPrice, BigDecimal totalPrice, Cart cart, Customer customer, Payment payment) {
        this.paidPrice = paidPrice;
        this.totalPrice = totalPrice;
        this.cart = cart;
        this.customer = customer;
        this.payment = payment;
    }
}
