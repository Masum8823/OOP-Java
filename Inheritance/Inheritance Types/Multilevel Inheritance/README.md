# 🔷 Multilevel Inheritance in Java

## 📌 What is Multilevel Inheritance?

Multilevel Inheritance is a type of inheritance where **a class inherits from another class, and that class is further inherited by another class**.

👉 Structure:
**Grandparent → Parent → Child**

---

## 🧠 Definition

Multilevel inheritance allows a class to **inherit properties and methods step by step through multiple levels**.

---

## 🔗 Basic Structure

```text id="mls1"
Animal (Grandparent)
   ↓
  Dog (Parent)
   ↓
BabyDog (Child)
```

---

## 🔷 Why Use Inheritance?

* To reuse code across multiple levels
* To build a structured hierarchy
* To avoid repetition
* To organize complex systems easily

---

## 🔷 Syntax

```java id="mlsyn"
class A {
    // base class
}

class B extends A {
    // derived from A
}

class C extends B {
    // derived from B
}
```

---

## ✅ Example Code

```java id="mlcode"
// Base class (Grandparent)
class Animal {
    String name;

    void eat() {
        System.out.println(name + " is eating");
    }
}

// Derived class (Parent)
class Dog extends Animal {

    void bark() {
        System.out.println(name + " is barking");
    }
}

// Derived class (Child)
class BabyDog extends Dog {

    void weep() {
        System.out.println(name + " is weeping");
    }
}

// Main class
public class Multilevel_Inheritance {
    public static void main(String[] args) {

        BabyDog d1 = new BabyDog();

        d1.name = "Tommy";   // inherited from Animal
        d1.eat();            // from Animal
        d1.bark();           // from Dog
        d1.weep();           // from BabyDog
    }
}
```

---

## 🔥 Output

```text id="mlout"
Tommy is eating
Tommy is barking
Tommy is weeping
```

---

## 🧠 Step-by-Step Explanation

### 🔹 Grandparent Class: Animal

* Contains variable `name`
* Contains method `eat()`

---

### 🔹 Parent Class: Dog

* Extends `Animal`
* Inherits `name` and `eat()`
* Adds method `bark()`

---

### 🔹 Child Class: BabyDog

* Extends `Dog`
* Inherits:

  * `name` (from Animal)
  * `eat()` (from Animal)
  * `bark()` (from Dog)
* Adds method `weep()`

---

### 🔹 Main Method

* Creates object of `BabyDog`
* Assigns value to `name`
* Calls all methods from all levels

---

## 💡 Applications (Detailed)

### 1. Academic System

* `Person` → `Student` → `GraduateStudent`
* Basic info in `Person`, course info in `Student`, research info in `GraduateStudent`

---

### 2. Employee Hierarchy

* `Employee` → `Manager` → `SeniorManager`
* Common salary logic in base class, higher responsibilities added step by step

---

### 3. Vehicle System

* `Vehicle` → `Car` → `ElectricCar`
* Basic features in vehicle, engine features in car, battery features in electric car

---

### 4. Software Systems

* `Application` → `WebApp` → `EcommerceApp`
* Core features → web features → business-specific features

---

### 5. Game Development

* `Character` → `Player` → `AdvancedPlayer`
* Basic abilities → player controls → advanced skills

---

## ⚠️ Important Points

* Inheritance happens in multiple levels
* Each child can access features from all previous levels
* `extends` keyword is used at every level
* Code reuse increases with hierarchy

---

## ⚡ Viva Ready Lines (Simple)

* Multilevel inheritance means inheritance in multiple levels
* A class can inherit from another class which is already inherited
* It allows step-by-step code reuse

---

## 🔚 Summary

* Multiple levels of inheritance
* Grandparent → Parent → Child
* Code reuse across all levels
* Helps build structured systems

---
