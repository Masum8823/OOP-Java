// What is Method Overloading in Java?
// Create a class named Calculator.
// Create a method add() that takes two integers and prints their sum.
// Create another method add() that takes three integers and prints their sum.
// Create another method add() that takes two double values and prints their sum.
// In the main method, create an object of Calculator.
// Call all overloaded methods with different parameters.
// Display the output.

class Calculator {

    // Method 1: two integers
    void add(int a, int b) {
        System.out.println("Sum of 2 integers: " + (a + b));
    }

    // Method 2: three integers
    void add(int a, int b, int c) {
        System.out.println("Sum of 3 integers: " + (a + b + c));
    }

    // Method 3: two double values
    void add(double a, double b) {
        System.out.println("Sum of 2 doubles: " + (a + b));
    }
}

// Main class
public class Method_Overloading {
    public static void main(String[] args) {

        Calculator c1 = new Calculator();

        c1.add(10, 20);        // calls method 1
        c1.add(10, 20, 30);    // calls method 2
        c1.add(5.5, 4.5);      // calls method 3
    }
}