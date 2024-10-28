
/*
   Merge Sorted Array:

   I/P ->
   num1 = [1,2,3,0,0,0],  m=3
   num2 = [2,5,6],   n=3
   O/P -> [1. 2, 2, 3, 5, 6]
 */

package Mediumprb;

import java.util.Arrays;

public class MergeSortedArray {

    // Merge two sorted arrays
    public static void merge(int[] num1, int m, int[] num2, int n) {
        int i = m - 1;  // Pointer for num1's last element in the initial portion
        int j = n - 1;  // Pointer for num2's last element
        int k = m + n - 1;  // Pointer for the last position in num1

        // Start merging from the end of the arrays
        while (i >= 0 && j >= 0) {
            if (num1[i] > num2[j]) {
                num1[k] = num1[i];
                i--;
            } else {
                num1[k] = num2[j];
                j--;
            }
            k--;
        }

        // If there are remaining elements in num2, copy them to num1
        while (j >= 0) {
            num1[k] = num2[j];
            j--;
            k--;
        }
    }

    public static void main(String[] args) {
        int[] num1 = {1, 2, 3, 0, 0, 0};  // First array with space for the second
        int m = 3;  // Number of valid elements in num1

        int[] num2 = {2, 5, 6};  // Second array
        int n = 3;  // Number of elements in num2

        // Merge num2 into num1
        merge(num1, m, num2, n);

        // Print the merged sorted array
        System.out.println("Merged sorted array: " + Arrays.toString(num1));
    }
}
