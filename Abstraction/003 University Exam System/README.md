# 🎓 University Exam System

This project is a simple simulation of a university exam management system using Java. It shows how we can handle different types of exams (Programming, Theory, and Viva) using a unified structure.

---

## 📌 The Problem
A university needs a system to manage different types of examinations. While every exam has a different way of testing students, they all share a basic workflow:

- **Programming Exam:** Evaluated based on code and test cases.
- **Theory Exam:** Evaluated based on written answers.
- **Viva Exam:** Evaluated based on oral performance.

Regardless of the type, every exam must follow the same lifecycle: Start, Evaluate, and Show Results.

---

## 💡 How I Solved It
I used core OOP principles to keep the system organized:

* **Abstraction:** I defined an abstract class `Exam`. This acts as a blueprint, forcing every type of exam to implement the same three steps: `startExam()`, `evaluate()`, and `showResult()`.
* **Inheritance:** The `ProgrammingExam`, `TheoryExam`, and `VivaExam` classes inherit from the `Exam` base class.
* **Polymorphism:** Even though every exam class uses the same method names, they perform their tasks differently. For example, the `evaluate()` method in a Programming exam checks code, while in a Viva exam, it checks speaking performance.



---

## ⚙️ How it works
1. We create objects for different exam types.
2. We follow a standard sequence: first we start the exam, then evaluate the performance, and finally display the results.
3. The system automatically triggers the logic specific to each exam type.

---

## 🧾 Output Example
When you run the code, you will see the evaluation process for each exam:

```text
---- Programming Exam ----
Programming Exam Started
Evaluating based on code output and test cases
Programming Exam Marks: 85

---- Theory Exam ----
Theory Exam Started
Evaluating written answers
Theory Exam Marks: 78

---- Viva Exam ----
Viva Exam Started
Evaluating oral performance
Viva Exam Marks: 90