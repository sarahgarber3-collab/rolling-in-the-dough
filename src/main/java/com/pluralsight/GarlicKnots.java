package com.pluralsight;

public class GarlicKnots implements Orderable{

    @Override
    public double getPrice() {
        return 1.50;
    }
    @Override
    public String toString(){
        return String.format("Garlic Knots — $%.2f ", getPrice());
    }
}

