package com.scaler.SplitwiseMay2023.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Expense extends BaseModel {
    private double amount;
    @ManyToOne
    private User createdBy; // One user can create many expenses -> Many to One -> User to Expense
    private String description;
    private Date createdAt;
    @ManyToOne
    private Currency baseCurrency; // One currency can have many expenses
    @ManyToMany
    private List<User> participants; // One User can have many expenses, one expense can have many users
}
