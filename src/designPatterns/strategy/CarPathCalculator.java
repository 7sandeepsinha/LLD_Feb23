package designPatterns.strategy;

public class CarPathCalculator implements PathCalculatorStrategy {
    private static CarPathCalculator instance;

    private CarPathCalculator() {
    }

    @Override
    public void findPath(String source, String destination) {
        System.out.println("Path from source to destination using CAR");
    }

    public static CarPathCalculator getInstance(){
        if(instance == null){
            synchronized (CarPathCalculator.class){
                if(instance == null) {
                    instance = new CarPathCalculator();
                }
            }
        }
        return instance;
    }
}
