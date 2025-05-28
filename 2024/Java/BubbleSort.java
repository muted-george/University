public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 5};

        // Print the unsorted array
        System.out.println("Unsorted array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();  // Move to the next line after printing the array

        int length = array.length;

        // Bubble sort implementation
        for (int i = 0; i < length - 1; i++) {
            for (int j = 1; j < length - i; j++) {
                if (array[j - 1] > array[j]) {
                    // Swap the elements
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }

        // Print the sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();  // Move to the next line after printing the array
    }
}
