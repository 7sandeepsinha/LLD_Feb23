package designPatterns.adapter;

public interface BankAPIAdapter {
    double checkBalance();
    boolean authenticate();
    boolean transaction();
}
