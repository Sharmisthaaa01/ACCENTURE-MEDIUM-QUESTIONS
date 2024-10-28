
/*
   Given an array, we have to find the number of occurrences of each element in the array.
   (using hashmap logic)

   I/P -> arr[] = {10, 5, 10, 15, 10, 5}

 */

package Mediumprb;
import java.util.Scanner;

public class NumOfOccurrences_EachElement {

    // Function to count occurrences using an array for frequency
    public static void countOccurrences(int[] arr, int maxValue) {
        // Create a frequency array to store the count of each element
        int[] frequencyArray = new int[maxValue + 1];

        // Traverse the array and update frequencies in the frequencyArray
        for (int num : arr) {
            frequencyArray[num]++; // increment the value of num
        }

        // Print elements with their frequencies
        System.out.println("Element frequencies:");
        for (int i = 0; i <= maxValue; i++) {
            if (frequencyArray[i] > 0) {
                System.out.println("Element: " + i + " | Frequency: " + frequencyArray[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the maximum value for the array elements
        System.out.print("Enter the maximum value in the array elements (non-negative): ");
        int maxValue = sc.nextInt();

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements (0 to " + maxValue + "): ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] < 0 || arr[i] > maxValue) {
                System.out.println("Invalid input. Please enter a number between 0 and " + maxValue);
                i--; // Ask for this element again
            }
        }

        // Call the function to count the occurrences of each element
        System.out.println("The number of occurrences for each element:");
        countOccurrences(arr, maxValue);

        sc.close(); // Close the scanner after use
    }
}


