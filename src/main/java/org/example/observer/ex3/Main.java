package org.example.observer.ex3;

public class Main {
    public static void main(String[] args) {
        DataSource dataSource = new DataSource();
        Listener1 listener1 = new Listener1();
        Listener2 listener2 = new Listener2();
        dataSource.addObserver(listener2);
        dataSource.addObserver(listener1);

        dataSource.setValue(23);
    }
}
