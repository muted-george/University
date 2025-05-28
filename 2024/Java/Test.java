public class Test {
    public class AnagramChecker {
        public static boolean areAnagrams(String str1, String str2) {
            // Convert strings to lowercase and remove spaces (optional)
            str1 = str1.toLowerCase().replaceAll("\\s", "");
            str2 = str2.toLowerCase().replaceAll("\\s", "");

            // Initialize an array to count character occurrences
            int[] count = new int[26]; // Assuming only lowercase letters

            // Increment counts for characters in str1
            for (char c : str1.toCharArray()) {
                count[c - 'a']++;
            }

            // Decrement counts for characters in str2
            for (char c : str2.toCharArray()) {
                count[c - 'a']--;
            }

            // Check if all counts are zero
            for (int c : count) {
                if (c != 0) {
                    return false;
                }
            }

            return true;
        }

        public static void main(String[] args) {
            String input1 = "listen";
            String input2 = "silent";

            if (areAnagrams(input1, input2)) {
                System.out.println("The two strings are anagrams of each other.");
            } else {
                System.out.println("The two strings are not anagrams of each other.");
            }
        }
    }

}
