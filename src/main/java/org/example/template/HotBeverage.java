package org.example.template;

abstract class HotBeverage {
    public final void prepare() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

   protected abstract void brew();

    protected  abstract void addCondiments();

    void boilWater() {
        System.out.println("boiling watter");
    }

    void pourInCup() {
        System.out.println("pouring in cup");
    }
}
