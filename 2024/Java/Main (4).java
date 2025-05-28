//public class Main {
//    public static void sort(int[] a) {
//        if (a == null || a.length < 2) {
//            return; // No need to sort if array is null or has less than 2 elements
//        }
//        int[] temp = new int[a.length];
//        int sizeOfTemp = 0;
//        int next;
//        int insertIndex;
//
//        temp[0] = a[0];
//        sizeOfTemp++;
//
//        for (int i = 1; i < a.length; ++i) {
//            next = a[i];
//            insertIndex = findInsertIndex(next, temp, sizeOfTemp);
//            sizeOfTemp++;
//            moveElements(insertIndex, temp, sizeOfTemp);
//            temp[insertIndex] = next;
//        }
//
//        for (int i = 0; i < a.length; ++i)
//            a[i] = temp[i];
//    }
//
//    private static int findInsertIndex(int value, int[] array, int tempSize) {
//        int i;
//        for (i = 0; i < tempSize; ++i) {
//            if (value < array[i])
//                return i;
//        }
//        return i;
//    }
//
//    private static void moveElements(int lowIndex, int[] array, int highIndex) {
//        System.arraycopy(array, lowIndex, array, lowIndex + 1, highIndex - lowIndex);
//    }
//
//    public static void main(String[] args) {
//        int[] array = {5, 3, 8, 1, 2};
//        System.out.println("Original array:");
//        for (int num : array) {
//            System.out.print(num + " ");
//        }
//        System.out.println();
//
//        sort(array);
//
//        System.out.println("Sorted array:");
//        for (int num : array) {
//            System.out.print(num + " ");
//        }
//        System.out.println();
//    }
//}
