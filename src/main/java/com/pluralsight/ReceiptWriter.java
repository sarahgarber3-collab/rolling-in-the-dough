package com.pluralsight;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;

public class ReceiptWriter {

    public static void writeReceipt(Order order) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
            String fileName = order.getOrderTime().format(formatter) + ".txt";
            new File("receipts").mkdirs();
            BufferedWriter writer = new BufferedWriter(new FileWriter("receipts/" + fileName));

            for (Orderable item : order.getItems()) {
                writer.write(item.toString());
                writer.newLine();
            }
            writer.write("Sub Total: $" + String.format("%.2f",order.getSubtotal()));
            writer.newLine();
            writer.write("Tax: (8%): $" + String.format("%.2f", order.getTax()));
            writer.newLine();
            writer.write("Total: $" + String.format("%.2f",order.getTotal()));
            writer.close();


        } catch (IOException e) {
            System.out.println("Error saving receipt: " + e.getMessage());
        }
    }
}
