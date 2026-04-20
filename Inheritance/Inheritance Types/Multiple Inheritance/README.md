# 🔷 Multiple Inheritance in Java

## 📌 What is Multiple Inheritance?

Multiple Inheritance is a type of inheritance where **a class inherits from more than one parent**.

👉 In Java, this is achieved using **interfaces**, not classes.

---

## 🧠 Definition

Multiple inheritance allows a class to **implement multiple interfaces and inherit their behaviors**, enabling it to use features from multiple sources.

---

## 🔗 Basic Structure

```text id="mul1"
Animal (Interface)      Pet (Interface)
        \                /
         \              /
              Dog (Class)
```

---

## 🔷 Why Use Inheritance?

* To combine features from multiple sources
* To increase flexibility in design
* To reuse method definitions
* To support multiple behaviors in a single class

---

## 🔷 Syntax

```java id="mulsyn"
interface A {
    void methodA();
}

interface B {
    void methodB();
}

class C implements A, B {

    public void methodA() {
        // implementation
    }

    public void methodB() {
        // implementation
    }
}
```

---

## ✅ Example Code

```java id="mulcode"
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

```text id="mulout"
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

* Implements both `Animal` and `Pet`
* Must define:

  * `eat()`
  * `play()`

---

### 🔹 Main Method

* Creates object of `Dog`
* Calls both methods implemented from interfaces

---

## 💡 Applications 

### 1. Smart Device Systems

* Interfaces: `Camera`, `MusicPlayer`
* Class: `Smartphone`
* A single device can support multiple features together

---

### 2. Payment Systems

* Interfaces: `OnlinePayment`, `OfflinePayment`
* Class: `PaymentGateway`
* Supports different payment methods in one system

---

### 3. Multi-Feature Applications

* Interfaces: `Login`, `Notification`
* Class: `UserSystem`
* Combines authentication and communication features

---

### 4. Game Development

* Interfaces: `Attack`, `Defend`
* Class: `Player`
* Player can perform multiple actions

---

### 5. Software Modules

* Interfaces: `Readable`, `Writable`
* Class: `FileManager`
* Handles both input and output operations

---

## ⚠️ Important Points

* Java does not support multiple inheritance using classes
* Multiple inheritance is achieved using interfaces
* A class can implement multiple interfaces
* All interface methods must be implemented
* Uses `implements` keyword

---

## ⚡ Viva Ready Lines 

* Multiple inheritance means one class inherits from multiple sources
* Java uses interfaces to support multiple inheritance
* A class can implement multiple interfaces

---

## 🔚 Summary

* One class → multiple interfaces
* Achieved using `implements`
* Combines multiple features
* Flexible and widely used

---
