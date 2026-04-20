# 🔷 Hierarchical Inheritance in Java

## 📌 What is Hierarchical Inheritance?

Hierarchical Inheritance is a type of inheritance where **multiple child classes inherit from a single parent class**.

👉 Structure:
**One Parent → Multiple Children**

---

## 🧠 Definition

Hierarchical inheritance allows **one base class to be extended by multiple derived classes**, sharing common features while having their own specific behaviors.

---

## 🔗 Basic Structure

```text id="hie1"
        Animal (Parent)
        /        \
     Dog        Cat
```

---

## 🔷 Why Use Inheritance?

* To reuse common code in multiple classes
* To reduce duplication
* To maintain a centralized structure
* To extend different behaviors from a single base

---

## 🔷 Syntax

```java id="hiesyn"
class Parent {
    // common properties
}

class Child1 extends Parent {
    // specific features
}

class Child2 extends Parent {
    // specific features
}
```

---

## ✅ Example Code

```java id="hiecode"
// Base class (Parent)
class Animal {
    String name;

    void eat() {
        System.out.println(name + " is eating");
    }
}

// Derived class 1 (Child)
class Dog extends Animal {

    void bark() {
        System.out.println(name + " is barking");
    }
}

// Derived class 2 (Child)
class Cat extends Animal {

    void meow() {
        System.out.println(name + " is meowing");
    }
}

// Main class
public class Hierarchical_Inheritance {
    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.name = "Tommy";
        d1.eat();     // from Animal
        d1.bark();    // from Dog

        Cat c1 = new Cat();
        c1.name = "Kitty";
        c1.eat();     // from Animal
        c1.meow();    // from Cat
    }
}
```

---

## 🔥 Output

```text id="hieout"
Tommy is eating
Tommy is barking
Kitty is eating
Kitty is meowing
```

---

## 🧠 Step-by-Step Explanation

### 🔹 Parent Class: Animal

* Contains variable `name`
* Contains method `eat()`
* Shared by all child classes

---

### 🔹 Child Class: Dog

* Extends `Animal`
* Inherits `name` and `eat()`
* Adds method `bark()`

---

### 🔹 Child Class: Cat

* Extends `Animal`
* Inherits `name` and `eat()`
* Adds method `meow()`

---

### 🔹 Main Method

* Creates objects of `Dog` and `Cat`
* Assigns different values to `name`
* Calls both shared and specific methods

---

## 💡 Applications (Detailed)

### 1. User Role System

* Base: `User`
* Child: `Admin`, `Customer`, `Seller`
* Common features in base, role-specific features in child classes

---

### 2. Vehicle System

* Base: `Vehicle`
* Child: `Car`, `Bike`, `Truck`
* Shared properties like speed, fuel; specific features per type

---

### 3. Employee System

* Base: `Employee`
* Child: `Manager`, `Developer`, `Designer`
* Same base data, different responsibilities

---

### 4. Education System

* Base: `Person`
* Child: `Student`, `Teacher`
* Shared identity, different roles

---

### 5. E-commerce Platform

* Base: `Product`
* Child: `Electronics`, `Clothing`, `Furniture`
* Common product info, category-specific features

---

## ⚠️ Important Points

* One parent class can have multiple child classes
* All child classes share common properties
* Each child class can have its own unique methods
* `extends` keyword is used

---

## ⚡ Viva Ready Lines (Simple)

* Hierarchical inheritance means one parent and multiple child classes
* Multiple classes share the same base class
* It helps reuse common code in different classes

---

## 🔚 Summary

* One parent → multiple children
* Shared features in parent
* Specific features in child classes
* Improves code organization

---
