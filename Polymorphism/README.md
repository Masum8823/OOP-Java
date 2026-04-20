# 🔷 Polymorphism in Java

## 📌 What is Polymorphism?

Polymorphism means **“one name, many forms”**.

👉 In Java, it means a **single method name can behave differently based on input or object type**.

---

## 🧠 Definition

Polymorphism allows a method or object to **take many forms depending on the situation (compile time or runtime)**.

---

## 🔗 Basic Idea

```text id="pj1"
Same Method Name → Different Behavior
```

Example:

* `add(int, int)` → integer addition
* `add(double, double)` → decimal addition
* `sound()` → different output in parent and child class

---

# 🔷 Types of Polymorphism in Java

## 1️⃣ Compile-Time Polymorphism (Static Binding)

👉 Achieved using:

* Method Overloading

---

## 🔹 Method Overloading

Same method name, different parameters.

### Example:

```java id="pj2"
class Calculator {

    void add(int a, int b) {
        System.out.println("Sum (int): " + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("Sum (3 int): " + (a + b + c));
    }

    void add(double a, double b) {
        System.out.println("Sum (double): " + (a + b));
    }
}

public class Test {
    public static void main(String[] args) {

        Calculator c = new Calculator();

        c.add(10, 20);
        c.add(1, 2, 3);
        c.add(5.5, 4.5);
    }
}
```

---

## 🔥 Compile-Time Key Point

* Decision happens at **compile time**
* Faster execution
* Same class

---

# 🔷 2️⃣ Run-Time Polymorphism (Dynamic Binding)

👉 Achieved using:

* Method Overriding

---

## 🔹 Method Overriding

Child class provides new implementation of parent method.

### Example:

```java id="pj3"
// Base class
class Animal {

    void sound() {
        System.out.println("Animal makes sound");
    }
}

// Child class
class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Main class
public class Test {
    public static void main(String[] args) {

        Animal a = new Dog();  // upcasting
        a.sound();             // runtime decision
    }
}
```

---

## 🔥 Run-Time Key Point

* Decision happens at **runtime**
* Uses inheritance
* Uses parent reference, child object

---

# 🔷 Difference Between Overloading & Overriding

| Feature     | Overloading   | Overriding   |
| ----------- | ------------- | ------------ |
| Type        | Compile-time  | Runtime      |
| Method name | Same          | Same         |
| Parameters  | Different     | Same         |
| Class       | Same class    | Parent-child |
| Binding     | Early binding | Late binding |

---

# 🔷 Real Applications

### 1. Banking System

* `deposit(int amount)`
* `deposit(double amount)`
* Different behaviors in different accounts

---

### 2. Game Development

* `attack()` behaves differently:

  * Warrior attack
  * Mage attack
  * Archer attack

---

### 3. Payment System

* `pay()`:

  * Bkash payment
  * Card payment
  * Cash payment

---

### 4. Shape System

* `area()`:

  * Circle area
  * Rectangle area
  * Triangle area

---

### 5. Employee System

* `work()`:

  * Developer work
  * Manager work

---

# ⚠️ Important Points

* Same method name, different behavior
* Two types: compile-time and runtime
* Overloading → no inheritance needed
* Overriding → inheritance required
* Core OOP concept in Java

---

# ⚡ Viva Ready Lines

* Polymorphism means one method, many behaviors
* It is of two types: method overloading and method overriding
* It improves flexibility and code reusability

---

# 🔚 Summary

* One name → multiple forms
* Overloading = compile-time
* Overriding = runtime
* Very important OOP concept in Java

---
