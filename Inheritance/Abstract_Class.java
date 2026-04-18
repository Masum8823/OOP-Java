// What is an Abstract Class?
// Create an abstract class named Animal.
// Declare a variable name.
// Create a normal method sleep() that prints a message.
// Create an abstract method eat().
// Create a class Dog that extends Animal.
// Implement the eat() method in Dog.
// In the main method, create an object of Dog.
// Assign a value to name.
// Call both sleep() and eat() methods.
// Display the output.

// Abstract class
abstract class Animal {

    String name;

    void sleep() { // normal method
        System.out.println(name + " is sleeping");
    }

    abstract void eat(); // abstract method
}

// Child class
class Dog extends Animal {

    void eat() {
        System.out.println(name + " is eating");
    }
}

// Main class
public class Abstract_Class {
    public static void main(String[] args) {

        Dog d1 = new Dog();

        d1.name = "Tommy";
        d1.sleep(); // normal method
        d1.eat();   // abstract method implemented
    }
}