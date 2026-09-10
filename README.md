# 🧮 Basal Metabolic Rate Calculator

A **desktop application developed in Java using Java Swing**, created to calculate a person's **Basal Metabolic Rate (BMR)** based on information such as weight, height, age, and gender.

The project was developed with a focus on practicing **Object-Oriented Programming (OOP)**, graphical user interface development, and code organization through separation of responsibilities.

---

## 📌 About the Project

The **Basal Metabolic Rate (BMR)** represents an estimate of the amount of energy the body requires each day to maintain its basic functions while at rest.

The application allows users to enter their information and automatically calculate their BMR, displaying the result in **kcal/day**.

### ✨ Features

* ⚖️ Weight input
* 📏 Height input
* 🎂 Age input
* ⚧️ Gender selection
* 🧮 Automatic BMR calculation
* ✅ Input data validation
* ⚠️ Error messages for invalid values
* 🖥️ Graphical user interface built with Java Swing
* 📊 BMR result displayed in kcal/day

---

## 🛠️ Technologies Used

* **Java**
* **Java Swing**
* **Object-Oriented Programming (OOP)**
* **IntelliJ IDEA**
* **JAR**
* **JPackage** for generating the executable

---

## 📂 Project Structure

The project follows an organization based on separation of responsibilities:

```text
src/
└── BMR/
    ├── Main.java
    │
    ├── model/
    │   └── CalculatorBmr.java
    │
    ├── util/
    │   └── Validator.java
    │
    └── view/
        └── MainWindow.java
```

### 📄 Main Classes

**`Main.java`**

Responsible for starting the application and creating the main window using the Swing Event Dispatch Thread.

**`CalculatorBmr.java`**

Contains the logic responsible for calculating the Basal Metabolic Rate based on the provided data.

**`Validator.java`**

Responsible for checking whether the values entered into the fields are valid numbers greater than zero.

**`MainWindow.java`**

Responsible for the application's graphical interface, receiving user input, triggering the calculation, and displaying the result.

---

## 🖥️ User Interface

The application features a simple and straightforward interface with fields for:

```text
Weight
Height
Age
Gender

[ Calculate ]

Result: XX.XX kcal/day
```

The goal is to provide an easy-to-use experience while keeping the application clean and free of unnecessary elements.

---

## 🚀 How to Run

### Option 1 — Run with IntelliJ IDEA

1. Clone this repository:

```bash
git clone https://github.com/SEU-USUARIO/basalMetabolicRate.git
```

2. Open the project in **IntelliJ IDEA**.
3. Navigate to:

```text
src/BMR/Main.java
```

4. Run the `Main.java` class.

---

### Option 2 — Run the JAR File

If Java is installed on your computer, you can also run the compiled version:

```bash
java -jar CalculadoraTMB.jar
```

---

### Option 3 — Windows Executable

The project also includes a Windows executable version:

```text
CalculadoraTMB.exe
```

Simply run the file to launch the application.

---

## 🧠 Concepts Practiced

Throughout the development of this project, several important software development concepts were applied, including:

* Object-Oriented Programming
* Separation of responsibilities
* Classes and objects
* Encapsulation
* Data validation
* Event handling
* Graphical User Interfaces
* Package organization
* Java compilation and executable generation

---

## 📚 Academic Purpose

This project was developed as a way to **practice Java and desktop application development**, applying concepts learned throughout my studies in **Systems Development**.

Beyond the calculation itself, the project demonstrates the use of **Java Swing for building graphical interfaces** and an organized code structure divided into different responsibilities.

---

## ⚠️ Disclaimer

The values provided by the application are **estimates** and are intended for educational purposes only. The results should not be used as a substitute for professional medical or nutritional evaluation.

---

## 👨‍💻 Developer

Developed by **Anderson Melo do Nascimento**.

This project was created for **learning, practice, and portfolio purposes**.

---

⭐ If you found this project useful or interesting, consider giving the repository a star!
