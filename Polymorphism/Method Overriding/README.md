# 🔷 Method Overriding in Java

## 📌 What is Method Overriding?

Method Overriding is a feature in Java where a **child class provides a new implementation of a method that already exists in the parent class**.

👉 It is used to achieve **runtime polymorphism**.

---

## 🧠 Definition

Method overriding allows a subclass to **redefine a method of its parent class with the same method name, same parameters, and same return type**.

---

## 🔗 Basic Concept

```text id="or1"
Animal.sound()  → "Animal makes sound"
Dog.sound()     → "Dog barks"
```

Same method → Different behavior in child class

---

## 🔷 Why Use Method Overriding?

* To provide specific implementation in child class
* To achieve runtime polymorphism
* To improve flexibility of code
* To reuse method structure with different behavior

---

## 🔷 Syntax

```java id="orsyn"
class Parent {
    void method() {
        // original implementation
    }
}

class Child extends Parent {
    @Override
    void method() {
        // new implementation
    }
}
```

---

## ✅ Example Code

```java id="orcode"
// Base class
class Animal {

    void sound() {
        System.out.println("Animal makes sound");
    }
}

// Derived class
class Dog extends Animal {

    // Overriding method
    void sound() {
        System.out.println("Dog barks");
    }
}

// Main class
public class Method_Overriding {
    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.sound();  // calls overridden method
    }
}
```

---

## 🔥 Output

```text id="orout"
Dog barks
```

---

## 🧠 Step-by-Step Explanation

### 🔹 Parent Class Method

* `Animal` class has method `sound()`
* Default behavior: "Animal makes sound"

---

### 🔹 Child Class Override

* `Dog` class overrides `sound()` method
* Provides new behavior: "Dog barks"

---

### 🔹 Runtime Decision

* Java decides **which method to call at runtime**
* Based on object type

---

## 💡 Applications 

### 1. Payment Systems

* Parent: `Payment.process()`
* Child: `Bkash.process()`, `Card.process()`
* Each system processes payment differently

---

### 2. Banking Systems

* Parent: `Account.calculateInterest()`
* Child: `SavingsAccount`, `FixedAccount`
* Different interest logic

---

### 3. Game Development

* Parent: `Character.attack()`
* Child: `Warrior.attack()`, `Mage.attack()`
* Different attack styles

---

### 4. Employee Systems

* Parent: `Employee.work()`
* Child: `Developer.work()`, `Manager.work()`
* Different job behaviors

---

### 5. Vehicle Systems

* Parent: `Vehicle.move()`
* Child: `Car.move()`, `Bike.move()`
* Different movement behavior

---

## ⚠️ Important Points

* Method name must be same
* Parameters must be same
* Return type must be same (or compatible)
* Requires inheritance (`extends`)
* Happens at runtime

---

## ⚡ Viva Ready Lines 

* Method overriding means redefining parent class method in child class
* It is runtime polymorphism
* Same method, different behavior

---

## 🔚 Summary

* Same method name in parent and child
* Child class provides new implementation
* Requires inheritance
* Used for runtime behavior change

---
