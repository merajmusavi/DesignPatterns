package org.example.observer.stockmarket2;

public class Main
{
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();
        StockTrader stockTrader = new StockTrader("ahmad");
        stockMarket.registerObserver(stockTrader);
        stockTrader.update("pride",120);
    }
}
