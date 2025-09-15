package Array.Medium;

// 📌 LeetCode 53: https://leetcode.com/problems/maximum-subarray/

public class Kdanes {

    /**
     * ✅ Kadane's Algorithm - Maximum Subarray Sum
     *
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     *
     * Handles all-negative arrays correctly.
     * 
     * Example:
     * Input: [5, 4, -1, 7, 8]
     * Output: 23 (entire array)
     */

    public static void main(String[] args) {

        int[] arr = {5, 4, -1, 7, 8};

        int currentSum = arr[0]; // Initialize with first element
        int maxSum = arr[0];     // Initialize max with first element

        for (int i = 1; i < arr.length; i++) {
            // At each step, choose between starting new subarray or extending current
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        System.out.println("Maximum subarray sum: " + maxSum);
    }
}

