package org.example.state.ex2;

public class ReceivedState implements PackageState {
    @Override
    public void next(Package p) {
        System.out.println("there is no next state");

    }

    @Override
    public void prev(Package p) {
p.setPackageState(new DeliveredState());
    }

    @Override
    public void printStatus() {
        System.out.println("received state");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
