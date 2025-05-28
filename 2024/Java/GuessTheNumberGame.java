import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(100) + 1;  // Random number between 1 and 100
        int numberOfAttempts = 0;
        int guess = 0;

        System.out.println("Welcome to the Guess the Number Game!");
        System.out.println("I have randomly chosen a number between 1 and 100.");
        System.out.println("Try to guess it!");

        while (guess != numberToGuess) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            numberOfAttempts++;

            if (guess < numberToGuess) {
                System.out.println("It's higher than " + guess + ". Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("It's lower than " + guess + ". Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + numberOfAttempts + " attempts.");
            }
        }

        scanner.close();
    }
}
