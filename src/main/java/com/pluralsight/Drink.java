package com.pluralsight;

public class Drink implements Orderable {
    private DrinkSize size;
    private String flavor;

    public Drink(DrinkSize size, String flavor) {
        this.size = size;
        this.flavor = flavor;
    }

    public DrinkSize getSize() {
        return size;
    }

    public String getFlavor() {
        return flavor;
    }
    @Override
    public double getPrice() {
        return size.getPrice();
    }
    @Override
    public String toString(){
        return String.format("%s | %s — $%.2f", size.getName(), this.flavor, getPrice());

    }
}
