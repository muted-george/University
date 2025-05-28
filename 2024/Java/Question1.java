import java.util.Arrays;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    //ask user for words
        System.out.println("Enter your word: ");
        String word = scanner.nextLine();

        System.out.println("Enter your anagram: ");
        String anagram = scanner.nextLine();

        // Check if they are anagrams
        if (isAnagram(word, anagram)) {
            System.out.println("These words are anagrams.");
        } else {
            System.out.println("These words are not anagrams.");
        }

        scanner.close();
    }

    //check if two strings are anagrams
    public static boolean isAnagram(String word, String anagram) {
        if (word.length() != anagram.length()) {
            return false;
        }

        // Convert strings to character arrays
        char[] letters1 = word.toCharArray();
        char[] letters2 = anagram.toCharArray();

        // Sort the character arrays
        Arrays.sort(letters1);
        Arrays.sort(letters2);

        // Compare the sorted arrays
        return Arrays.equals(letters1, letters2);
    }
}

