package com.cydeo.lab06orm.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Address extends BaseEntity{
    private String name;
    private String street;
    private String zipCode;

    @ManyToOne(fetch = FetchType.LAZY)
    private Customer customer;

    public Address(String name, String street, String zipCode, Customer customer) {
        this.name = name;
        this.street = street;
        this.zipCode = zipCode;
        this.customer = customer;
    }
}
