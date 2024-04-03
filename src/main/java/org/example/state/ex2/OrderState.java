package org.example.state.ex2;

public class OrderState implements PackageState{
    @Override
    public void next(Package p) {
        p.setPackageState(new DeliveredState());
    }

    @Override
    public void prev(Package p) {
        System.out.println("there is no prev state for this state");
    }

    @Override
    public void printStatus() {
        System.out.println("current state is order state");
    }
}
