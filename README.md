# 💳 Java Bank Abstraction Project

## 📌 Project Overview
This is a simple Banking System project developed using Java.

The main goal of this project is to demonstrate **Abstraction** in Java along with:

- Inheritance
- Method Overriding
- Runtime Polymorphism
- Constructor Chaining

---

## 🏗 Project Structure

```
Bank_Abstraction_Java/
│
├── Account.java
├── SBI.java
├── Canara.java
└── Abstraction_Banking_Project.java
```

---

## 🧠 OOPS Concepts Used

### ✅ Abstraction
- `Account` is an abstract class.
- Abstract methods:
  - `deposite(double amt)`
  - `withdraw(double amt)`

### ✅ Inheritance
- `SBI` and `Canara` extend `Account`.

### ✅ Runtime Polymorphism
```
Account acc1 = new SBI("Naveen",10000);
```

---

## ▶ How to Run

### 1️⃣ Compile
```
javac Bank_Abstraction_Java/*.java
```

### 2️⃣ Run
```
java Bank_Abstraction_Java.Abstraction_Banking_Project
```

---

## 🎯 Sample Output

```
In SBI Amount Deposited Successfully
In Canara Amount Deposited Successfully
Withdrawn in SBI Successfull
Withdrawn in Canara Successfull
Total balance: ...
Total balance: ...
```

---

## 🛠 Technologies Used
- Java (JDK 21)
- VS Code

---

## 👨‍💻 Author
Naveen Raj K

---

⭐ This project is created for learning and understanding Java OOPS concepts.
