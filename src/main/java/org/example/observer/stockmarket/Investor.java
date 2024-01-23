package org.example.observer.stockmarket;

public class Investor {

    private String name;

    public Investor(String name){
        this.name = name;

    }

    public void update(String price,String product){
        System.out.println("new update for product "+ product + "with price "+ price+ "sent to the "+ name);

    }
}
