// What is Single Inheritance in Java?
// Create a base class named Animal.
// Declare a variable name in the base class.
// Create a method eat() in the base class that prints a message.
// Create a derived class named Dog that extends Animal.
// Create a method bark() in the Dog class.
// In the main method, create an object of Dog.
// Assign a value to name.
// Call both eat() and bark() methods.
// Display the output.

// Base class (Parent)
class Animal {
    String name;

    void eat() {
        System.out.println(name + " is eating");
    }
}

// Derived class (Child)
class Dog extends Animal {

    void bark() {
        System.out.println(name + " is barking");
    }
}

// Main class
public class Single_Inheritance {
    public static void main(String[] args) {

        Dog d1 = new Dog();

        d1.name = "Tommy";   // inherited variable
        d1.eat();            // inherited method
        d1.bark();           // own method
    }
}