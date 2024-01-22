package org.example.observer;

import java.util.ArrayList;
import java.util.List;

public class PaymentManager {

    private final List<PaymentListener> paymentListeners = new ArrayList<>();
   public void pay(){
       paymentListeners.forEach(p -> p.paymentMade());


    }

    public void registerListener(PaymentListener paymentListener){
       paymentListeners.add(paymentListener);
    }
    public void unregisterListener(PaymentListener paymentListener){
       paymentListeners.remove(paymentListener);
    }
}
