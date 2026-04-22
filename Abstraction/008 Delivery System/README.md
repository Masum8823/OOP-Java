# 📦 Delivery Charge Calculation System

This project is a simple Java simulation of a delivery system that calculates charges for different transport methods (Bike, Car, and Drone). It shows how we can handle different pricing logic using a unified structure.

---

## 📌 The Problem
A delivery company uses different vehicles to transport packages. Each vehicle has a different cost per unit of distance:
- **Bike:** 8 per distance unit.
- **Car:** 15 per distance unit.
- **Drone:** 25 per distance unit.

Even though the rates are different, the basic process of calculating the total delivery charge based on distance remains the same for every delivery method.

---

## 💡 How I Solved It
To make the code clean and easy to maintain, I used Object-Oriented Programming (OOP) principles:



* **Abstraction:** I created an abstract class called `Delivery`. It serves as a blueprint, forcing every delivery type to include a `calculateCharge()` method.
* **Inheritance:** The `BikeDelivery`, `CarDelivery`, and `DroneDelivery` classes all inherit from the `Delivery` class. This allows them to reuse the shared `distance` variable.
* **Polymorphism:** While every class uses the same `calculateCharge()` method name, each one performs a different calculation based on its specific rate per distance.

---

## ⚙️ How it works
1. We define the delivery `distance` (15 units) in the abstract class.
2. We create objects for each delivery type.
3. When we call `calculateCharge()`, the system automatically applies the correct math for that specific vehicle.

---

## 🧾 Output Example
When you run the code, you will see the delivery charges for each method:

```text
---- Delivery Charges ----

Bike Delivery Charge: 120
Car Delivery Charge: 225
Drone Delivery Charge: 375