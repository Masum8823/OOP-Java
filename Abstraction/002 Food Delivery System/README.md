# 🍔 Food Delivery Management System

This project is a simple simulation of a food delivery system using Java. It shows how different types of restaurants (Fast Food, Traditional, and Dessert Shops) can be managed using a single, unified structure.

---

## 📌 The Problem
We need a system to handle orders for various types of restaurants. Even though they all serve food, they have different ways of preparing meals and different delivery times:

- **Fast Food:** Uses pre-cooked items (Fast delivery).
- **Traditional Food:** Cooks fresh meals (Slower delivery).
- **Dessert Shop:** Prepares and decorates items (Medium delivery).

Every restaurant must be able to accept an order, prepare the food, and provide an estimated delivery time.

---

## 💡 How I Solved It
I used Object-Oriented Programming (OOP) to make the system flexible:

* **Abstraction:** I created a base class called `Restaurant`. It works as a template, forcing every restaurant type to include the same three essential actions: `placeOrder()`, `prepareFood()`, and `estimateDeliveryTime()`.
* **Inheritance:** Each specific shop (`FastFoodRestaurant`, `TraditionalRestaurant`, `DessertShop`) extends the `Restaurant` class. This keeps our code clean and organized.
* **Polymorphism:** While every restaurant uses the same method names, each one behaves differently. For example, when we call `prepareFood()`, the Fast Food shop says it's using pre-cooked items, while the Traditional shop says it's cooking fresh!

---

## ⚙️ How it works
1. We create objects for each type of restaurant.
2. We call the same set of methods (`placeOrder`, `prepareFood`, `estimateDeliveryTime`) for each object.
3. The system automatically runs the specific logic for that restaurant type.

---

## 🧾 Output Example
When you run the code, you will see how each restaurant handles its own tasks:

```text
---- Fast Food ----
Fast Food Order Placed
Preparing fast food using pre-cooked items
Delivery Time: 20 minutes

---- Traditional Food ----
Traditional Food Order Placed
Cooking fresh traditional food
Delivery Time: 45 minutes

---- Dessert ----
Dessert Order Placed
Preparing and decorating desserts
Delivery Time: 30 minutes