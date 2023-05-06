package com.scaler.SplitwiseMay2023.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ExpensePayingUser extends User {
    @ManyToOne
    private Expense expense;
    @ManyToOne
    private User user;
    private double amount;
}
