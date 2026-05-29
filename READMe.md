# Rolling in the Dough Pizzeria

## Description
This is a Pizza ordering simulation OOP project. It goes through a series
of steps to either build a pizza or add other items to the menu.

## How to Run
Open the project in IntelliJ IDEA and navigate to the Main class.
Hit the run button to launch the application. Once running you can
smoothly go through the user interface to build or order a pizza
with optional sides or a drink.

## Interesting Design Decisions
One interesting design decision in this project is the way the classes
interconnect with each other. This was achieved by using an abstract
Topping class with RegularTopping and PremiumTopping as subclasses,
and an Orderable interface implemented by Pizza, Drink, and GarlicKnots.
The Orderable interface allows all three item types to be stored in one
ArrayList in the Order class, making it easy to calculate the total
with a single stream.

## Technologies Used
- Java
- Object Oriented Programming (OOP)
- File I/O for receipt generation