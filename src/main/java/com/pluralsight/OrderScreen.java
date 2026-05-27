package com.pluralsight;

public class OrderScreen {
    private Order order;
    private boolean run = true;

    public OrderScreen(Order order) {
        this.order = order;
    }

    public void run() {

        while (run) {
            System.out.println("---Your Current Order---");
            order.getItemsNewestFirst().forEach(System.out::println);
            System.out.println("---Order Screen---");
            System.out.println("\t1.) Add Pizza");
            System.out.println("\t2.) Add Drink ");
            System.out.println("\t3.) Add Garlic Knots ");
            System.out.println("\t4.) Checkout ");
            System.out.print("\t0.) Cancel Order ");
            System.out.print("Select from the above options: ");

            int userOption = Main.scanner.nextInt();
            Main.scanner.nextLine();

            switch (userOption) {
                case 1:
                    addPizza();
                    break;

                case 2:
                    addDrink();
                    break;

                case 3:
                    addGarlicKnots();
                    break;

                case 4:
                    checkout();
                    break;

                case 0:
                    run = false;
                    System.out.println("Order canceled.");
                    break;

                default:
                    System.out.println("Invalid option, Please try again.");

            }
        }
    }
        private void addPizza(){
        PizzaBuilder pizzaBuilder = new PizzaBuilder();
        Pizza pizza = pizzaBuilder.run();
        order.addItem(pizza);


        }
        private void addDrink() {
            System.out.println("Drink Size Options");
            System.out.println("\t1.) Small - $2.00");
            System.out.println("\t2.) Medium - $2.50");
            System.out.println("\t3.) Large - $3.00");
            System.out.print("Select Drink Size: ");
            int drinkOption = Main.scanner.nextInt();
            Main.scanner.nextLine();

            DrinkSize selectedSize;

            switch (drinkOption) {
                case 1:
                    selectedSize = DrinkSize.SMALL;
                    break;
                case 2:
                    selectedSize = DrinkSize.MEDIUM;
                    break;
                case 3:
                    selectedSize = DrinkSize.LARGE;
                    break;
                default:
                    System.out.println("Invalid option, no drink added.");
                    return;
            }
            System.out.println("Drink Flavor Options");
            System.out.println("\t1.) Coke");
            System.out.println("\t2.) Root beer");
            System.out.println("\t3.) Pepsi");
            System.out.print("Select Drink: ");
            int flavorOption = Main.scanner.nextInt();
            Main.scanner.nextLine();

            String selectedFlavor;

            switch (flavorOption) {
                case 1:
                    selectedFlavor = "Coke";
                    break;
                case 2:
                    selectedFlavor = "Root beer";
                    break;
                case 3:
                    selectedFlavor = "Pepsi";
                    break;
                default:
                    System.out.println("Invalid option, no drink added.");
                    return;


            }
            Drink drink = new Drink(selectedSize, selectedFlavor);
            order.addItem(drink);
            System.out.println("Drink added to order!");
        }
        private void addGarlicKnots(){
        GarlicKnots garlicKnots = new GarlicKnots();
        order.addItem(garlicKnots);
        }
        private void checkout(){
            if (!order.isValid()) {
                System.out.println("Error — you must have at least one pizza, or a drink/garlic knots.");
                return;
            }
            CheckoutScreen checkout = new CheckoutScreen(order);
            checkout.run();
            run = false;

        }

}
