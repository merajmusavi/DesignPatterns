package org.example.observer.ex3;

public class DataSource extends Subject{
    private int value;

    public void setValue(int value) {
        this.value = value;
        notifyObservers();


    }

    public int getValue() {
        return value;
    }
}
