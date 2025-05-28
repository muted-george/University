import java.util.Scanner;

public class gradesManager {
    // Arrays to store student names and grades
    String[] studentNames = new String[100];
    int[] studentGrades = new int[100];
    int studentCount = 0;

    // Method to add a student and their grade
    void addStudent(String name, int grade) {
        studentNames[studentCount] = name;
        studentGrades[studentCount] = grade;
        studentCount++;
    }

    // Method to check the grade of a specific student
    String checkGrade(String name) {
        for (int i = 0; i < studentCount; i++) {
            if (studentNames[i].equals(name)) {
                return "Grade of " + name + ": " + studentGrades[i];
            }
        }
        return "Student not found";
    }

    // Method to display all students with their grades
    void displayAllStudents() {
        for (int i = 0; i < studentCount; i++) {
            System.out.println("Student: " + studentNames[i] + ", Grade: " + studentGrades[i]);
        }
    }
}

 class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        gradesManager gradesManager = new gradesManager();

        // students
        gradesManager.addStudent("Alice", 85);
        gradesManager.addStudent("Bob", 92);
        gradesManager.addStudent("Charlie", 78);

        // Check the grade of a specific student
        System.out.println("Enter the name of the student to check their grade:");
        String studentName = scanner.nextLine();
        System.out.println(gradesManager.checkGrade(studentName));

        // Display all students and their grades
        System.out.println("All students and their grades:");
        gradesManager.displayAllStudents();

        // Close my scanner
        scanner.close();
    }
}
