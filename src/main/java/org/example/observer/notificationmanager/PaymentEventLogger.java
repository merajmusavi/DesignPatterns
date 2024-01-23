package org.example.observer.notificationmanager;

public class PaymentEventLogger implements PaymentListener {
    private void logEvent(){
        System.out.println("log");
    }

    @Override
    public void paymentMade() {
        logEvent();
    }
}
