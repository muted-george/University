public class Question1 {
    public static boolean hasDuplicates(String[] arr) {
        String[] tempArray = new String[arr.length]; // array to store unique elements
        int count = 0; // unique elements

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;

            // Check if the element exists in the our array
            for (int j = 0; j < count; j++) {
                if (areStringsEqual(arr[i], tempArray[j])) {
                    isDuplicate = true;
                }
            }

            if (isDuplicate) {
                return true;
            }

            // If it's not a duplicate, add it to our array
            tempArray[count] = arr[i];
            count++;
        }

        // no duplicates, return false
        return false;
    }

    // Method to compare two Strings
    public static boolean areStringsEqual(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false; // none of the character match
            }
        }
        return true; // If all characters match, return true
    }

    public static void main(String[] args) {
        // Example usage
        String[] mainArray = {"BMW", "Porche", "Porche", "BMW", "Toyota", "Ford"};

        // Check if there are duplicates
        if (hasDuplicates(mainArray)) {
            System.out.println("The array contains duplicates.");
        } else {
            System.out.println("The array does not contain duplicates.");
        }
    }
}
