public class Question3 {

    public static String[] removeDuplicates(String[] arr) {
        String[] Array = new String[arr.length];
        int count = 0; // This will count the unique elements

        // Loop through the main array
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;

            // Check if the element exists in the main array
            for (int j = 0; j < count; j++) {
                if (areStringsEqual(arr[i], Array[j])) {
                    isDuplicate = true; // It's a duplicate
                }
            }

            // If it's not a duplicate, add it to our Array
            if (!isDuplicate) {
                Array[count] = arr[i];
                count++; // Increment the count of unique elements
            }
        }

        // Now, we need to create an array of the correct size
        String[] result = new String[count];
        for (int i = 0; i < count; i++) {
            result[i] = Array[i]; // add elements to the result array
        }

        return result;
    }

    // Method to check if two Strings are equal
    public static boolean areStringsEqual(String str1, String str2) {
        for (int i = 0; i < str1.length(); i++) {
            //compare each character
            if (str1.charAt(i) != str2.charAt(i)) {
                return false; // If characters don't match, return false
            }
        }

        return true; // If all characters match, return true
    }

    public static void main(String[] args) {
        // My main array WITH duplicates
        String[] mainArray = {"BMW", "Porche", "Porche", "BMW", "Toyota", "Ford"};

        // Remove the duplicates
        String[] result = removeDuplicates(mainArray);

        System.out.println("Array without dupes:");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
