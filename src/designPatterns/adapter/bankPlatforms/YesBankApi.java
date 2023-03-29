package designPatterns.adapter.bankPlatforms;

public class YesBankApi {
    public double checkBalance(){
        return 0.00;
    }

    public boolean authenticateUser(){
        return true;
    }

    public boolean transaction(){
        return true;
    }
}
