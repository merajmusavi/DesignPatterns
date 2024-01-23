package org.example;

import org.example.observer.notificationmanage.NotificationManager;
import org.example.observer.notificationmanage.PaymentEventLogger;
import org.example.observer.notificationmanage.PaymentListener;
import org.example.observer.notificationmanage.PaymentManager;
import org.example.observer.stockmarket.Investor;
import org.example.observer.stockmarket.MarketManager;

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
        MarketManager marketManager = new MarketManager();
        Investor investor = new Investor("meraj");
        Investor investor2 = new Investor("ali");

        marketManager.registerObserver(investor);
        marketManager.registerObserver(investor2);


        marketManager.unregisterObserver(investor2);
        marketManager.notifyObservers("333","aboool");
    }
}