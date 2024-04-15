package org.example.template.ex3;

public class BrickHouse extends HouseTemplate{
    @Override
    protected void buildFoundation() {
        System.out.println("Building brick foundation.");

    }

    @Override
    protected void buildWalls() {
        System.out.println("Building brick walls.");

    }

    @Override
    protected void buildRoof() {
        System.out.println("Building brick roof.");

    }

    @Override
    protected void furnishHouse() {
        System.out.println("Furnishing the brick house.");
    }
    @Override
    protected boolean hasGarden() {
        return false;
    }


}
