// What is Multilevel Inheritance in Java?
// Create a base class named Animal.
// Declare a variable name in the base class.
// Create a method eat() in the base class that prints a message.
// Create a derived class named Dog that extends Animal.
// Create a method bark() in the Dog class.
// Create another derived class named BabyDog that extends Dog.
// Create a method weep() in the BabyDog class.
// In the main method, create an object of BabyDog.
// Assign a value to name.
// Call eat(), bark(), and weep() methods.
// Display the output.

// Base class (Grandparent)
class Animal {
    String name;

    void eat() {
        System.out.println(name + " is eating");
    }
}

// Derived class (Parent)
class Dog extends Animal {

    void bark() {
        System.out.println(name + " is barking");
    }
}

// Derived class (Child)
class BabyDog extends Dog {

    void weep() {
        System.out.println(name + " is weeping");
    }
}

// Main class
public class Multilevel_Inheritance {
    public static void main(String[] args) {

        BabyDog d1 = new BabyDog();

        d1.name = "Tommy";   // inherited from Animal
        d1.eat();            // method from Animal
        d1.bark();           // method from Dog
        d1.weep();           // method from BabyDog
    }
}