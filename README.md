# 🎯 Sprint 01.02 – Exceptions

---

## 📋 Description

- Use **Eclipse** or **IntelliJ** for all exercises.
- Follow the **best practices** document from **Sprint 0** to meet delivery requirements on GitHub repositories.
- You may create **Maven**, **Gradle**, or plain **Java** projects.
- ✍️ **Code in English**

---

## 🎯 Objectives

- Master **Exception Handling in Java**
- Build more **robust and error-resistant applications** 💪

---

## 📚 Exercise Overview

---

## 🧩 Level 1

### ✅ Exercise 1

Create a class named `Product` with the attributes:

- `name`
- `price`

And another class named `Sale`, which includes:

- A **collection of products**
- A **total sale price**

---

🔹 The `Sale` class must have a method `calculateTotal()` that throws a custom exception `EmptySaleException`, displaying:

```
To make a sale, you must first add products
```

- If the product list is **empty**, throw the exception.
- If not, **sum the prices** of all products and assign to the total.

---

🧨 Create the custom exception `EmptySaleException`, which extends `Exception`.
- The constructor should receive the same message.
- Use `.getMessage()` to show the message when caught.

---

⚠️ Also, write code to generate and catch an `IndexOutOfBoundsException`.

---

## 🧩 Level 2

### ✅ Exercise 1

Create a class called `Input` to handle **user input** and manage exceptions that may occur using Java's `Scanner`.

---

📌 Use **static methods** to read input from the keyboard.  
📌 If an exception is thrown, catch it and **prompt the user again** until valid input is received.

> 💡 Example: If the user inputs a `float` with a **dot** instead of a **comma**, show:
> ```
> Format error
> ```

---

### 📥 Methods (handling `InputMismatchException`):

```java
public static byte readByte(String message);
public static int readInt(String message);
public static float readFloat(String message);
public static double readDouble(String message);
```

---

### 📥 Methods (with custom exception - extends `Exception`):

```java
public static char readChar(String message);
public static String readString(String message);
public static boolean readYesNo(String message);
```

> ✳️ If the user enters “y”, return `true`; if “n”, return `false`.

---

## 🧩 Level 3

### ✅ Exercise 1

🎬 A cinema company wants an app to **reserve seats** in theaters.  
The app will be used by employees to sell tickets.

---

### ⚙️ Functionality

On startup, prompt the user for:

- Number of **rows**
- Number of **seats per row**

Then, display the menu:

```
1.- Show all reserved seats  
2.- Show seats reserved by a person  
3.- Reserve a seat  
4.- Cancel a seat reservation  
5.- Cancel all reservations of a person  
0.- Exit  
```

---

## 🧱 Classes to Implement

---

### 🧩 `Main`
- Contains the app's `main()` method
- Instantiates `Cinema` and calls `start()`

---

### 🧩 `Seat`

**Attributes:**
- `row`
- `seat`
- `personName`

**Methods:**
- Constructor (all attributes)
- Getters
- `equals()` → two seats are equal if row and seat are the same
- `toString()` → format:
  ```
  Row: 5, Seat: 20, Person: Maria Febrer
  ```

---

### 🧩 `Cinema`

**Attributes:**
- `rows`
- `seatsPerRow`
- `SeatManager` object
- `CinemaManager` object

**Methods:**
- Constructor: initializes everything and calls `requestInitialData()`
- `start()` – launches app and handles menu
- `requestInitialData()` – prompts user for rows and seats

---

### 🧩 `CinemaManager`

**Attributes:**
- `Cinema` object

**Methods:**
- Constructor
- `menu()`
- `showSeats()`
- `showSeatsByPerson()`
- `reserveSeat()`
- `cancelReservation()`
- `cancelReservationByPerson()`
- `inputPerson()` → throws `InvalidPersonNameException` if input has numbers
- `inputRow()` → throws `InvalidRowException` if invalid
- `inputSeat()` → throws `InvalidSeatException` if invalid

---

### 🧩 `SeatManager`

**Attributes:**
- `ArrayList<Seat> seats`

**Methods:**
- Constructor: initializes list
- `getSeats()`
- `addSeat(Seat)` → throws `SeatAlreadyReservedException` if already reserved
- `removeSeat(row, seat)` → throws `SeatNotReservedException` if not found
- `findSeat(row, seat)` → returns index or `-1`

---

## 💻 Technologies Used

- Java **JDK 21** (Oracle)
- IntelliJ IDEA or Eclipse
- Git & GitHub
- (Optional) Maven or Gradle for build automation

---

## 📋 Requirements

- Java Development Kit (**JDK 21**)
- Git (to clone the repository)
- A compatible IDE such as **IntelliJ IDEA** or **Eclipse**

---

## 🛠️ Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/DiegoBalaguer/S0102-Exceptions.git
   ```
2. **Open in your IDE**  
   Open IntelliJ IDEA or Eclipse and import the cloned project. If you're using Maven or Gradle, import it as a corresponding project type. Otherwise, import it as a regular Java project.

3. **Set up JDK**  
   Make sure the project is configured to use Oracle JDK 21. Set the language level to 21 if required.

---

## ▶️ Execution

To run the project:
1. Locate the class containing the main() method (usually in the main or app package).
2. Right-click the file and choose Run, or use the terminal:
   ```bash
   java Main
   ```
3. Interact with the console-based menu to test each exercise.

💡 Make sure the main() method is properly set as the entry point in case you're using a build system like Maven or Gradle.

---

## Deployment
### 🌐 Deployment

This is an educational project and is **not intended for production deployment**.

However, if you wish to package and run the application as a `.jar` file, follow these steps:

```bash

# Compile the main Java file
javac Main.java

# Package all class files into a runnable JAR named 'OOPExercises.jar'
jar cfe OOPExercises.jar Main *.class

# Execute the JAR file
java -jar OOPExercises.jar
```

---

## 📦 Repository

You can find the source code on GitHub:
🔗 https://github.com/DiegoBalaguer/S0102-Exceptions.git

---

## ✅ Author Notes

Feel free to fork, clone, or contribute to enhance the project. These exercises are designed as building blocks to strengthen your understanding of Java OOP through hands-on practice.

Happy coding! 🚀"# S0102-Exceptions" 
