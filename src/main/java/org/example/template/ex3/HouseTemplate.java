package org.example.template.ex3;

public abstract class HouseTemplate {

    public final void buildHouse() {
        buildFoundation();
        buildWalls();
        buildRoof();
        furnishHouse();
        if (hasGarden()) {
            buildGarden();
        }
    }

    protected abstract void buildFoundation();

    protected abstract void buildWalls();

    protected abstract void buildRoof();

    protected abstract void furnishHouse();

    protected boolean hasGarden() {
        return true;
    }
    protected void buildGarden() {
        System.out.println("Building a beautiful garden.");
    }
}
