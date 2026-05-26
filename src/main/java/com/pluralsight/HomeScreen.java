package com.pluralsight;

public class HomeScreen {

    public void run() {

        boolean run = true;
        while (run) {
            System.out.println("---Welcome to Rolling in the Dough Pizzaria---");
            System.out.println("\t1.) New Order");
            System.out.println("\t0.) - Exit.");
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
            }
        }
    }
}





