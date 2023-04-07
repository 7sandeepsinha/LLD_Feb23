package designPatterns.observer;

public class Client {
    public static void main(String[] args) {
        Amazon a = Amazon.getInstance(); // publisher
        CustomerNotifier customerNotifier = new CustomerNotifier(); // creating the subscriber and auto subscribing
        WMSNotifier wmsNotifier = new WMSNotifier();
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        a.orderPlaced();
        a.deRegisterSubscriber(wmsNotifier);
        a.orderPlaced();
    }
}
