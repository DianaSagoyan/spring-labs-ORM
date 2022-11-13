package com.cydeo.lab06orm.entity;

import com.cydeo.lab06orm.enums.CartState;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Cart extends BaseEntity{
    @Enumerated(EnumType.STRING)
    private CartState cartState;

    @ManyToOne(fetch = FetchType.LAZY)
    private Customer customer;
    @ManyToOne(fetch = FetchType.LAZY)
    private Discount discount;

}
