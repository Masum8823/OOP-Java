# 🚗 Ride Sharing System

This project is a simple simulation of a ride-sharing service (like Uber or Pathao) using Java. It demonstrates how we can manage different types of rides (Bike, Car, and Luxury) using a unified structure.

---

## 📌 The Problem
We need a system to handle ride requests for different vehicle types. Even though they all get you to your destination, they have different pricing structures:

- **Bike Ride:** Affordable, base fare plus a small distance fee.
- **Car Ride:** Standard, base fare plus a medium distance fee.
- **Luxury Ride:** Premium, base fare plus a higher distance fee.

Every ride must follow the same process: Requesting a ride, calculating the fare, and showing the ride details.

---

## 💡 How I Solved It
I used core OOP principles to keep the system organized and scalable:

* **Abstraction:** I created an abstract class `RideService`. It acts as a template, forcing every ride type (Bike, Car, Luxury) to implement the same three steps: `requestRide()`, `calculateFare()`, and `showRideDetails()`.
* **Inheritance:** Each specific ride class inherits from the `RideService` base class. This helps in reusing the base fare and distance variables.
* **Polymorphism:** While every ride uses the same method names, they behave differently. For instance, when we call `calculateFare()`, each class calculates a different price based on its own unique rate.

---

## ⚙️ How it works
1. We create objects for each type of ride.
2. We follow a standard sequence: request the ride, calculate the specific fare, and finally display the details.
3. The system automatically applies the correct pricing logic based on the vehicle type.

---

## 🧾 Output Example
When you run the code, you will see the fare details for each ride:

```text
---- Bike Ride ----
Bike ride requested
Bike Ride Fare: 150

---- Car Ride ----
Car ride requested
Car Ride Fare: 250

---- Luxury Ride ----
Luxury ride requested
Luxury Ride Fare: 400