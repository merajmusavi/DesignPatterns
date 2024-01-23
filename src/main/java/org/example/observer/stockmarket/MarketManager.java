package org.example.observer.stockmarket;

import java.util.ArrayList;
import java.util.List;

public class MarketManager {
    List<Investor> investors = new ArrayList<>();
    public void registerObserver(Investor investor){
        investors.add(investor);
    }


    public void unregisterObserver(Investor investor){
        investors.remove(investor);
    }


    public void notifyObservers(String price,String productName){
        for (Investor investor : investors) {
            investor.update(price,productName);
        }
    }

    public void updateProduct(String product,String price){
        System.out.println("new price for "+product+"with price of"+price);
        notifyObservers(price,product);
    }
}
