package designPatterns.decorator;

public class VanillaCone implements IceCream{
    private IceCream iceCream;

    //when vanilla cone is used as a base
    public VanillaCone() {
    }

    //when vanilla cone is used as a topping
    public VanillaCone(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        if(iceCream == null)
            return 10;
        else
            return iceCream.getCost() + 10;
    }

    @Override
    public String getDescription() {
        if(iceCream == null)
            return "VanillaCone";
        else
            return iceCream.getDescription() + " VanillaCone";
    }
}
