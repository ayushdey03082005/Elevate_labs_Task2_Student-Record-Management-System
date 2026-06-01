# 📚 Student Record Management System

A console-based **Student Record Management System** built in Java as part of **Elevate Labs – Task 2**. The application allows users to perform full CRUD operations (Create, Read, Update, Delete) on student records via an interactive menu-driven interface.

---

## 🗂️ Project Structure

```
Elevate_labs_Task2_Student-Record-Management-System/
├── student.java          # Model class representing a student
├── studentManager.java   # Service class handling all CRUD operations
├── main.java             # Entry point with menu-driven UI
├── student.class         # Compiled bytecode
├── studentManager.class  # Compiled bytecode
└── main.class            # Compiled bytecode
```

---

## ✨ Features

- **Add Student** – Register a new student with a name and marks (0–100). IDs are auto-incremented.
- **View All Students** – Display all student records in a formatted table.
- **Update Student** – Modify the name and marks of an existing student by ID.
- **Delete Student** – Remove a student record by ID.
- **Search Student** – Look up a specific student record by ID.
- **Input Validation** – Handles invalid inputs gracefully (empty names, out-of-range marks, non-numeric entries).
- **Formatted Output** – Records are displayed in a clean ASCII table for readability.

---

## 🏗️ Architecture

The project follows a simple **3-class layered design**:

| Class | Role |
|---|---|
| `student` | Data model — stores `id`, `name`, and `marks` with getters/setters |
| `studentManager` | Business logic — manages an `ArrayList<student>` and provides CRUD methods |
| `main` | Presentation layer — runs the interactive console menu using `Scanner` |

---

## 🚀 Getting Started

### Prerequisites

- Java Development Kit (JDK) **8 or higher**
- A terminal / command prompt

### Clone the Repository

```bash
git clone https://github.com/ayushdey03082005/Elevate_labs_Task2_Student-Record-Management-System.git
cd Elevate_labs_Task2_Student-Record-Management-System
```

### Compile

```bash
javac student.java studentManager.java main.java
```

### Run

```bash
java main
```

---

## 🖥️ Usage

On launch, you will see the main menu:

```
==================================
 STUDENT RECORD MANAGEMENT SYSTEM
==================================

-----MENU-----
1. ADD STUDENTS
2. VIEW ALL STUDENTS
3. UPDATE STUDENTS
4. DELETE STUDENTS
5. SEARCH STUDENTS BY ID
6. EXIT

 Enter your choice:
```

Enter the number corresponding to the action you want to perform and follow the on-screen prompts.

### Example – Adding a Student

```
Enter your choice: 1
Enter Name: Alice Johnson
Enter Marks (0-100): 87.5

✅ student added successfully!
```

### Example – Viewing All Students

```
Enter your choice: 2

+-------+----------------------+--------+
| ID    | Name                 | Marks  |
+-------+----------------------+--------+
| 1     | Alice Johnson        |  87.50 |
| 2     | Bob Smith            |  73.00 |
+-------+----------------------+--------+
```

### Example – Searching by ID

```
Enter your choice: 5
Enter Student ID to search: 1

+-------+----------------------+--------+
| ID    | Name                 | Marks  |
+-------+----------------------+--------+
| 1     | Alice Johnson        |  87.50 |
+-------+----------------------+--------+
```

---

## 🔍 Class Reference

### `student`

| Member | Type | Description |
|---|---|---|
| `id` | `int` | Auto-assigned unique student identifier |
| `name` | `String` | Student's full name |
| `marks` | `double` | Student's marks (0–100) |
| `getId()` | method | Returns the student's ID |
| `getName()` | method | Returns the student's name |
| `getMarks()` | method | Returns the student's marks |
| `setName(String)` | method | Updates the student's name |
| `setMarks(double)` | method | Updates the student's marks |
| `toString()` | method | Returns a formatted table row string |

### `studentManager`

| Method | Description |
|---|---|
| `addStudent(name, marks)` | Creates and stores a new student |
| `viewAllStudents()` | Prints all students in table format |
| `updateStudent(id, name, marks)` | Updates an existing student's details |
| `deleteStudent(id)` | Removes a student by ID |
| `searchStudent(id)` | Finds and prints a single student by ID |

---

## ⚠️ Input Validation

The application validates all user inputs:

- **Name** must not be empty.
- **Marks** must be a numeric value between `0` and `100`.
- **IDs** must be valid integers; a helpful error message is shown otherwise.
- Operations on non-existent IDs print a `❌ not found` message instead of crashing.

---

## 📝 Notes

- Data is stored **in memory** only. All records are lost when the program exits (no file or database persistence).
- Student IDs are sequential and start at `1`, incrementing automatically with each new addition.

---

## 👤 Author

**Ayush Dey**
[GitHub – ayushdey03082005](https://github.com/ayushdey03082005)

---

## 📄 License

This project is open-source and available for educational use.
