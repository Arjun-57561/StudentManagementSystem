import java.util.*;

public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addStudent() {
        System.out.print("Enter PRN: ");
        String prn = scanner.next();
        System.out.print("Enter Name: ");
        String name = scanner.next();
        System.out.print("Enter DoB (yyyy-mm-dd): ");
        Date dob = java.sql.Date.valueOf(scanner.next());
        System.out.print("Enter Marks: ");
        double marks = scanner.nextDouble();
        students.add(new Student(prn, name, dob, marks));
        System.out.println("Student added successfully!");
    }

    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        for (Student s : students) {
            s.display();
        }
    }

    public void searchByPRN() {
        System.out.print("Enter PRN to search: ");
        String prn = scanner.next();
        for (Student s : students) {
            if (s.getPrn().equals(prn)) {
                s.display();
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public void searchByName() {
        System.out.print("Enter Name to search: ");
        String name = scanner.next();
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(name)) {
                s.display();
            }
        }
    }

    public void searchByPosition() {
        System.out.print("Enter Position (Index): ");
        int pos = scanner.nextInt();
        if (pos >= 0 && pos < students.size()) {
            students.get(pos).display();
        } else {
            System.out.println("Invalid Position.");
        }
    }

    public void updateStudent() {
        System.out.print("Enter PRN to update: ");
        String prn = scanner.next();
        for (Student s : students) {
            if (s.getPrn().equals(prn)) {
                System.out.print("Enter New Marks: ");
                s.setMarks(scanner.nextDouble());
                System.out.println("Marks Updated!");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public void deleteStudent() {
        System.out.print("Enter PRN to delete: ");
        String prn = scanner.next();
        students.removeIf(s -> s.getPrn().equals(prn));
        System.out.println("Student removed!");
    }
}
