package com.sukrutha.gpt.questions;

public class HackerRankAsks {

    public static void main(String[] args) {
        // Reverse an array
        int[] array = {1, 2, 3, 4, 5, 78, 23, 32, 32, 64, 6};
        
        // Two-pointer approach
        int left = 0;                  // Start pointer
        int right = array.length - 1; // End pointer
        
        while (left < right) {
            // Swap the elements
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            
            // Move the pointers
            left++;
            right--;
        }

        // Print the reversed array
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
