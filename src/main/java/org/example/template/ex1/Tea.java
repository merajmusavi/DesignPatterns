package org.example.template.ex1;

public class Tea extends HotBeverage{
    @Override
   protected void brew() {
        System.out.println("steeping the tea");
    }

    @Override
   protected void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
