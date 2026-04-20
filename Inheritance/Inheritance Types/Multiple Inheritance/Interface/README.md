# 🔷 Interface in Java

## 📌 What is an Interface?

An Interface is a **blueprint of a class** that contains **abstract methods (without body)** and is used to achieve **abstraction and multiple inheritance**.

👉 A class uses an interface by implementing it.

---

## 🧠 Definition

An interface is a reference type in Java that contains **method declarations (no implementation)**, and any class that implements the interface must provide the method definitions.

---

## 🔗 Basic Structure

```text id="int1"
Animal (Interface)      Pet (Interface)
        \                /
         \              /
              Dog (Class)
```

---

## 🔷 Why Use Interface?

* To define common rules for different classes
* To achieve multiple inheritance
* To enforce method implementation
* To build flexible and scalable systems

---

## 🔷 Syntax

```java id="intsyn"
interface InterfaceName {
    void method1();
    void method2();
}

class ClassName implements InterfaceName {
    public void method1() {
        // implementation
    }

    public void method2() {
        // implementation
    }
}
```

---

## ✅ Example Code

```java id="intcode"
// Interface 1
interface Animal {
    void eat();
}

// Interface 2
interface Pet {
    void play();
}

// Class implementing multiple interfaces
class Dog implements Animal, Pet {

    public void eat() {
        System.out.println("Dog is eating");
    }

    public void play() {
        System.out.println("Dog is playing");
    }
}

// Main class
public class Multiple_Inheritance {
    public static void main(String[] args) {

        Dog d1 = new Dog();

        d1.eat();   // from Animal interface
        d1.play();  // from Pet interface
    }
}
```

---

## 🔥 Output

```text id="intout"
Dog is eating
Dog is playing
```

---

## 🧠 Step-by-Step Explanation

### 🔹 Interface: Animal

* Declares method `eat()`
* No implementation

---

### 🔹 Interface: Pet

* Declares method `play()`
* No implementation

---

### 🔹 Class: Dog

* Uses `implements Animal, Pet`
* Must define:

  * `eat()`
  * `play()`

---

### 🔹 Main Method

* Object of `Dog` is created
* Calls both implemented methods

---

## 💡 Applications (Detailed)

### 1. Payment Systems

* Interface: `Payment` → method `pay()`
* Classes: `Bkash`, `Card`, `Nagad`
* Each class implements its own payment logic

---

### 2. Authentication Systems

* Interface: `Login` → method `authenticate()`
* Classes: `EmailLogin`, `GoogleLogin`, `FacebookLogin`
* Different login methods follow same structure

---

### 3. Notification Systems

* Interface: `Notification` → method `send()`
* Classes: `EmailNotification`, `SMSNotification`, `PushNotification`
* Each type sends messages differently

---

### 4. Media Player Systems

* Interface: `Playable` → method `play()`
* Classes: `AudioPlayer`, `VideoPlayer`
* Both follow same rule but behave differently

---

### 5. E-commerce System

* Interface: `Discount` → method `applyDiscount()`
* Classes: `FestivalDiscount`, `MemberDiscount`
* Different discount strategies implemented

---

## ⚠️ Important Points

* Interface methods are public and abstract by default
* Cannot create object of an interface
* Class must implement all methods
* Supports multiple inheritance
* Uses `implements` keyword

---

## ⚡ Viva Ready Lines (Simple)

* Interface is a blueprint with abstract methods
* A class implements an interface
* It is used for multiple inheritance and abstraction

---

## 🔚 Summary

* Contains only method declarations
* No object can be created
* Must be implemented by a class
* Supports multiple inheritance

---
