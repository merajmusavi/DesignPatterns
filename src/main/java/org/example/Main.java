package org.example;

import org.example.observer.NotificationManager;
import org.example.observer.PaymentEventLogger;
import org.example.observer.PaymentListener;
import org.example.observer.PaymentManager;

public class Main {
    public static void main(String[] args) {
        PaymentManager paymentManager = new PaymentManager();

        PaymentListener p1 =  new NotificationManager();
        paymentManager.registerListener(p1);

        PaymentListener p2 = new PaymentEventLogger();


        paymentManager.registerListener(p2);


        PaymentListener p3 = new NotificationManager();


        paymentManager.registerListener(p3);

        paymentManager.pay();
    }
}