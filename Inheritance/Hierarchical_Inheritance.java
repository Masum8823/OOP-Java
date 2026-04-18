// What is Hierarchical Inheritance in Java?
// Create a base class named Animal.
// Declare a variable name in the base class.
// Create a method eat() in the base class that prints a message.
// Create two derived classes named Dog and Cat that extend Animal.
// Create a method bark() in the Dog class.
// Create a method meow() in the Cat class.
// In the main method, create objects of both Dog and Cat.
// Assign values to name.
// Call respective methods.
// Display the output.

// Base class (Parent)
class Animal {
    String name;

    void eat() {
        System.out.println(name + " is eating");
    }
}

// Derived class 1 (Child)
class Dog extends Animal {

    void bark() {
        System.out.println(name + " is barking");
    }
}

// Derived class 2 (Child)
class Cat extends Animal {

    void meow() {
        System.out.println(name + " is meowing");
    }
}

// Main class
public class Hierarchical_Inheritance {
    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.name = "Tommy";
        d1.eat();     // from Animal
        d1.bark();    // from Dog

        Cat c1 = new Cat();
        c1.name = "Kitty";
        c1.eat();     // from Animal
        c1.meow();    // from Cat
    }
}