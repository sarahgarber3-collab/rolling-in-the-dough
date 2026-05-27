package com.pluralsight;

import java.util.ArrayList;
import java.util.Locale;

public class PizzaBuilder {
    private ArrayList<PremiumTopping> meats;
    private ArrayList<PremiumTopping> cheeses;
    private ArrayList<RegularTopping> regularToppings;
    private ArrayList<RegularTopping> sauces;
    private ArrayList<RegularTopping> sides;

    public PizzaBuilder() {
        meats = new ArrayList<>();
        cheeses = new ArrayList<>();
        regularToppings = new ArrayList<>();
        sauces = new ArrayList<>();
        sides = new ArrayList<>();

        meats.add(new PremiumTopping("Pepperoni", 1.00, 2.00,
                3.00, 0.50, 1.00, 1.50, 0));
        meats.add(new PremiumTopping("Sausage", 1.00, 2.00,
                3.00, .50, 1.00, 1.50, 0));
        meats.add(new PremiumTopping("Ham", 1.00, 2.00,
                3.00, .50, 1.00, 1.50, 0));
        meats.add(new PremiumTopping("Bacon", 1.00, 2.00,
                3.00, .50, 1.00, 1.50, 0));
        meats.add(new PremiumTopping("Chicken", 1.00, 2.00,
                3.00, .50, 1.00, 1.50, 0));
        meats.add(new PremiumTopping("Meatball", 1.00, 2.00,
                3.00, .50, 1.00, 1.50, 0));

        cheeses.add(new PremiumTopping("Mozzarella", .75, 1.50,
                2.25, 0.30, 0.60, 0.90, 0));
        cheeses.add(new PremiumTopping("Parmesan", .75, 1.50,
                2.25, 0.30, 0.60, 0.90, 0));
        cheeses.add(new PremiumTopping("Ricotta", .75, 1.50,
                2.25, 0.30, 0.60, 0.90, 0));
        cheeses.add(new PremiumTopping("Goat Cheese", .75, 1.50,
                2.25, 0.30, 0.60, 0.90, 0));
        cheeses.add(new PremiumTopping("Buffalo", .75, 1.50,
                2.25, 0.30, 0.60, 0.90, 0));

        regularToppings.add(new RegularTopping("Onions"));
        regularToppings.add(new RegularTopping("Mushrooms"));
        regularToppings.add(new RegularTopping("Bell Peppers"));
        regularToppings.add(new RegularTopping("olives"));
        regularToppings.add(new RegularTopping("Tomatoes"));
        regularToppings.add(new RegularTopping("Spinach"));
        regularToppings.add(new RegularTopping("Basil"));
        regularToppings.add(new RegularTopping("Pineapple"));
        regularToppings.add(new RegularTopping("Anchovies"));

        sauces.add(new RegularTopping("Marinara"));
        sauces.add(new RegularTopping("Alfredo"));
        sauces.add(new RegularTopping("Pesto"));
        sauces.add(new RegularTopping("BBQ"));
        sauces.add(new RegularTopping("Buffalo"));
        sauces.add(new RegularTopping("Olive Oil"));

        sides.add(new RegularTopping("Red Pepper"));
        sides.add(new RegularTopping("Parmesan"));

    }

    public Pizza run() {
        PizzaSize size = selectSize();
        PizzaCrust crust = selectCrust();
        Pizza pizza = new Pizza(size, crust);
        selectToppings(pizza);
        askStuffedCrust(pizza);
        return pizza;
    }

    private PizzaSize selectSize() {

        while(true) {
            System.out.println("Pizza Size Options");
            System.out.println("\t1) Personal(8inch) - $8.50");
            System.out.println("\t2) Medium(12inch) - $12.00");
            System.out.println("\t3) Large(16inch) - $16.50");
            System.out.print("Select Pizza Size: ");
            int pizzaOption = Main.scanner.nextInt();
            Main.scanner.nextLine();

            switch (pizzaOption) {
                case 1: return PizzaSize.PERSONAL;
                case 2: return PizzaSize.MEDIUM;
                case 3: return PizzaSize.LARGE;
                default: System.out.println("Invalid option, no Pizza added. Try again.");

            }
        }

    }
    private PizzaCrust selectCrust() {
        while (true) {
            System.out.println("Crust Options");
            System.out.println("\t1) Thin");
            System.out.println("\t2) Regular");
            System.out.println("\t3) Thick");
            System.out.println("\t4) Cauliflower");
            System.out.print("Select Pizza Crust Option: ");
            int crustOption = Main.scanner.nextInt();
            Main.scanner.nextLine();

            switch (crustOption) {
                case 1:
                    return PizzaCrust.THIN;
                case 2:
                    return PizzaCrust.REGULAR;
                case 3:
                    return PizzaCrust.THICK;
                case 4:
                    return PizzaCrust.CAULIFLOWER;
                default:
                    System.out.println("Invalid option, no Pizza Crust added. Try again.");


            }
        }
    }
    private void selectToppings(Pizza pizza){

    }
    private void askStuffedCrust(Pizza pizza){
        System.out.println("Would you like Stuffed Crust? Type Yes or No : ");
        String answer = Main.scanner.nextLine();

        if(answer.equalsIgnoreCase("yes")){
            pizza.setStuffedCrust(true);
        }



    }
}
