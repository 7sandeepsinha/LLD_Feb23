package designPatterns.decorator;

public class OrangeCone implements IceCream {
    private IceCream iceCream;

    public OrangeCone(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    public OrangeCone() {
    }


    @Override
    public int getCost() {
        if(iceCream == null)
            return 15;
        else
            return iceCream.getCost() + 15;
    }

    @Override
    public String getDescription() {
        if(iceCream == null)
            return "OrangeCone";
        else
            return iceCream.getDescription() + " OrangeCone";
    }
}
