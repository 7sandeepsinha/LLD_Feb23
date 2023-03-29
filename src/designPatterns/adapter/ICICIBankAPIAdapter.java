package designPatterns.adapter;

import designPatterns.adapter.bankPlatforms.ICICIBankApi;

public class ICICIBankAPIAdapter implements BankAPIAdapter {

    private ICICIBankApi iciciBankApi;

    public ICICIBankAPIAdapter() {
        this.iciciBankApi = new ICICIBankApi();
    }

    @Override
    public double checkBalance() {
        return iciciBankApi.queryBalance();
    }

    @Override
    public boolean authenticate() {
        if(iciciBankApi.checkUser() == 1)
            return true;
        else
            return false;
    }

    @Override
    public boolean transaction() {
        if(iciciBankApi.transfer() == 1)
            return true;
        else
            return false;
    }
}
