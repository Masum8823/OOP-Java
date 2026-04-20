# 🔷 Single Inheritance in Java

## 📌 What is Single Inheritance?

Single Inheritance is a type of inheritance where **one child class inherits from only one parent class**.

👉 Structure:
**One Parent → One Child**

---

## 🧠 Definition

Single inheritance allows a class to **reuse properties and methods of another class** by extending it.

---

## 🔗 Basic Structure

```text id="k2h3jd"
Animal (Parent)
   ↓
  Dog (Child)
```

---

## 🔷 Why Use Inheritance?

* To reuse existing code
* To maintain a clear relationship between classes
* To reduce repetition
* To make code more structured and readable

---

## 🔷 Syntax

```java id="n8dj3k"
class Parent {
    // variables & methods
}

class Child extends Parent {
    // additional features
}
```

---

## ✅ Example Code

```java id="c7dj29"
// Base class (Parent)
class Animal {
    String name;

    void eat() {
        System.out.println(name + " is eating");
    }
}

// Derived class (Child)
class Dog extends Animal {

    void bark() {
        System.out.println(name + " is barking");
    }
}

// Main class
public class Single_Inheritance {
    public static void main(String[] args) {

        Dog d1 = new Dog();

        d1.name = "Tommy";   // inherited variable
        d1.eat();            // inherited method
        d1.bark();           // own method
    }
}
```

---

## 🔥 Output

```text id="o2jd83"
Tommy is eating
Tommy is barking
```

---

## 🧠 Step-by-Step Explanation

### 🔹 Parent Class: Animal

* Contains variable `name`
* Contains method `eat()`

---

### 🔹 Child Class: Dog

* Uses `extends Animal`
* Inherits `name` and `eat()`
* Adds new method `bark()`

---

### 🔹 Main Method

* Creates object of `Dog`
* Assigns value to `name`
* Calls both inherited and own methods

---

## 💡 Applications (Detailed)

### 1. User Management System

* Parent: `User` (name, email, login)
* Child: `Customer`, `Admin`
* Common features stay in parent, specific features go to child classes

---

### 2. Banking System

* Parent: `Account` (balance, deposit, withdraw)
* Child: `SavingsAccount`, `CurrentAccount`
* Each child can add specific rules (interest, limits)

---

### 3. Student Management System

* Parent: `Person` (name, age)
* Child: `Student`, `Teacher`
* Shared data stored once, extended where needed

---

### 4. E-commerce System

* Parent: `Product` (price, name)
* Child: `Electronics`, `Clothing`
* Each category can have its own extra features

---

### 5. Game Development

* Parent: `Character` (health, movement)
* Child: `Player`, `Enemy`
* Common behavior reused, roles differ

---

## ⚠️ Important Points

* `extends` keyword is required
* Child class can use parent’s public and protected members
* Private members are not directly accessible
* Method and variable reuse is the main goal

---

## ⚡ Viva Ready Lines (Simple)

* Single inheritance means one class inherits from one parent class
* It is used to reuse code
* It creates a parent-child relationship between classes

---

## 🔚 Summary

* One parent → one child
* Uses `extends`
* Helps reuse code
* Keeps code organized

---
