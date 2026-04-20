# 🔷 Inheritance in Java

## 📌 What is Inheritance?

Inheritance is a feature in Java where **one class can acquire properties (variables) and behaviors (methods) from another class**.

👉 It helps to **reuse code and build relationships between classes**.

---

## 🧠 Simple Definition

> Inheritance means one class gets features from another class.

---

## 🔗 Basic Idea

```text id="in1"
Parent Class → Child Class
```

Example:

* Animal → Dog
* Vehicle → Car
* Person → Student

---

## 🔷 Why Use Inheritance?

* To reuse code
* To reduce duplication
* To make code easy and organized
* To represent real-world relationships

---

## 🔷 Syntax

```java id="insyn"
class Parent {
    // variables and methods
}

class Child extends Parent {
    // extra features
}
```

👉 `extends` keyword is used for inheritance

---

## ✅ Simple Example

```java id="incode"
// Parent class
class Animal {
    String name;

    void eat() {
        System.out.println(name + " is eating");
    }
}

// Child class
class Dog extends Animal {

    void bark() {
        System.out.println(name + " is barking");
    }
}

// Main class
public class Test {
    public static void main(String[] args) {

        Dog d = new Dog();

        d.name = "Tommy";

        d.eat();   // inherited method
        d.bark();  // own method
    }
}
```

---

## 🔥 Output

```text id="inout"
Tommy is eating
Tommy is barking
```

---

## 🧠 How it works

* `Dog` class inherits `Animal` class
* So `Dog` can use:

  * `name` variable
  * `eat()` method
* And also has its own method `bark()`

---

## 🌍 Real-Life Applications

### 1. Banking System

* `Account` → base class
* `SavingsAccount`, `CurrentAccount` → child classes

---

### 2. School System

* `Person` → base class
* `Student`, `Teacher` → child classes

---

### 3. E-commerce System

* `User` → base class
* `Customer`, `Admin` → child classes

---

### 4. Vehicle System

* `Vehicle` → base class
* `Car`, `Bike`, `Truck` → child classes

---

## ⚠️ Important Points

* `extends` keyword is used
* Child class can use parent class features
* Private members are not directly accessible
* Java supports single inheritance (class to class)

---

## ⚡ Viva Ready Lines

* Inheritance means one class gets properties from another class
* It helps in code reuse
* It creates a parent-child relationship between classes

---

## 🔚 Summary

* One class uses features of another class
* Uses `extends` keyword
* Helps in code reuse and organization
* Very important concept in OOP

---
