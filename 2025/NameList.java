import java.util.ArrayList;
import java.util.Scanner;

public class NameList {
    public static void main(String[] args) {
        // Create an empty list
        ArrayList<String> names = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Get 10 names from user input
        System.out.println("Enter the names of 10 people:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            String name = scanner.nextLine();
            names.add(name);
        }

        // Close the scanner
        scanner.close();

        // Display the names entered
        System.out.println("Names entered:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
