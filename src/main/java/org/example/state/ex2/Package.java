package org.example.state.ex2;

public class Package {
    private PackageState packageState = new OrderState();

    public PackageState getPackageState() {
        return packageState;
    }

    public void setPackageState(PackageState packageState) {
        this.packageState = packageState;
    }


    public void previousState(){
        packageState.prev(this);
    }

    public void nextState(){
        packageState.next(this);
    }

    public void printStatus(){
        packageState.printStatus();
    }

    @Override
    public String toString() {
        return "Package{" +
                "packageState=" + packageState +
                '}';
    }
}
