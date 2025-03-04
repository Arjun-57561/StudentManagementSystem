// Name: Bontha Mallikarjun Reddy
// PRN: 23070126026
// Batch: SY - AIML A1

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager manager = new StudentManager();
        int choice;

        do {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student by PRN");
            System.out.println("4. Search Student by Name");
            System.out.println("5. Search Student by Position");
            System.out.println("6. Update Student");
            System.out.println("7. Delete Student");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    manager.addStudent();
                    break;
                case 2:
                    manager.displayStudents();
                    break;
                case 3:
                    manager.searchByPRN();
                    break;
                case 4:
                    manager.searchByName();
                    break;
                case 5:
                    manager.searchByPosition();
                    break;
                case 6:
                    manager.updateStudent();
                    break;
                case 7:
                    manager.deleteStudent();
                    break;
                case 8:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 8);

        scanner.close();
    }
}
