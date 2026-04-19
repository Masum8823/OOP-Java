// What is Method Overriding in Java?
// Create a base class named Animal.
// Create a method sound() in the base class that prints a message.
// Create a derived class named Dog that extends Animal.
// Override the sound() method in the Dog class with a different message.
// In the main method, create an object of Dog.
// Call the sound() method.
// Display the output.

// Base class
class Animal {

    void sound() {
        System.out.println("Animal makes sound");
    }
}

// Derived class
class Dog extends Animal {

    // Overriding method
    void sound() {
        System.out.println("Dog barks");
    }
}

// Main class
public class Method_Overriding {
    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.sound();  // calls overridden method
    }
}