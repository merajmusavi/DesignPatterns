package org.example.observer.notificationmanage;

public class PaymentEventLogger implements PaymentListener {
    private void logEvent(){
        System.out.println("log");
    }

    @Override
    public void paymentMade() {
        logEvent();
    }
}
