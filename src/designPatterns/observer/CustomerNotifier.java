package designPatterns.observer;

public class CustomerNotifier implements OrderPlacedSubscriber, OrderCancelledSubsriber{

    public CustomerNotifier() {
        Amazon a = Amazon.getInstance();
        a.registerSubscriber(this);
        a.registerOrderCancelledSubscriber(this);
    }

    @Override
    public ReturnData orderPlaceEvent() {
        ReturnData returnData = new ReturnData("Notify all the customers");
        System.out.println("Notify all the customers");
        return returnData;
    }


    @Override
    public ReturnData orderCancelledEvent() {
        ReturnData returnData = new ReturnData("Notify all the customers for cancellation");
        System.out.println("Notify all the customers for cancellation");
        return returnData;
    }
}
