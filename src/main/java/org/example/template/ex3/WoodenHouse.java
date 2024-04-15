package org.example.template.ex3;

public class WoodenHouse extends HouseTemplate {
    @Override
    protected void buildFoundation() {
        System.out.println("Building wooden foundation.");

    }

    @Override
    protected void buildWalls() {
        System.out.println("Building wooden walls.");

    }

    @Override
    protected void buildRoof() {
        System.out.println("Building wooden roof.");

    }

    @Override
    protected void furnishHouse() {
        System.out.println("Furnishing the wooden house.");
    }
}
