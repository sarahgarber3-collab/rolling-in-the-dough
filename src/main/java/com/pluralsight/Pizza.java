package com.pluralsight;

import java.util.ArrayList;

public class Pizza {
    private PizzaSize size;
    private PizzaCrust crust;
    private ArrayList<Topping> toppings;
    private boolean stuffedCrust;

    public Pizza(PizzaSize size, PizzaCrust crust) {
        this.size = size;
        this.crust = crust;
        this.toppings = new ArrayList<>();

    }
}
