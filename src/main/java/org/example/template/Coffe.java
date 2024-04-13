package org.example.template;

public class Coffe extends HotBeverage {
    @Override
   protected void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
   protected void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}
