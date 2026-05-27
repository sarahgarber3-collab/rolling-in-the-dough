package com.pluralsight;

import java.util.ArrayList;

public class Pizza implements Orderable{
    private PizzaSize size;
    private PizzaCrust crust;
    private ArrayList<Topping> toppings;
    private boolean stuffedCrust;

    public Pizza(PizzaSize size, PizzaCrust crust) {
        this.size = size;
        this.crust = crust;
        this.toppings = new ArrayList<>();

    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

    public PizzaSize getSize() {
        return size;
    }

    public PizzaCrust getCrust() {
        return crust;
    }

    public ArrayList<Topping> getToppings() {
        return toppings;
    }

    public boolean isStuffedCrust() {
        return stuffedCrust;
    }

    public void setStuffedCrust(boolean stuffedCrust) {
        this.stuffedCrust = stuffedCrust;
    }

    public double getPrice() {
        double total = size.getBasePrice();
        total += toppings.stream()
                .mapToDouble(t -> t.getPrice(this.size))
                .sum();
        return total;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(size.getSize() + "Pizza");
        sb.append(" | ");
        sb.append(crust.getName() + "Crust");
        sb.append("\n");
        sb.append(stuffedCrust ? "Stuffed Crust" : "No Stuffed Crust");
        sb.append("\n");
        toppings.stream()
                .forEach(t -> sb.append("- ")
                                        .append(t.toString())
                                        .append("\n"));
        sb.append("Price: $");
        sb.append(String.format("%.2f", getPrice()));
        sb.append("\n");
        return sb.toString();
    }
}