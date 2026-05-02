# 🏏 Cricket Game (Java OOP) – Concept Revision Note

---

## 🧠 Core Idea
👉 Reference change ≠ Object change  
👉 Variable শুধু object কে point করে, data copy করে না

---

## 🔹 Object vs Reference

- Object → actual data (name, score)  
- Reference Variable (t1, t2...) → object এর address ধরে রাখে  

👉 Variable change করলে object change হয় না  
👉 Object change করলে সব reference এ reflect করে  

---

## 🔥 Reference Assignment Concept

### 📌 Rule:
👉 t1 = t2 মানে:
- t1 এখন t2 এর same object কে point করবে  
- নতুন object তৈরি হয় না  
- আগের object lost হয়ে যেতে পারে  

---

## 🔹 Object Sharing

👉 একাধিক variable একই object কে point করতে পারে  

➡️ যদি t1, t2, t3 same object কে point করে:  
- যেকোনো একটার মাধ্যমে change করলে → সবার value change হবে  

---

## 🔹 Data Modification Rule

👉 যে variable দিয়ে data change করা হবে,  
➡️ সেই object এর সব reference এ change reflect করবে  

---

## 🔹 Static Variable Concept

### 📌 static variable (totalMatches)

👉 Feature:
- সব object এর জন্য shared  
- একবার change হলে → সবার জন্য change  

👉 Use:
- total count রাখার জন্য  

---

## 🔹 Garbage Object

👉 যখন কোনো object কে কোনো variable point করে না:

- সেই object unreachable  
- Java automatically delete করে (Garbage Collection)  

---

## 🔹 Reference Switching Effect

👉 বারবার assignment করলে:
- variables → different object এ move করে  
- object → same থাকে  

---

## 🔹 Equality Check (==)

👉 t1 == t3 মানে:
- value compare না  
- memory address compare  

➡️ same object → true  
➡️ different object → false  

---

## 🎯 Exam Important Points

✅ Reference copy হয়, Object copy হয় না  
✅ Multiple variable → same object possible  
✅ Static variable → shared memory  
✅ Unused object → Garbage  
✅ == → reference compare করে  

---

## ⚡ Quick Revision Trick

👉 Variable = pointer  
👉 = মানে connection change  
👉 Same object = same output everywhere  

---

## 🧾 One Line Summary

👉 Java তে object না, reference move করে — তাই logic বুঝতে হলে pointer চিন্তা করতে হবে