# 🏠 Smart Home Device Control System

This is a simple project to show how we can control different smart devices using Java. Imagine an app that controls your lights, fans, and AC—even though they work differently, they all follow the same control rules.

---

## 📌 The Problem
We need a smart system to manage different home devices. 
- **Light:** Should show brightness (e.g., 70%).
- **Fan:** Should show speed level (e.g., 3).
- **AC:** Should show temperature (e.g., 24°C).

All devices must be able to turn ON, turn OFF, and show their status.

---

## 💡 How I Solved It
I used Object-Oriented Programming (OOP) to make the code clean and easy to manage:

* **Abstraction:** I created a "blueprint" class called `SmartDevice`. It forces every device to have the same basic buttons (turnOn, turnOff, showStatus).
* **Inheritance:** The Light, Fan, and AC classes "inherit" from `SmartDevice`. This keeps everything organized.
* **Polymorphism:** Even though every device uses the same method names, they act differently. For example, when you ask for "status," the Light talks about brightness, while the AC talks about temperature.

---

## ⚙️ How it works
1. First, we create objects for the Light, Fan, and AC.
2. We use the `turnOn()` command to wake them up.
3. Finally, we use `showStatus()` to see what each device is doing.

---

## 🧾 What the output looks like
When you run the code, you will see this in your console:

```text
Turning ON all devices...

Light is ON
Fan is ON
AC is ON

Device Status:
Light brightness: 70%
Fan speed: 3
AC temperature: 24°C