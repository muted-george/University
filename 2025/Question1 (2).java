

import java.io.*;
import java.util.*;

public class Question1 {
    public static void main(String[] args) {
        try {
            File myObj = new File("C:\\Users\\georg\\IdeaProjects\\Thursdays\\src\\emails");
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine()) {
                String email = myReader.nextLine().trim();
                if (isValidEmail(email)) {
                    System.out.println(email + "valid email");
                } else {
                    System.out.println(email + "invalid email");
                }
            }
            myReader.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    // Method to check if an email address is valid
    public static boolean isValidEmail(String email) {

        // Split the email into username and domain
        String[] parts = email.split("@");
        if (parts.length != 2 || parts[0].isEmpty()) {
            return false; // Invalid username
        }

        // Check if the email has exactly one '@' symbol
        if (email.indexOf('@') == -1 || email.indexOf('@') != email.lastIndexOf('@')) {
            return false;
        }


        String domain = parts[1];
        if (domain.contains(" ") || !domain.contains(".") || domain.startsWith(".") || domain.endsWith(".")) {
            return false; // Invalid domain
        }

        // Check for invalid characters
        for (char ch : email.toCharArray()) {
            if (!(Character.isLetterOrDigit(ch) || ch == '@' || ch == '.' || ch == '-' || ch == '_')) { // If doesn't
                return false;
            }
        }

        return true; // If all true
    }

}
