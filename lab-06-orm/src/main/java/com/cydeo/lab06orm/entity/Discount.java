package com.cydeo.lab06orm.entity;

import com.cydeo.lab06orm.enums.DiscountType;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.math.BigInteger;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Discount extends BaseEntity{
    private BigInteger discount;

    @Enumerated(EnumType.STRING)
    private DiscountType discountType;

    private String name;


}
