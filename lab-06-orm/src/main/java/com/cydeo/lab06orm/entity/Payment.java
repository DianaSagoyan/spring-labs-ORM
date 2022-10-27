package com.cydeo.lab06orm.entity;

import com.cydeo.lab06orm.enums.PaymentMethod;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
public class Payment extends BaseEntity {
    private BigDecimal paidPrice;

    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;

    public Payment(BigDecimal paidPrice, PaymentMethod paymentMethod) {
        this.paidPrice = paidPrice;
        this.paymentMethod = paymentMethod;
    }
}
