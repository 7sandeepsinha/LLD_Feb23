package designPatterns.observer;

public interface OrderPlacedSubscriber {
    ReturnData orderPlaceEvent(); // action that needs to be performed once the order placed event is consumed
}
// Any class that wants to listen to OrderPlaced event will implement this interface
//