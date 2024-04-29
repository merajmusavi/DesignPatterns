package org.example.observer.ex3;

public class Listener1 implements Observer{
    @Override
    public void update() {
        System.out.println("listener 1 got notified");
    }
}
