package designPatterns.strategy;

public class BikePathCalculator implements PathCalculatorStrategy {
    private static BikePathCalculator instance;

    private BikePathCalculator() {
    }

    @Override
    public void findPath(String source, String destination) {
        System.out.println("Path from source to destination using BIKE");
    }

    public static BikePathCalculator getInstance(){
        if(instance == null){
            synchronized (BikePathCalculator.class){
                if(instance == null) {
                    instance = new BikePathCalculator();
                }
            }
        }
        return instance;
    }
}
