abstract class Delivery {
    int distance = 15;

    abstract void calculateCharge();
}

class BikeDelivery extends Delivery {
    int charge;

    void calculateCharge() {
        charge = distance * 8;
        System.out.println("Bike Delivery Charge: " + charge);
    }
}

class CarDelivery extends Delivery {
    int charge;

    void calculateCharge() {
        charge = distance * 15;
        System.out.println("Car Delivery Charge: " + charge);
    }
}

class DroneDelivery extends Delivery {
    int charge;

    void calculateCharge() {
        charge = distance * 25;
        System.out.println("Drone Delivery Charge: " + charge);
    }
}

public class DeliverySystem {
    public static void main(String[] args) {

        Delivery bike = new BikeDelivery();
        Delivery car = new CarDelivery();
        Delivery drone = new DroneDelivery();

        System.out.println("---- Delivery Charges ----\n");

        bike.calculateCharge();
        car.calculateCharge();
        drone.calculateCharge();
    }
}