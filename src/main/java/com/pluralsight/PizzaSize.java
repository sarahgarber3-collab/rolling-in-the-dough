package com.pluralsight;

public class PizzaSize {
    public static final PizzaSize PERSONAL = new PizzaSize("Personal", 8.50);
    public static final PizzaSize MEDIUM = new PizzaSize("Medium", 12.00);
    public static final PizzaSize LARGE = new PizzaSize("Large", 16.50);
    private String size;
    private double price;

    private PizzaSize( String size, double price) {
        this.size = size;
        this.price = price;

    }

    public String getSize() {
        return size;
    }

    public double getBasePrice() {
        return price;
    }
}

