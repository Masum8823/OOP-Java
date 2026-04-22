# 🏦 Banking System - Loan Interest Calculator

This project is a simple Java simulation of a banking system that calculates loan interest for different purposes (Home, Car, and Education). It shows how we can handle different calculations using a shared structure.

---

## 📌 The Problem
A bank offers different types of loans, and each loan has its own interest rate:
- **Home Loan:** 8% interest.
- **Car Loan:** 10% interest.
- **Education Loan:** 6% interest.

Even though the rates are different, the basic process of calculating interest for a fixed loan amount remains the same for every loan type.

---

## 💡 How I Solved It
To make the code clean and easy to update, I used Object-Oriented Programming (OOP) principles:



* **Abstraction:** I created an abstract class called `Loan`. It serves as a blueprint that forces every loan type to implement the `calculateInterest()` method.
* **Inheritance:** The `HomeLoan`, `CarLoan`, and `EducationLoan` classes all inherit from the `Loan` class. This allows them to reuse the same `amount` variable, saving us from writing the same code over and over.
* **Polymorphism:** While every class uses the same `calculateInterest()` method name, each one performs a different calculation based on its specific interest rate.

---

## ⚙️ How it works
1. We define the base loan `amount` (100,000 BDT) in the abstract class.
2. We create objects for each loan type.
3. When we call `calculateInterest()`, the system automatically applies the correct math for that specific loan type.

---

## 🧾 Output Example
When you run the code, you will see the interest breakdown for each loan:

```text
---- Loan Interest Calculation ----

Home Loan Interest: 8000.0 BDT
Car Loan Interest: 10000.0 BDT
Education Loan Interest: 6000.0 BDT