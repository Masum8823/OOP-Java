// What is Hybrid Inheritance in Java?
// Create a base class named Animal.
// Declare a variable name and a method eat() in the base class.
// Create a derived class Dog that extends Animal.
// Create a method bark() in Dog.
// Create an interface Pet with a method play().
// Create another interface Friendly with a method behave().
// Create a class BabyDog that extends Dog and implements both Pet and Friendly.
// Implement all required methods.
// In the main method, create an object of BabyDog.
// Assign a value to name.
// Call all methods.
// Display the output.

// Base class
class Animal {
    String name;

    void eat() {
        System.out.println(name + " is eating");
    }
}

// Derived class
class Dog extends Animal {

    void bark() {
        System.out.println(name + " is barking");
    }
}

// Interface 1
interface Pet {
    void play();
}

// Interface 2
interface Friendly {
    void behave();
}

// Hybrid class (multilevel + multiple)
class BabyDog extends Dog implements Pet, Friendly {

    public void play() {
        System.out.println(name + " is playing");
    }

    public void behave() {
        System.out.println(name + " is very friendly");
    }
}

// Main class
public class Hybrid_Inheritance {
    public static void main(String[] args) {

        BabyDog d1 = new BabyDog();

        d1.name = "Tommy";

        d1.eat();    // from Animal
        d1.bark();   // from Dog
        d1.play();   // from Pet
        d1.behave(); // from Friendly
    }
}