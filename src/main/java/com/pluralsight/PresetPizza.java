package com.pluralsight;

public class PresetPizza {
    public static Pizza rollingHawaiian(PizzaSize size, PizzaCrust crust) {
        Pizza pizza = new Pizza(size, crust);
        pizza.addTopping(new PremiumTopping("Sausage", 1.00, 2.00,
                3.00, .50, 1.00, 1.50, 0));
        pizza.addTopping(new PremiumTopping("Mozzarella", .75, 1.50,
                2.25, 0.30, 0.60, 0.90, 0));
        pizza.addTopping(new RegularTopping("Pineapple"));
        pizza.addTopping(new RegularTopping("Bell Peppers"));
        pizza.addTopping(new RegularTopping("Marinara"));
        return pizza;
    }

    public static Pizza rollingMargherita(PizzaSize size, PizzaCrust crust) {
        Pizza pizza = new Pizza(size, crust);
        pizza.addTopping(new PremiumTopping("Mozzarella", .75, 1.50,
                2.25, 0.30, 0.60, 0.90, 0));
        pizza.addTopping(new RegularTopping("Tomatoes"));
        pizza.addTopping(new RegularTopping("Basil"));
        pizza.addTopping(new RegularTopping("Marinara"));
        pizza.addTopping(new RegularTopping("Olive Oil"));
        return pizza;

    }
    public static Pizza rollingVeggie (PizzaSize size, PizzaCrust crust){
        Pizza pizza = new Pizza(size, crust);
        pizza.addTopping(new RegularTopping("Bell Peppers"));
        pizza.addTopping(new RegularTopping("Spinach"));
        pizza.addTopping(new RegularTopping("Olives"));
        pizza.addTopping(new RegularTopping("Onions"));
        pizza.addTopping(new RegularTopping("Marinara"));
        pizza.addTopping(new PremiumTopping("Mozzarella",.75, 1.50,
                2.25, 0.30, 0.60, 0.90, 0));
        return pizza;
    }
}
