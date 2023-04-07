package designPatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Amazon {
    private List<OrderPlacedSubscriber> orderPlacedSubscribers; //WMS, Customer, Invoice
    private List<OrderCancelledSubsriber> orderCancelledSubscribers; // Customer
    private static Amazon instance;

    private Amazon() {
        this.orderPlacedSubscribers = new ArrayList<>();
        this.orderCancelledSubscribers = new ArrayList<>();
    }

    public static Amazon getInstance() { //TODO -> make it thread safe
        if(instance == null)
            instance = new Amazon();
        return instance;
    }

    public void registerSubscriber(OrderPlacedSubscriber orderPlacedSubscriber){
        orderPlacedSubscribers.add(orderPlacedSubscriber);
    }

    public void deRegisterSubscriber(OrderPlacedSubscriber orderPlacedSubscriber){
        orderPlacedSubscribers.remove(orderPlacedSubscriber);
    }

    public void registerOrderCancelledSubscriber(OrderCancelledSubsriber orderCancelledSubsriber){
        orderCancelledSubscribers.add(orderCancelledSubsriber);
    }

    public void deRegisterOrderCancelledSubscriber(OrderCancelledSubsriber orderCancelledSubsriber){
        orderCancelledSubscribers.remove(orderCancelledSubsriber);
    }

    public void orderPlaced(){
        //customerNotifier.notify()
        //WMSNotifier.notify()
        //InvoiceGenerator.generate()
        for(OrderPlacedSubscriber orderPlacedSubscriber : orderPlacedSubscribers){
            orderPlacedSubscriber.orderPlaceEvent();
        }
    }

    public void orderCancelled(){
        for(OrderCancelledSubsriber cancelledSubsriber : orderCancelledSubscribers){
            cancelledSubsriber.orderCancelledEvent();
        }
    }
}

/*
    For every subscriber we are creating a new object
    Amazon a1 -> CustomerNotifier
    Amazon a2 -> WMSNotifier
    Amazon a3 -> InvoiceGenerator
 */