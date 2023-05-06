package com.scaler.SplitwiseMay2023.dtos;

import com.scaler.SplitwiseMay2023.model.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserAmountPair {
    private User user;
    private double amount;

    public UserAmountPair(User user, double amount) {
        this.user = user;
        this.amount = amount;
    }
}
