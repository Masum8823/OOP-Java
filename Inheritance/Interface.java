// What is an Interface?
// Create an interface named Animal.
// Declare a method eat().
// Create another interface named Pet.
// Declare a method play().
// Create a class Dog that implements both interfaces.
// Implement both methods.
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

// Class implementing interfaces
class Dog implements Animal, Pet {

    public void eat() {
        System.out.println("Dog is eating");
    }

    public void play() {
        System.out.println("Dog is playing");
    }
}

// Main class
public class Interface {
    public static void main(String[] args) {

        Dog d1 = new Dog();

        d1.eat();
        d1.play();
    }
}