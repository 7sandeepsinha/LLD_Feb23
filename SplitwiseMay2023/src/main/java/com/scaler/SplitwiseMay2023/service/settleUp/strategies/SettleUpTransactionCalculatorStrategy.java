package com.scaler.SplitwiseMay2023.service.settleUp.strategies;

import com.scaler.SplitwiseMay2023.dtos.Transaction;
import com.scaler.SplitwiseMay2023.model.ExpenseOwingUser;
import com.scaler.SplitwiseMay2023.model.ExpensePayingUser;

import java.util.List;

public interface SettleUpTransactionCalculatorStrategy {

    List<Transaction> getTransactions(List<ExpenseOwingUser> expenseOwingUsers,
                                      List<ExpensePayingUser> expensePayingUser);
}
