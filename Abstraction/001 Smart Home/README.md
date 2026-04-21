# 🏠 Problem 1: Smart Home Device Control System

## 📌 Problem Statement
A smart home system controls multiple devices from a single mobile app. Each device has its own behavior when turned on or off, but all are controlled in a unified way.

### 🔹 Sample Values:
- Light brightness: 70%
- Fan speed: 3
- AC temperature: 24°C

### 🔹 Requirements:
- A common abstract class `SmartDevice`
- All devices must implement:
  - `turnOn()`
  - `turnOff()`
  - `showStatus()`

### 🔹 Devices:
- Light → Brightness = 70%
- Fan → Speed = 3
- Air Conditioner → Temperature = 24°C

---

## 💡 Solution Approach

This problem is solved using **Object-Oriented Programming (OOP)** concepts, mainly:

### 1. Abstraction
An abstract class `SmartDevice` is created to define a common structure for all devices.

```java
abstract class SmartDevice {
    abstract void turnOn();
    abstract void turnOff();
    abstract void showStatus();
}

👉 This ensures that all devices must implement these methods.

2. Inheritance

Each device class extends the abstract class:

Light extends SmartDevice
Fan extends SmartDevice
AirConditioner extends SmartDevice
class Light extends SmartDevice

👉 This allows code reuse and structure consistency.

3. Polymorphism (Method Overriding)

Each device provides its own implementation of the same methods:

Light → brightness control
Fan → speed control
AC → temperature control
void showStatus() {
    System.out.println("Light brightness: 70%");
}

👉 Same method name, different behavior.

⚙️ Working Flow
System creates device objects
Each device is turned ON
Each device performs its own behavior
System displays status of all devices
🧾 Output Example
Light is ON
Fan is ON
AC is ON

Light brightness: 70%
Fan speed: 3
AC temperature: 24°C
🎯 Key OOP Concepts Used
Concept	Usage
Abstraction	Common blueprint (SmartDevice)
Inheritance	Device classes extend base class
Polymorphism	Same methods, different behavior
🧠 Real-Life Analogy

This system works like a real smart home app where:

One app controls all devices
Each device behaves differently
But all follow the same control structure
🚀 Conclusion

This project demonstrates how Abstraction, Inheritance, and Polymorphism work together to build a flexible and scalable system.