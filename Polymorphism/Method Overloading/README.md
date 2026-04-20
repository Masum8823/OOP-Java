# 🔷 Method Overloading in Java

## 📌 What is Method Overloading?

Method Overloading is a feature in Java where **multiple methods have the same name but different parameters**.

👉 It is used to perform **similar operations in different ways**.

---

## 🧠 Definition

Method overloading allows a class to have **multiple methods with the same name but different parameter lists (type, number, or order of parameters)**.

---

## 🔗 Basic Concept

```text id="ov1"
add(int, int)
add(int, int, int)
add(double, double)
```

Same name → Different parameters

---

## 🔷 Why Use Method Overloading?

* To improve code readability
* To perform similar tasks with different inputs
* To reduce method name complexity
* To achieve compile-time polymorphism

---

## 🔷 Syntax

```java id="ovsyn"
class ClassName {

    void method(int a, int b) {
        // logic
    }

    void method(int a, int b, int c) {
        // logic
    }

    void method(double a, double b) {
        // logic
    }
}
```

---

## ✅ Example Code

```java id="ovcode"
class Calculator {

    // Method 1: two integers
    void add(int a, int b) {
        System.out.println("Sum of 2 integers: " + (a + b));
    }

    // Method 2: three integers
    void add(int a, int b, int c) {
        System.out.println("Sum of 3 integers: " + (a + b + c));
    }

    // Method 3: two double values
    void add(double a, double b) {
        System.out.println("Sum of 2 doubles: " + (a + b));
    }
}

// Main class
public class Method_Overloading {
    public static void main(String[] args) {

        Calculator c1 = new Calculator();

        c1.add(10, 20);        // calls method 1
        c1.add(10, 20, 30);    // calls method 2
        c1.add(5.5, 4.5);      // calls method 3
    }
}
```

---

## 🔥 Output

```text id="ovout"
Sum of 2 integers: 30
Sum of 3 integers: 60
Sum of 2 doubles: 10.0
```

---

## 🧠 Step-by-Step Explanation

### 🔹 Same Method Name

* All methods are named `add()`
* But behavior depends on parameters

---

### 🔹 Different Parameters

* `add(int, int)` → 2 integers
* `add(int, int, int)` → 3 integers
* `add(double, double)` → decimals

---

### 🔹 Compile-Time Decision

* Java decides which method to call **at compile time**
* Based on arguments passed

---

## 💡 Applications (Detailed)

### 1. Calculator Systems

* Same operation (add, multiply) with different inputs
* Example: integers, floats, doubles

---

### 2. Banking Systems

* deposit(int amount)
* deposit(int amount, String accountType)
* deposit(double amount)

---

### 3. Game Development

* move(int steps)
* move(int x, int y)
* move(double speed)

---

### 4. Printing Systems

* print(String text)
* print(int number)
* print(double value)

---

### 5. Data Processing Systems

* process(int data)
* process(String data)
* process(double data)

---

## ⚠️ Important Points

* Method name must be same
* Parameters must be different
* Return type alone cannot define overloading
* It is compile-time polymorphism
* Happens inside the same class

---

## ⚡ Viva Ready Lines (Simple)

* Method overloading means same method name with different parameters
* It is compile-time polymorphism
* It improves code readability

---

## 🔚 Summary

* Same method name
* Different parameters
* Compile-time decision
* Used for flexibility and readability

---
