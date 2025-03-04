# Student Management System

-- Directly Committed from GIT BASH --

## 📖 Project Description

This Java project implements a **Student Management System** using **ArrayList**. The system allows users to:

1. **Add Students** - Store student details like PRN, Name, Date of Birth, and Marks.
2. **Display Students** - View all stored student records.
3. **Search Students** - Search by PRN, Name, or Position.
4. **Update Student Details** - Modify existing student records.
5. **Delete Students** - Remove a student record from the list.

This project follows proper **coding guidelines**, includes **detailed comments**, and ensures **modular implementation**.

## 📂 Project Structure

StudentManager/:
- │── Main.java               # Entry point of the program
- │── Student.java            # Represents student attributes
- │── StudentManager.java     # Handles student operations using ArrayList
- │── README.md               # Project documentation and instructions

## ⚡ Functions & Methods

| File                | Function                      | Description |
|---------------------|-----------------------------|-------------|
| Student.java       | - Constructor & Getters/Setters | Defines student attributes (PRN, Name, DoB, Marks) |
| StudentManager.java | addStudent()                 | Adds a new student to the ArrayList |
|                     | displayStudents()            | Displays all students in the list |
|                     | searchByPRN()                | Searches a student by PRN |
|                     | searchByName()               | Searches students by Name |
|                     | searchByPosition()           | Searches a student by position |
|                     | updateStudent()              | Updates student details |
|                     | deleteStudent()              | Removes a student from the ArrayList |

## 🛠️ **How to Run**:

1. Open Command Prompt and navigate to your project folder using:
   ```sh
   cd path_to_your_folder
   ```
2. Compile the Main.java file using:
   ```sh
   javac Main.java
   ```
3. After compilation, run the program using:
   ```sh
   java Main
   ```
4. Follow the on-screen menu to manage students!

## 📌 Example Output

```
===== Student Management System =====
1. Add Student
2. Display Students
3. Search Student
4. Update Student
5. Delete Student
6. Exit
Enter your choice: 1
Enter PRN: 12345
Enter Name: John Doe
Enter Date of Birth (YYYY-MM-DD): 2001-06-15
Enter Marks: 85
Student added successfully!
```

## 📜 Contributors

- **Your Name** - [GitHub Profile](https://github.com/Arjun-57561)

## 📄 License

This project is open-source and free to use.

---
Let me know if you need further refinements! 🚀

