// What is Multiple Inheritance in Java?
// Create two interfaces named Animal and Pet.
// In Animal, create a method eat().
// In Pet, create a method play().
// Create a class named Dog that implements both Animal and Pet.
// Define both eat() and play() methods in Dog.
// In the main method, create an object of Dog.
// Call both methods.
// Display the output.

// Interface 1
interface Animal {
    void eat();
}

// Interface 2
interface Pet {
    void play();
}

// Class implementing multiple interfaces
class Dog implements Animal, Pet {

    public void eat() {
        System.out.println("Dog is eating");
    }

    public void play() {
        System.out.println("Dog is playing");
    }
}

// Main class
public class Multiple_Inheritance {
    public static void main(String[] args) {

        Dog d1 = new Dog();

        d1.eat();   // from Animal interface
        d1.play();  // from Pet interface
    }
}