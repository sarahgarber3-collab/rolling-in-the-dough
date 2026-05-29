package com.pluralsight;

public class CheckoutScreen {
    private Order order;

    public CheckoutScreen(Order order) {
        this.order = order;
    }

    public void run() {

        while(true) {
            System.out.println("\n---Order Checkout---");
            order.getItemsNewestFirst().forEach(System.out::println);
            System.out.println("Subtotal: $" + String.format("%.2f", order.getSubtotal()));
            System.out.println("Tax (8%): $" + String.format("%.2f", order.getTax()));
            System.out.println("Total: $" + String.format("%.2f", order.getTotal()));

            System.out.println("\t1) Confirm Order");
            System.out.println("\t0) Cancel Order");
            System.out.print("Select an option: ");
            int userOption = Main.scanner.nextInt();
            Main.scanner.nextLine();

            switch (userOption) {
                case 1:
                    confirmOrder();
                    return;

                case 0:
                    cancelOrder();
                    return;

                default:
                    System.out.println("Option not available");


            }
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
