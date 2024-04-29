package org.example.observer.ex3;

public class Listener2 implements Observer{
    @Override
    public void update() {
        System.out.println("listener 2 got notified");
    }
}
