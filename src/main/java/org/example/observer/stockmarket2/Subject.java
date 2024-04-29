package org.example.observer.stockmarket2;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);

    void notifyObservers();
}
