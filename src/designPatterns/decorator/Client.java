package designPatterns.decorator;

public class Client {
    public static void main(String[] args) {
        IceCream ic = new VanillaCone(
                        new OrangeCone(
                            new ChocolateScoop(
                                new VanillaCone(
                                    new ChocoChip(
                                        new ChocolateScoop(
                                            new OrangeCone()))))));

        System.out.println("IceCream cost : " + ic.getCost());
        System.out.println("IceCream desc : " + ic.getDescription());
    }
}
