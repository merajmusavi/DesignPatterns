package org.example.state.ex3;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        TvStartState tvStartState = new TvStartState();
        TvStopState tvStopState = new TvStopState();

        context.setTvState(tvStartState);

        context.doAction();
    }
}
