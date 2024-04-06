package org.example.strategy.ex3;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCard {
    List<Item> items;

    public ShoppingCard (){
        this.items = new ArrayList<Item>();

    }

    public void addItem(Item item) {
        this.items.add(item);
    }
    public void removeItem(Item item) {
       this.items.remove(item);
    }

    public int calculateTotal() {
        int sum = 0;
        for (Item item : items) {
            sum += item.getPrice();
        }
        return sum;
    }
    public void pay(PaymentStrategy paymentStrategy) {
        int amount = calculateTotal();
        paymentStrategy.pay(amount);
    }
}
