package designPatterns.observer;

public class CustomerNotifier implements OrderPlacedSubscriber {

    public CustomerNotifier() {
        Amazon a = Amazon.getInstance();
        a.registerSubscriber(this);
    }

    @Override
    public ReturnData orderPlaceEvent() {
        ReturnData returnData = new ReturnData("Notify all the customers");
        System.out.println("Notify all the customers");
        return returnData;
    }


}
