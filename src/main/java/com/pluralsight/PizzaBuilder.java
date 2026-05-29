package com.pluralsight;

import java.util.ArrayList;


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
        regularToppings.add(new RegularTopping("Olives"));
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
        while (true) {
            System.out.println("\n---Pizza Options---");
            System.out.println("\t1) Create your own Pizza?");
            System.out.println("\t2) Select a Pizza Special from Menu");
            System.out.print("Select from the options: ");
            int userOption = Main.scanner.nextInt();
            Main.scanner.nextLine();

            switch (userOption) {
                case 1:
                    PizzaSize size = selectSize();
                    PizzaCrust crust = selectCrust();
                    Pizza pizza = new Pizza(size, crust);
                    selectToppings(pizza);
                    askStuffedCrust(pizza);
                    return pizza;

                case 2:
                    return selectSignaturePizza();


                default:
                    System.out.println("Invalid option, no Pizza added. Try again.");


            }
        }
    }

    private Pizza selectSignaturePizza() {

            System.out.println("\n---Pizza Menu Options---");
            System.out.println("\t1) Rolling Hawaiian");
            System.out.println("\t - Sausage, Mozzarella, Pineapple, Bell Peppers, Marinara");
            System.out.println("\t2) Rolling Margherita");
            System.out.println("\t -Mozzarella, Tomatoes, Basil, Marinara, Olive Oil");
            System.out.println("\t3) Rolling Veggie");
            System.out.println("\t -Bell Peppers, Spinach, Olives, Onions, Marinara, Mozzarella");
            System.out.print("Select from the above Menu: ");
            int menuOption = Main.scanner.nextInt();
            Main.scanner.nextLine();

            PizzaSize size = selectSize();
            PizzaCrust crust = selectCrust();
            Pizza pizza;

            switch (menuOption) {
                case 1:
                    pizza = PresetPizza.rollingHawaiian(size, crust);
                    break;
                case 2:
                    pizza = PresetPizza.rollingMargherita(size, crust);
                    break;
                case 3:
                    pizza = PresetPizza.rollingVeggie(size, crust);
                    break;
                default:
                    System.out.println("Invalid option, defaulting to custom Pizza.");
                    pizza = new Pizza(size, crust);
            }
            selectToppings(pizza);
            askStuffedCrust(pizza);
            return pizza;


    }

    private PizzaSize selectSize() {

        while(true) {
            System.out.println("\n---Pizza Size Options---");
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
            System.out.println("\n---Crust Options---");
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
    private void selectToppings(Pizza pizza) {

        boolean choosingToppings = true;

        while(choosingToppings) {
            System.out.println("\n---Pizza Topping Options---");
            System.out.println("\t1) Meat");
            System.out.println("\t2) Cheese");
            System.out.println("\t3) Other Toppings");
            System.out.println("\t4) Sauces");
            System.out.println("\t5) Sides");
            System.out.println("\t6) Remove a Topping");
            System.out.println("\t0) Done adding/removing toppings");
            System.out.print("Select a topping option: ");
            int toppingOption = Main.scanner.nextInt();
            Main.scanner.nextLine();

            switch (toppingOption) {
                case 1:
                    System.out.println("Meat Options:");
                    handlePremiumCategory(meats, pizza);
                    break;

                case 2:
                    System.out.println("Cheese Options:");
                    handlePremiumCategory(cheeses, pizza);
                    break;

                case 3:
                    System.out.println("Other Toppings:");
                    handleRegularCategory(regularToppings, pizza);
                    break;

                case 4:
                    System.out.println("Sauce Options:");
                    handleRegularCategory(sauces, pizza);
                    break;

                case 5:
                    System.out.println("Side Options:");
                    handleRegularCategory(sides, pizza);
                    break;
                case 6:
                    handleRemoving(pizza);
                    break;
                case 0:
                    choosingToppings = false;
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
    private void handleRemoving(Pizza pizza){
        if (pizza.getToppings().isEmpty()) {
            System.out.println("There are no toppings to remove");
            return;
        }
        boolean removeMore = true;

        while (removeMore) {
            for (int i = 0; i < pizza.getToppings().size(); i++) {
                System.out.println("\t" + (i + 1) + ") " + pizza.getToppings().get(i).getName());
            }

            System.out.print("Select an option: ");
            int choice = Main.scanner.nextInt();
            Main.scanner.nextLine();

            if (choice >= 1 && choice <= pizza.getToppings().size()) {
                Topping selected = pizza.getToppings().get(choice - 1);
                pizza.removeTopping(selected);
                System.out.println(selected.getName() + " Removed!");

                if (pizza.getToppings().isEmpty()) {
                    removeMore = false;
                    System.out.println("No more toppings to remove");
                    break;
                }



            } else {
                System.out.println("Invalid choice.");
            }

            System.out.print("Remove another topping? (yes/no): ");
            String again = Main.scanner.nextLine();

            if (!again.equalsIgnoreCase("yes")) {
                removeMore = false;
            }


        }
    }


    private void handlePremiumCategory(ArrayList<PremiumTopping> list, Pizza pizza) {

        boolean addMore = true;

        while (addMore) {
            for (int i = 0; i < list.size(); i++) {
                System.out.println("\t" + (i + 1) + ") " + list.get(i).getName());
            }

            System.out.print("Select an option: ");
            int choice = Main.scanner.nextInt();
            Main.scanner.nextLine();

            if (choice >= 1 && choice <= list.size()) {
                PremiumTopping selected = list.get(choice - 1);
                pizza.addTopping(selected);
                System.out.println(selected.getName() + " added!");

                System.out.print("Would you like extra " + selected.getName() + "? (yes/no): ");
                String extra = Main.scanner.nextLine();
                if (extra.equalsIgnoreCase("yes")) {
                    selected.setExtra(1);
                }

            } else {
                System.out.println("Invalid choice.");
            }

            System.out.print("Add another from this category? (yes/no): ");
            String again = Main.scanner.nextLine();

            if (!again.equalsIgnoreCase("yes")) {
                addMore = false;
            }


        }
    }

    private void handleRegularCategory(ArrayList<RegularTopping> list, Pizza pizza) {

        boolean addMore = true;

        while (addMore) {
            for (int i = 0; i < list.size(); i++) {
                System.out.println("\t" + (i + 1) + ") " + list.get(i).getName());
            }

            System.out.print("Select an option: ");
            int choice = Main.scanner.nextInt();
            Main.scanner.nextLine();

            if (choice >= 1 && choice <= list.size()) {
                RegularTopping selected = list.get(choice - 1);
                pizza.addTopping(selected);
                System.out.println(selected.getName() + " added!");

                System.out.print("Would you like extra " + selected.getName() + "? (yes/no): ");
                String extra = Main.scanner.nextLine();
                if (extra.equalsIgnoreCase("yes")) {
                    pizza.addTopping(new RegularTopping(selected.getName() + " (extra)"));
                    System.out.println("Extra " + selected.getName() + " added!");
                }
            } else {
                System.out.println("Invalid choice.");
            }

            System.out.print("Add another from this category? (yes/no): ");
            String again = Main.scanner.nextLine();

            if (!again.equalsIgnoreCase("yes")) {
                addMore = false;
            }
        }
    }

    private void askStuffedCrust(Pizza pizza){
        System.out.print("Would you like Stuffed Crust? Type Yes or No : ");
        String answer = Main.scanner.nextLine();

        if(answer.equalsIgnoreCase("yes")){
            pizza.setStuffedCrust(true);
        }



    }
}
