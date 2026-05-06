// Create a Java program using an abstract class Vehicle with two abstract methods: startEngine() and showFuelCapacity().

// Then create subclasses Motorcycle, Car, and Truck that implement these methods.

// In the main method, create objects using parent class reference and call the methods to show polymorphism.

abstract class Vehicle{
  
    abstract void startEngine();
    
    abstract void showFuelCapacity();
    
}

class Motorcycle extends Vehicle{
    void startEngine(){
      
        System.out.println("motorcycle vehicle engine is started");
        
    }

    void showFuelCapacity(){
        System.out.println("Full Fuel Capacity is: 15L");
    }
}

class Car extends Vehicle{
    void startEngine(){
        System.out.println("Car Vehicle's engine is started");
    }

    void showFuelCapacity(){
      
        System.out.println("Full Fuel Capacity is: 50L");
    }
}

class Truck extends Vehicle{
    void startEngine() {
        System.out.println("Truck Vehicle's engine is started");
    }

    void showFuelCapacity() {
        System.out.println("Full Fuel Capacity is: 200L");
    }
}

public class FleetManager{
  
    public static void main(String[] args){
      
        Vehicle a = new Motorcycle();
        
        Vehicle b = new Car();
        
        Vehicle c = new Truck();

        a.startEngine();
        a.showFuelCapacity();

        b.startEngine();
        b.showFuelCapacity();

        c.startEngine();
        c.showFuelCapacity();
    }
}