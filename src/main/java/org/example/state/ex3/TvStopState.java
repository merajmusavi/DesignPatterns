package org.example.state.ex3;

public class TvStopState implements State {
    @Override
    public void doAction() {
        System.out.println("tv is turned off!");
    }
}

