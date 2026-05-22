package com.pluralsight;

public class PizzaCrust {
    public static final PizzaCrust THIN = new PizzaCrust("Thin");
    public static final PizzaCrust REGULAR = new PizzaCrust("Regular");
    public static final PizzaCrust THICK = new PizzaCrust("Thick");
    public static final PizzaCrust CAULIFLOWER  = new PizzaCrust("Cauliflower");
    private String name;

    private PizzaCrust(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
