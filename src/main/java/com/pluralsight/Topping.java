package com.pluralsight;

abstract public class Topping {
    protected String name;

    public Topping(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double getPrice(PizzaSize size);

    @Override
    public String toString(){
        return getName();
    }
}

