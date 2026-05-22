package com.pluralsight;

abstract public class Topping {
    private String name;

    public Topping(String name) {
        this.name = name;
    }
    public abstract double getPrice(PizzaSize size);
}

