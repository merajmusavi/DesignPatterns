package org.example.observer.stockmarket2;

public interface Observer {
    void update(String stockSymbol, double stockPrice);

}
