package com.cydeo.lab06orm.entity;

import javax.persistence.*;
import java.math.BigInteger;

@MappedSuperclass
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id;
}
