// 📌 LeetCode Link: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

package Binary_Search.one_d_array;

import java.util.Arrays;

public class FirstLastOccurrenceSortedArray {

    public static void main(String[] args) {
        // ✅ Hardcoded input
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        // 🔍 Call the method to get result
        int[] result = searchRange(nums, target);

        // 📌 Output the result
        System.out.println("Start and end positions of target " + target + ": " + Arrays.toString(result));
    }

    /**
     * This method finds the starting and ending position of a given target in a sorted array.
     *
     * @param nums   Sorted array of integers
     * @param target Target number to search for
     * @return An array with 2 elements: [start_index, end_index]
     */
    public static int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];

        // 🔹 Get index of first occurrence
        result[0] = findStartIndex(nums, target);

        // 🔹 Get index of last occurrence
        result[1] = findEndIndex(nums, target);

        return result;
    }

    /**
     * Uses binary search to find the first (leftmost) index of the target.
     *
     * @param nums   Sorted array
     * @param target Target value to find
     * @return Index of first occurrence or -1 if not found
     */
    public static int findStartIndex(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int index = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                index = mid;        // Potential answer found
                end = mid - 1;      // Search on the left side
            } else if (nums[mid] > target) {
                end = mid - 1;      // Target is on the left
            } else {
                start = mid + 1;    // Target is on the right
            }
        }

        return index;
    }

    /**
     * Uses binary search to find the last (rightmost) index of the target.
     *
     * @param nums   Sorted array
     * @param target Target value to find
     * @return Index of last occurrence or -1 if not found
     */
    public static int findEndIndex(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int index = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                index = mid;        // Potential answer found
                start = mid + 1;    // Search on the right side
            } else if (nums[mid] > target) {
                end = mid - 1;      // Target is on the left
            } else {
                start = mid + 1;    // Target is on the right
            }
        }

        return index;
    }
}
