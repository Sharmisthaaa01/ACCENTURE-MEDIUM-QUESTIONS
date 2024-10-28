
/*
    You are given a 0-indexed integer array nums of even length consisting of an equal number of
    +ve and -ve numbers. (Arraylist Concept)

    I/P -> [3, 1, 2, -5, 2, -4]
    O/P -> [3, -2, 1, -5, 2, -4]
 */

package Mediumprb;

import java.util.ArrayList;
import java.util.List;

public class RearrangeArrElementsBySign {

    // Function to rearrange the array to alternate positive and negative numbers
    public static List<Integer> rearrangeArray(int[] nums) {
        // Create two ArrayLists to hold positive and negative numbers separately
        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();

        // Separate positive and negative numbers
        for (int num : nums) {
            if (num > 0) {
                positive.add(num);
            } else {
                negative.add(num);
            }
        }

        // Result list to store alternating positive and negative numbers
        List<Integer> result = new ArrayList<>();

        // Merge positive and negative numbers alternately
        for (int i = 0; i < positive.size(); i++) {
            result.add(positive.get(i));
            result.add(negative.get(i));
        }

        return result;
    }

    public static void main(String[] args) {
        // Input array
        int[] nums = {3, 1, 2, -5, -2, -4};

        // Call the function to rearrange the array
        List<Integer> result = rearrangeArray(nums);

        // Print the result
        System.out.println("Rearranged array: " + result);
    }
}

