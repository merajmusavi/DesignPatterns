package org.example.state.ex2;

public class DeliveredState implements PackageState{
    @Override
    public void next(Package p) {
        p.setPackageState(new ReceivedState());
    }

    @Override
    public void prev(Package p) {
        p.setPackageState(new OrderState());
    }

    @Override
    public void printStatus() {
        System.out.println("current state is deliver state");
    }
}
