package com.pluralsight;

public class HomeScreen {

    public static void run() {

        boolean run = true;
        while (run) {
            System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("        🍕  ROLLING IN THE DOUGH PIZZERIA  🍕");
            System.out.println("              \"Where Every Slice Hits Different\"");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("\n ---Home Screen---");
            System.out.println("\t1) New Order");
            System.out.println("\t0) - Exit.");
            System.out.print("Select from the above options: ");

            int userOption = Main.scanner.nextInt();
            Main.scanner.nextLine();

            switch (userOption) {
                case 1:
                    Order order = new Order();
                    OrderScreen orderScreen = new OrderScreen(order);
                    orderScreen.run();
                    break;

                case 0:
                    run = false;
                    System.out.println("Have a wonderful day, come back soon!");
                    break;

                default:
                    System.out.println("Invalid option, please try again.");
            }
        }
    }
}





