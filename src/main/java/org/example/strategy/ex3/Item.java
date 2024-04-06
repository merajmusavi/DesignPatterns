package org.example.strategy.ex3;

public class Item

{
private String upCode;
private int price;

    public Item(String upCode, int price) {
        this.upCode = upCode;
        this.price = price;
    }

    public String getUpcCode() {
        return upCode;
    }

    public int getPrice() {
        return price;
    }
}
