package designPatterns.strategy;

public class Maps {
    public void findPath(String source, String destination, String mode){
        PathCalculatorStrategy pathCalculator = PathCalculatorFactory.getPathCalculator(mode);
        pathCalculator.findPath(source, destination);
    }
}
