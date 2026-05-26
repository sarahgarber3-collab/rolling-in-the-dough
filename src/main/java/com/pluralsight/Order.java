package com.pluralsight;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;

public class Order {
    private ArrayList<Orderable> items;
    private LocalDateTime orderTime;

    public Order() {
        this.items = new ArrayList<>();
        this.orderTime = LocalDateTime.now();
    }

    public void addItem (Orderable item){
        items.add(item);

    }

    public ArrayList<Orderable> getItems() {
        return items;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public double getTotal(){
        return items.stream()
                .mapToDouble(item -> item.getPrice())
                .sum();
    }

    public ArrayList<Orderable> getItemsNewestFirst(){
        ArrayList<Orderable> copy = new ArrayList<>(items);
        Collections.reverse(copy);
        return copy;
    }

    public boolean isValid(){
        if (items.stream().anyMatch(item -> item instanceof Pizza)){
        return true;
        }

        if (items.stream().anyMatch(item -> item instanceof GarlicKnots || item instanceof Drink)){
            return true;

        }
        return false;
        }
}

