package com.pluralsight;

public class DrinkSize {
    public static final DrinkSize SMALL = new DrinkSize("Small",2.00 );
    public static final DrinkSize MEDIUM = new DrinkSize("Medium", 2.50);
    public static final DrinkSize LARGE = new DrinkSize("Large",3.00);
    private String name;
    private double price;

    private DrinkSize(String name, double price) {
        this.name = name;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
