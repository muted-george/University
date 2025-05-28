public class Password {

    public static void main(String[] args) {
        // Test cases
        System.out.println(verifyPassword("Password1!"));  // true
        System.out.println(verifyPassword("Pass1234"));    // false
        System.out.println(verifyPassword("p@ssword1"));   // false
        System.out.println(verifyPassword("P@ssw123"));    // true
    }

    public static boolean verifyPassword(String password) {
        // Check minimum length
        if (password.length() < 8) {
            return false;
        }

        // Initialize counters for character categories
        int lowercaseCount = 0;
        int uppercaseCount = 0;
        int digitCount = 0;
        int specialCount = 0;

        // Iterate over the password to count character types
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (Character.isLowerCase(c)) {
                lowercaseCount++;
            } else if (Character.isUpperCase(c)) {
                uppercaseCount++;
            } else if (Character.isDigit(c)) {
                digitCount++;
            } else if (isSpecialCharacter(c)) {
                specialCount++;
            }
        }

        // Check if all conditions are met
        return lowercaseCount >= 1 && uppercaseCount >= 1 && digitCount >= 1 && specialCount >= 1;
    }

    // Helper method to check if a character is a special character
    public static boolean isSpecialCharacter(char c) {
        // List of special characters (can be extended as needed)
        return "!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?".indexOf(c) >= 0;
    }
}
