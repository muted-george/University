import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declare variables
        int largest = 0;
        int smallest = 0;
        int sum = 0;
        int count = 0;
        boolean firstNumber = true; //  to track if it's the first number

        while (true) {
            System.out.print("Enter a positive number: ");
            int number = scanner.nextInt();

            // Check if the number is negative
            if (number < 0) {
                break; // Stop the loop if a negative number is entered
            }

            // If it's the first number entered, name largest and smallest
            if (firstNumber) {
                largest = number;
                smallest = number;
                firstNumber = false;
            } else {
                // Update largest and smallest numbers
                if (number > largest) {
                    largest = number;
                }
                if (number < smallest) {
                    smallest = number;
                }
            }

            // Add number to sum and increase count
            sum += number;
            count++;
        }

        if (count > 0) {
            // Calculate average as a double
            double average = (double) sum / count;
            System.out.println("Largest integer: " + largest);
            System.out.println("Smallest integer: " + smallest);
            System.out.println("Average: " + average);
        } else {
            System.out.println("No positive numbers were entered.");
        }
        // Close the scanner
        scanner.close();
    }
}