package org.example.observer.stockmarket2;

import javax.swing.plaf.ListUI;
import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Subject{

    private List<Observer> list;
    private String stockSymbol;
    private double stockPrice;
    public StockMarket(){
        list = new ArrayList<>();
    }

    public void setStockPriceStockSymbol(double stockPrice,String stockSymbol) {
        this.stockPrice = stockPrice;
        this.stockSymbol = stockSymbol;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : list) {
            observer.update(stockSymbol,stockPrice);
        }
    }
}
