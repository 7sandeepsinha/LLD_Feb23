package com.scaler.BMSApr23.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
public class Payment extends BaseModel{
    private double amount;
    private Date timeStamp;
    private String transactionNo;
    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;
    @OneToOne
    private Ticket ticket;
}

/*
 Payment : PaymentStatus : -> M:1
 1 - Successful or failure or inprogress
 100 payments -> 95 successful, 3 failed, 2 in progress
 Successful -> P1, P2, P3
 Payment : Ticket -> 1:1
 */