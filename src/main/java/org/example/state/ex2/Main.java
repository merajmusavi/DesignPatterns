package org.example.state.ex2;

public class Main {
    public static void main(String[] args) {
        Package p = new Package();

        System.out.println(p.getPackageState());


        p.setPackageState(new DeliveredState());


        System.out.println(p.getPackageState());


    }
}
