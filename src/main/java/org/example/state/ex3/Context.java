package org.example.state.ex3;

public class Context implements State {
    private State tvState;

    public void setTvState(State tvState) {
        this.tvState = tvState;
    }

    public State getTvState() {
        return this.tvState;
    }


    @Override
    public void doAction() {
        this.tvState.doAction();
    }
}
