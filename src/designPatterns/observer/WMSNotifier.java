package designPatterns.observer;

public class WMSNotifier implements OrderPlacedSubscriber{
    public WMSNotifier() {
        Amazon a = Amazon.getInstance();
        a.registerSubscriber(this);
    }

    @Override
    public ReturnData orderPlaceEvent() {
        ReturnData returnData = new ReturnData("Updating WMS after order placed");
        System.out.println("Updating WMS after order placed");
        return returnData;
    }
}
