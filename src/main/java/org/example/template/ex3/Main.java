package org.example.template.ex3;

public class Main {
    public static void main(String[] args) {
        HouseTemplate woodenHouse = new WoodenHouse();
        woodenHouse.buildHouse();
        System.out.println("------------------------");
        HouseTemplate brickHouse = new BrickHouse();
        brickHouse.buildHouse();

    }
}
