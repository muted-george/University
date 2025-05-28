///**
// File name: InsertionSort.java
//
// A class to sort an array of integers using an insertion sort
// algorithm. Returns the elements of the original array,
// but in ascending order.
//
// Precondition: Every element of the array a has a value and
// the array has at least one value.
//
// Based on SelectionSort, Listing 7.10.
//
// Written by: Lew Rakocy
// email address: LRakocy@devrycols.edu
// Date: 7/3/99
// Changes: 09/01/2000 Prologue: email address & Based on.
// 03/13/2003 Made comments like text examples.
// */
//public class InsertionSort
//{
//    public static void sort(int[] a)
//    {
//        // Elements are read from the original array one at a time
//        // and inserted into temp array in their proper order.
//        // After all the elements have been processed temp contains
//        // the original array's elements in ascending order.
//
//        int[] temp = new int[a.length]; // Max size same as input array
//        int sizeOfTemp = 0;             // Initial size is zero
//        int next;                       // Next element to insert
//        int insertIndex;                // Insertion point into temp
//
//        // First element must go to first position in temp
//        // Assumes the array has at least one value.
//
//        temp[0] = a[0];
//        sizeOfTemp++;                   // Temp now has one element
//
//        // Must find insertion point for remaining values
//        // before inserting them.
//
//        for(int i = 1; i < a.length; ++i)
//        {
//            next = a[i];
//            insertIndex = findInsertIndex(next, temp, sizeOfTemp);
//            ++sizeOfTemp;
//            moveElements(insertIndex, temp, sizeOfTemp);
//            temp[insertIndex] = next;
//        }
//
//        // Done: copy temp to a
//
//        for(int i = 0; i < a.length; ++i)
//            a[i] = temp[i];
//    }
//
//    private static int findInsertIndex(
//            int value, int[] array, int tempSize)
//    {
//        int i;                 // Need exit value after loop
//        for( i = 0; i <tempSize; ++i)
//        {
//            if(value < array[i])
//                return(i);    // Insertion point found
//        }
//        return(i);                // Insertion point is after last element
//    }
//
//    private static void moveElements
//            (int lowIndex, int[] array, int highIndex)
//    {
//
//        if (lowIndex < highIndex) {
//            System.arraycopy(array, lowIndex, array, lowIndex + 1, highIndex - lowIndex);
//        }
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
//    }
