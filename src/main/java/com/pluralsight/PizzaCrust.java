package com.pluralsight;

public class PizzaCrust {
    public static final PizzaCrust thin = new PizzaCrust("Thin");
    public static final PizzaCrust regular = new PizzaCrust("Regular");
    public static final PizzaCrust thick = new PizzaCrust("Thick");
    public static final PizzaCrust cauliflower  = new PizzaCrust("Cauliflower");
    private String name;

    public PizzaCrust(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
