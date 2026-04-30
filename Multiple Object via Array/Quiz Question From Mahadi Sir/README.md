# 📌 Java OOP Example – Inheritance, Overriding & Polymorphism

## 🔰 Project Overview
এই প্রোগ্রামটি Java এর Object-Oriented Programming (OOP) এর গুরুত্বপূর্ণ কিছু concept যেমন **Inheritance, Method Overriding, Polymorphism (Dynamic Binding)** বোঝানোর জন্য তৈরি করা হয়েছে।

---

## 🧱 Class Structure

### 🔹 Class A
- একটি private variable `x` আছে
- Constructor এর মাধ্যমে `x` initialize করা হয়
- `f()` method → `x + 2` return করে

### 🔹 Class B (extends A)
- Class A কে inherit করে
- Constructor এ `super(x)` দিয়ে parent constructor call করা হয়
- `f()` method override করা হয়েছে
- এখানে return: `super.f() + 3`

👉 মানে:  
B এর ক্ষেত্রে → `(x + 2) + 3 = x + 5`

---

## 🚀 Main Class Logic

### 🔸 Step 1: Array Declaration
```java
A[] arr = new A[5];
এখানে A টাইপের object array তৈরি করা হয়েছে
কিন্তু ভিতরে A এবং B দুটোই রাখা হচ্ছে (Polymorphism)
🔸 Step 2: Object Creation
for (int i = 0; i < arr.length; i++) {
    if (i % 2 == 0)
        arr[i] = new A(i);
    else
        arr[i] = new B(i);
}

👉 Logic:

Even index → A object
Odd index → B object
i	Object Type	Value
0	A	x=0
1	B	x=1
2	A	x=2
3	B	x=3
4	A	x=4
🔸 Step 3: Method Call & Sum
int v = arr[i].f();

👉 এখানে important বিষয়:

Compiler জানে arr হলো A type
কিন্তু runtime এ decide হয় কোন method call হবে
➡️ এটাকে Dynamic Binding / Runtime Polymorphism বলে
🧮 Execution Breakdown
i	Object	Calculation	Output
0	A(0)	0 + 2	2
1	B(1)	1 + 5	6
2	A(2)	2 + 2	4
3	B(3)	3 + 5	8
4	A(4)	4 + 2	6
🖨️ Final Output
2
6
4
8
6
26

👉 Last line (26) = সবগুলোর sum

🎯 Key Concepts Summary
✅ Inheritance

class B extends A → B, A এর property/method use করতে পারে

✅ Method Overriding

B class এ f() method নতুনভাবে define করা হয়েছে

✅ Polymorphism (Dynamic Binding)

একই reference (A[]) দিয়ে different object handle করা

✅ super Keyword
super(x) → parent constructor call
super.f() → parent method call
🧠 Easy Way to Remember
A → x + 2
B → x + 5
Even → A
Odd → B