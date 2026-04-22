# ⚡ Smart Home Power Monitoring System

This project is a simple Java application that calculates and displays the power consumption of different smart home devices. It’s a great way to see how OOP (Object-Oriented Programming) can make our code flexible and organized.

---

## 📌 The Problem
We need a way to monitor the power usage of various home appliances. Even though each device consumes a different amount of electricity (Light: 50W, Fan: 75W, AC: 1500W), they all need to be controlled in a uniform way.

Every device must support three basic actions:
1. Turn ON
2. Turn OFF
3. Show current power usage

---

## 💡 How I Solved It
To keep the system scalable, I used three core OOP concepts:



* **Abstraction:** I created an abstract class `SmartDevice`. Think of this as a "standard control panel." It forces every device class to include the necessary methods (`turnOn`, `turnOff`, `showPowerUsage`).
* **Inheritance:** `Light`, `Fan`, and `AirConditioner` classes inherit from the `SmartDevice` base class. This ensures they all follow the same "rules."
* **Polymorphism:** Although all devices use the same method names, they have their own specific logic. For example, the `showPowerUsage()` method for the AC reports a much higher value than the Light, even though the command is the same.

---

## ⚙️ How it works
1. The system creates individual objects for each device.
2. When we turn them on, each device sets its own power consumption value.
3. Finally, the system displays the total power usage report for all active devices.

---

## 🧾 Output Example
When you run the code, you will see how each device reports its energy consumption:

```text
Turning ON all devices...

Light is ON
Fan is ON
AC is ON

Power Usage:
Light Power Usage: 50W
Fan Power Usage: 75W
AC Power Usage: 1500W

Turning OFF all devices...