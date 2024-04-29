package org.example.observer.stockmarket2;


public class StockTrader implements Observer {

    private String traderName;

    public StockTrader(String traderName) {
        this.traderName = traderName;
    }

    @Override
    public void update(String stockSymbol, double stockPrice) {
        System.out.println(traderName + " received" + "new price : " + stockPrice + "for " + stockSymbol);
    }
}
