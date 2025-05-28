import java.io.*;
import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {
        // Ask the user for the words they want to count
        Scanner userInput = new Scanner(System.in);
        System.out.println("Which words do you want to count?");
        String inputWords = userInput.nextLine();  // Read user input

        // Split the input into individual words
        String[] words = inputWords.split(" ");

        // Array to hold the word counts
        int[] wordCounts = new int[words.length];

        // Path to the file
        String filePath = "C:\\Users\\georg\\IdeaProjects\\Term4 w4\\src\\input.txt";

        // Open the file and count the words
        try (Scanner fileScanner = new Scanner(new File(filePath))) {  // Initialize inside try-with-resources
            while (fileScanner.hasNext()) {
                String fileWord = fileScanner.next();  // Read a word from the file
                fileWord = fileWord.replaceAll("[^a-zA-Z]", "").toLowerCase();  // Clean the word

                // Count if the word is one of the user's words
                for (int i = 0; i < words.length; i++) {
                    if (fileWord.equals(words[i].toLowerCase())) {
                        wordCounts[i]++;  // Increment count for the word
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found!");
            return;
        }

        // Print the results
        System.out.println("Word count:");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i] + ": " + wordCounts[i]);  // Print each word with its count
        }
    }
}
