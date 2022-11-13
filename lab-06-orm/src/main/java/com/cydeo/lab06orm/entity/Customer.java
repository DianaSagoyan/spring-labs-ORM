package com.cydeo.lab06orm.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Customer extends BaseEntity{
    private String email;
    private String firstName;
    private String lastName;
    private String userName;

}
