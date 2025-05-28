public class Main {

    // Method to sort an array using Bubble Sort
    public static void simpleBubbleSort(int[] array) {
        // Get the length of the array
        int n = array.length;

        // Outer loop: controls the number of passes
        for (int i = 0; i < n - 1; i++) {
            // Inner loop: performs the comparisons and swaps in each pass
            for (int j = 0; j < n - i - 1; j++) {
                // If the current element is greater than the next element, swap them
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j + 1]
                    int temp = array[j];      // Store the value of array[j] in a temporary variable
                    array[j] = array[j + 1];  // Assign the value of array[j + 1] to array[j]
                    array[j + 1] = temp;      // Assign the value of temp to array[j + 1]
                }
            }
        }
    }

    // Main method: the starting point of the program
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] array = {5, 2, 9, 1, 5};

        // Print the array before sorting
        System.out.println("Before sorting:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        // Call the bubble sort method to sort the array
        simpleBubbleSort(array);

        // Print the array after sorting
        System.out.println("\nAfter sorting:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
