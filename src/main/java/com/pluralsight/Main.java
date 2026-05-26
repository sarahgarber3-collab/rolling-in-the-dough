package com.pluralsight;
import java.util.Scanner;

public class Main {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        HomeScreen homeScreen = new HomeScreen();
        homeScreen.run();

    }
}
