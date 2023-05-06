package com.scaler.SplitwiseMay2023.service.settleUp.strategies;

import com.scaler.SplitwiseMay2023.dtos.Transaction;
import com.scaler.SplitwiseMay2023.dtos.UserAmountPair;
import com.scaler.SplitwiseMay2023.model.ExpenseOwingUser;
import com.scaler.SplitwiseMay2023.model.ExpensePayingUser;
import com.scaler.SplitwiseMay2023.model.User;

import java.util.*;

public class MinMaxSettleUpStrategy implements SettleUpTransactionCalculatorStrategy{
    @Override
    public List<Transaction> getTransactions(List<ExpenseOwingUser> expenseOwingUsers, List<ExpensePayingUser> expensePayingUsers) {
        HashMap<User, Double> debtCollectionMap = new HashMap<>();

        //Calculating the total borrowed or lended amount for each user. Map will store the same.
        //update the owing users with negative value
        for(ExpenseOwingUser expenseOwingUser : expenseOwingUsers){
            if(debtCollectionMap.containsKey(expenseOwingUser.getUser())){ // if any entry the user is present
                double currentAmount = debtCollectionMap.get(expenseOwingUser.getUser()); //get the current amount
                double updatedAmount = currentAmount - expenseOwingUser.getAmount();
                debtCollectionMap.put(expenseOwingUser.getUser(), updatedAmount);
            } else {
                debtCollectionMap.put(expenseOwingUser.getUser(), -1 * (expenseOwingUser.getAmount()));
            }
        }

        //update the paying users with positive value
        for(ExpensePayingUser expensePayingUser : expensePayingUsers){
            if(debtCollectionMap.containsKey(expensePayingUser.getUser())){ // if any entry the user is present
                double currentAmount = debtCollectionMap.get(expensePayingUser.getUser()); //get the current amount
                double updatedAmount = currentAmount + expensePayingUser.getAmount();
                debtCollectionMap.put(expensePayingUser.getUser(), updatedAmount);
            } else {
                debtCollectionMap.put(expensePayingUser.getUser(),expensePayingUser.getAmount());
            }
        }

        //Start getting the transactions

        //Creating two buckets -> borrowers (minheap) and lendors(maxHeap)

        //minHeap => borrowers
        PriorityQueue<UserAmountPair> borrowersMinHeap = new PriorityQueue<>(Comparator.comparingDouble(UserAmountPair::getAmount));
        //maxHeap => lendors
        PriorityQueue<UserAmountPair> lendorsMaxHeap = new PriorityQueue<>(Comparator.comparingDouble(UserAmountPair::getAmount).reversed());
        for(Map.Entry<User,Double> userAmount : debtCollectionMap.entrySet()){
            if(userAmount.getValue() < 0){
                borrowersMinHeap.add(new UserAmountPair(userAmount.getKey(), userAmount.getValue()));
            } else if(userAmount.getValue() > 0){
                lendorsMaxHeap.add(new UserAmountPair(userAmount.getKey(), userAmount.getValue()));
            }
        }

        while(borrowersMinHeap.size() > 0){
            //logic
        }
    }
}
