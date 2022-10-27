package com.cydeo.lab06orm.entity;

import com.cydeo.lab06orm.enums.DiscountType;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.math.BigInteger;

@Entity
@Data
@NoArgsConstructor
public class Discount extends BaseEntity{
    private BigInteger discount;

    @Enumerated(EnumType.STRING)
    private DiscountType discountType;

    private String name;

    public Discount(BigInteger discount, DiscountType discountType, String name) {
        this.discount = discount;
        this.discountType = discountType;
        this.name = name;
    }
}
