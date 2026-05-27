package com.pluralsight;

public class CheckoutScreen {
    private Order order;

    public CheckoutScreen(Order order) {
        this.order = order;
    }

    public void run() {
        System.out.println("---Order Checkout---");
        order.getItemsNewestFirst().forEach(System.out::println);
        System.out.println("Total: $" + String.format("%.2f", order.getTotal()));

        System.out.println("1.) Confirm Order");
        System.out.println("0.) Cancel Order");
        System.out.print("Select an option: ");
        int userOption = Main.scanner.nextInt();
        Main.scanner.nextLine();

        switch (userOption) {
            case 1:
                confirmOrder();
                break;

            case 0:
                cancelOrder();
                break;

            default:
                System.out.println("Option not available");


        }
    }

    public void confirmOrder() {
        ReceiptWriter.writeReceipt(order);
        System.out.println("Thank you for purchasing! enjoy the dough! ");

    }

    public void cancelOrder() {
        System.out.println("Order cancelled, see you next time!");

    }
}
