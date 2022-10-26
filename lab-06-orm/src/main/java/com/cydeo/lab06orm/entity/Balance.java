package com.cydeo.lab06orm.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
@Table(name = "balance")
public class Balance extends BaseEntity{
    private BigDecimal amount;

    @OneToOne(fetch = FetchType.LAZY)
    private Customer customer;
}
