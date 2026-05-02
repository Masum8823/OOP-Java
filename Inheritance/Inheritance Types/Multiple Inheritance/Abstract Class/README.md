# 🔷 Abstract Class in Java

## 📌 What is an Abstract Class?

An Abstract Class is a class that **cannot be instantiated (object cannot be created directly)** and may contain **both abstract methods and normal methods**.

👉 It is used as a **base class** for other classes.

---

## 🧠 Definition

An abstract class is a class declared with the `abstract` keyword that can have **methods without implementation (abstract methods)** as well as **methods with implementation (normal methods)**.

---

## 🔗 Basic Structure

```text id="abs1"
Animal (Abstract Class)
        ↓
      Dog (Child Class)
```

---

## 🔷 Why Use Abstract Class?

* To define a common structure for multiple classes
* To enforce method implementation in child classes
* To combine both defined and undefined behavior
* To improve code organization

---

## 🔷 Syntax

```java id="abssyn"
abstract class ClassName {

    // normal method
    void method1() {
        // implementation
    }

    // abstract method
    abstract void method2();
}
```

---

## ✅ Example Code

```java id="abscode"
// Abstract class
abstract class Animal {

    String name;

    void sleep() { // normal method
        System.out.println(name + " is sleeping");
    }

    abstract void eat(); // abstract method
}

// Child class
class Dog extends Animal {

    void eat() {
        System.out.println(name + " is eating");
    }
}

// Main class
public class Abstract_Class {
    public static void main(String[] args) {

        Dog d1 = new Dog();

        d1.name = "Tommy";
        d1.sleep(); // normal method
        d1.eat();   // abstract method implemented
    }
}
```

---

## 🔥 Output

```text id="absout"
Tommy is sleeping
Tommy is eating
```

---

## 🧠 Step-by-Step Explanation

### 🔹 Abstract Class: Animal

* Declared using `abstract` keyword
* Contains variable `name`
* Has:

  * `sleep()` → normal method (already implemented)
  * `eat()` → abstract method (no body)

---

### 🔹 Child Class: Dog

* Extends `Animal`
* Must implement `eat()` method
* Provides its own implementation

---

### 🔹 Main Method

* Object of `Dog` is created
* Value assigned to `name`
* Calls:

  * `sleep()` → from abstract class
  * `eat()` → implemented in child

---

## 💡 Applications 

### 1. Payment Systems

* Abstract class: `Payment`
* Methods: `startTransaction()` (defined), `pay()` (abstract)
* Child: `Bkash`, `Card`, `Nagad`
* Each child defines its own payment process

---

### 2. Banking System

* Abstract class: `Account`
* Common methods: deposit, withdraw
* Abstract method: calculateInterest()
* Child: `SavingsAccount`, `CurrentAccount`
* Each type calculates interest differently

---

### 3. Employee System

* Abstract class: `Employee`
* Common data: name, salary
* Abstract method: calculateBonus()
* Child: `Manager`, `Developer`
* Bonus logic differs by role

---

### 4. Shape Calculation System

* Abstract class: `Shape`
* Abstract method: area()
* Child: `Circle`, `Rectangle`
* Each shape calculates area differently

---

### 5. Game Development

* Abstract class: `Character`
* Common features: health, movement
* Abstract method: attack()
* Child: `Warrior`, `Mage`
* Each character has different attack behavior

---

## ⚠️ Important Points

* Cannot create object of abstract class
* Must use `abstract` keyword
* Can contain both abstract and normal methods
* Child class must implement all abstract methods
* Can have variables and constructors

---

## ⚡ Viva Ready Lines 

* Abstract class cannot be instantiated
* It can have both abstract and normal methods
* Child class must implement abstract methods

---

## 🔚 Summary

* Declared using `abstract`
* Cannot create object directly
* Contains both defined and undefined methods
* Used as a base for other classes

---
