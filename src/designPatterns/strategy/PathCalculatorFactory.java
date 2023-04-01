package designPatterns.strategy;

public class PathCalculatorFactory {

    public static PathCalculatorStrategy getPathCalculator(String mode){
        //TODO -> change this to switch case and Enums
        if(mode.equals("CAR")){
            return CarPathCalculator.getInstance();
        } else if(mode.equals("BIKE")) {
            return BikePathCalculator.getInstance();
        } else {
            return WalkPathCalculator.getInstance();
        }
    }
}
