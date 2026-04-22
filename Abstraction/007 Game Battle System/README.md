# ⚔️ Game Battle System

This project is a simple simulation of a game battle system using Java. It shows how we can manage different types of game characters (Warrior, Mage, and Archer) using a unified structure.

---

## 📌 The Problem
In a game, we have many different characters, and each character attacks in a unique way:
- **Warrior:** Uses brute strength.
- **Mage:** Uses powerful magic.
- **Archer:** Uses precise arrows.

Even though they have different combat styles, every character must follow the same gameplay flow: perform an `attack()` and show their current `status` (damage dealt).

---

## 💡 How I Solved It
To keep the game system organized and easy to expand, I used core OOP principles:



* **Abstraction:** I created an abstract class `GameCharacter`. This acts as a "character blueprint," forcing every character to have `attack()` and `displayStatus()` methods.
* **Inheritance:** The `Warrior`, `Mage`, and `Archer` classes all inherit from the `GameCharacter` base class. This ensures every character is part of the same system.
* **Polymorphism:** This is the best part! While every character uses the same `attack()` method, they all produce different results. When the Warrior attacks, it uses physical strength; when the Mage attacks, it casts spells—all triggered by the same method call.

---

## ⚙️ How it works
1. We create individual objects for each character type.
2. We call the `attack()` method to deal damage.
3. We call `displayStatus()` to see how much damage each character dealt based on their power.

---

## 🧾 Output Example
When you run the code, you will see the battle outcome for each character:

```text
---- Battle Start ----

Warrior attacks with brute strength!
Warrior Damage: 100.0

Mage casts powerful magic!
Mage Damage: 120.0

Archer shoots precise arrows!
Archer Damage: 52.5