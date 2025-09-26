package Array.HARD;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Problem: https://leetcode.com/problems/majority-element-ii/
 * Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
 * Note: At most, there can be 2 such majority elements.
 */
public class Majority_N_3 {

    public static void main(String[] args) {
        int[] nums = {3, 2, 3};  // Sample input
        System.out.println(majorityElement(nums));  // Expected output: [3]
    }

    /**
     * This method finds all elements in the array that appear more than n/3 times.
     *
     * @param nums input array of integers
     * @return list of elements that appear more than n/3 times
     */
    public static List<Integer> majorityElement(int[] nums) {

        List<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        // Count frequency of each element
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Add elements with frequency > n/3 to the result list
        for (Integer key : freqMap.keySet()) {
            if (freqMap.get(key) > nums.length / 3) {
                result.add(key);
            }
        }

        return result;
    }
}
