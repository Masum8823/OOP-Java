# 🔷 Hybrid Inheritance in Java

## 📌 What is Hybrid Inheritance?

Hybrid Inheritance is a combination of **two or more types of inheritance**, typically **multilevel + multiple inheritance**.

👉 In Java, hybrid inheritance is achieved using **classes + interfaces together**.

---

## 🧠 Definition

Hybrid inheritance allows a class to **inherit from a class hierarchy and implement multiple interfaces at the same time**.

---

## 🔗 Basic Structure

```text id="hyb1"
Animal (Base Class)
   ↓
  Dog (Derived Class)
   ↓
BabyDog (Child Class)

BabyDog also implements:
Pet, Friendly (Interfaces)
```

---

## 🔷 Why Use Inheritance?

* To combine features from multiple sources
* To build flexible and modular systems
* To reuse code efficiently
* To organize complex structures

---

## 🔷 Syntax

```java id="hybsyn"
class A {
    // base class
}

class B extends A {
    // derived class
}

interface X {
    void methodX();
}

interface Y {
    void methodY();
}

class C extends B implements X, Y {
    // hybrid inheritance
}
```

---

## ✅ Example Code

```java id="hybcode"
// Base class
class Animal {
    String name;

    void eat() {
        System.out.println(name + " is eating");
    }
}

// Derived class
class Dog extends Animal {

    void bark() {
        System.out.println(name + " is barking");
    }
}

// Interface 1
interface Pet {
    void play();
}

// Interface 2
interface Friendly {
    void behave();
}

// Hybrid class (multilevel + multiple)
class BabyDog extends Dog implements Pet, Friendly {

    public void play() {
        System.out.println(name + " is playing");
    }

    public void behave() {
        System.out.println(name + " is very friendly");
    }
}

// Main class
public class Hybrid_Inheritance {
    public static void main(String[] args) {

        BabyDog d1 = new BabyDog();

        d1.name = "Tommy";

        d1.eat();    // from Animal
        d1.bark();   // from Dog
        d1.play();   // from Pet
        d1.behave(); // from Friendly
    }
}
```

---

## 🔥 Output

```text id="hybout"
Tommy is eating
Tommy is barking
Tommy is playing
Tommy is very friendly
```

---

## 🧠 Step-by-Step Explanation

### 🔹 Base Class: Animal

* Contains variable `name`
* Contains method `eat()`

---

### 🔹 Derived Class: Dog

* Extends `Animal`
* Inherits `name` and `eat()`
* Adds method `bark()`

---

### 🔹 Interfaces: Pet & Friendly

* `Pet` → defines method `play()`
* `Friendly` → defines method `behave()`

---

### 🔹 Hybrid Class: BabyDog

* Extends `Dog` (multilevel inheritance)
* Implements `Pet` and `Friendly` (multiple inheritance via interfaces)
* Implements:

  * `play()`
  * `behave()`

---

### 🔹 Main Method

* Creates object of `BabyDog`
* Assigns value to `name`
* Calls all methods from:

  * class hierarchy
  * interfaces

---

## 💡 Applications 

### 1. Smart Device Systems

* Base: `Device`
* Derived: `Phone`
* Interfaces: `Camera`, `MusicPlayer`
* Final class combines hardware + multiple features

---

### 2. E-commerce Platform

* Base: `User`
* Derived: `Customer`
* Interfaces: `Payment`, `Review`
* Final class handles user behavior + multiple services

---

### 3. Banking System

* Base: `Account`
* Derived: `SavingsAccount`
* Interfaces: `LoanService`, `InsuranceService`
* Combines account logic with extra services

---

### 4. Software Applications

* Base: `Application`
* Derived: `WebApp`
* Interfaces: `Login`, `Notification`
* Final system integrates core + multiple features

---

### 5. Game Development

* Base: `Character`
* Derived: `Player`
* Interfaces: `Fight`, `Trade`
* Player can perform multiple actions along with inherited abilities

---

## ⚠️ Important Points

* Java does not support multiple inheritance using classes
* Interfaces are used to achieve multiple inheritance
* Hybrid inheritance = class inheritance + interface implementation
* `extends` + `implements` are used together

---

## ⚡ Viva Ready Lines 

* Hybrid inheritance is a combination of different inheritance types
* Java uses interfaces to achieve hybrid inheritance
* It combines class inheritance and multiple interface implementation

---

## 🔚 Summary

* Combination of multilevel and multiple inheritance
* Uses both classes and interfaces
* Flexible and powerful structure
* Common in real-world systems

---
