package com.scaler.SplitwiseMay2023.service.settleUp.strategies;

import com.scaler.SplitwiseMay2023.dtos.Transaction;
import com.scaler.SplitwiseMay2023.model.ExpenseOwingUser;
import com.scaler.SplitwiseMay2023.model.ExpensePayingUser;

import java.util.List;

public class GiveToNextSettleUpStrategy implements SettleUpTransactionCalculatorStrategy{
    @Override
    public List<Transaction> getTransactions(List<ExpenseOwingUser> expenseOwingUsers, List<ExpensePayingUser> expensePayingUser) {
        return null;
    }
}
