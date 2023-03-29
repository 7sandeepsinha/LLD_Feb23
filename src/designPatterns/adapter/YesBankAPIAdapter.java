package designPatterns.adapter;

import designPatterns.adapter.bankPlatforms.YesBankApi;

public class YesBankAPIAdapter implements BankAPIAdapter {

    private YesBankApi yesBankApi;

    public YesBankAPIAdapter() {
        this.yesBankApi = new YesBankApi();
    }

    @Override
    public double checkBalance() {
        return yesBankApi.checkBalance();
    }

    @Override
    public boolean authenticate() {
        return yesBankApi.authenticateUser();
    }

    @Override
    public boolean transaction() {
        return yesBankApi.transaction();
    }
}
