package org.example;

public class Bouquet {
    private String name;
    private double price;

    public Bouquet(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setPrice(double price){
        this.price=price;
    }

    public double getPrice() {
        return price;
    }
}
