// Abstract Class
abstract class RideService {
    int distance = 10;
    int baseFare = 50;

    abstract void requestRide();
    abstract void calculateFare();
    abstract void showRideDetails();
}

// Bike Ride
class BikeRide extends RideService {
    int fare;

    void requestRide() {
        System.out.println("Bike ride requested");
    }

    void calculateFare() {
        fare = baseFare + (distance * 10);
    }

    void showRideDetails() {
        System.out.println("Bike Ride Fare: " + fare);
    }
}

// Car Ride
class CarRide extends RideService {
    int fare;

    void requestRide() {
        System.out.println("Car ride requested");
    }

    void calculateFare() {
        fare = baseFare + (distance * 20);
    }

    void showRideDetails() {
        System.out.println("Car Ride Fare: " + fare);
    }
}

// Luxury Ride
class LuxuryRide extends RideService {
    int fare;

    void requestRide() {
        System.out.println("Luxury ride requested");
    }

    void calculateFare() {
        fare = baseFare + (distance * 35);
    }

    void showRideDetails() {
        System.out.println("Luxury Ride Fare: " + fare);
    }
}

// Main Class
public class RideSharingSystem {
    public static void main(String[] args) {

        RideService bike = new BikeRide();
        RideService car = new CarRide();
        RideService luxury = new LuxuryRide();

        System.out.println("---- Bike Ride ----");
        bike.requestRide();
        bike.calculateFare();
        bike.showRideDetails();

        System.out.println("\n---- Car Ride ----");
        car.requestRide();
        car.calculateFare();
        car.showRideDetails();

        System.out.println("\n---- Luxury Ride ----");
        luxury.requestRide();
        luxury.calculateFare();
        luxury.showRideDetails();
    }
}