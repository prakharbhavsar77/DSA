package Array.Medium;



import java.util.HashMap;

/**
 * Problem: https://leetcode.com/problems/longest-consecutive-sequence/
 * 
 * Given an unsorted array of integers, find the length of the longest 
 * consecutive elements sequence.
 * 
 * You must write an algorithm that runs in O(n) time.
 */
public class Longest_Consecutive_Sequence {

    public static void main(String[] args) {

        int[] nums = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};

        int longestLength = 0;

        // Step 1: Store all unique elements in a map with a "visited" flag (false initially)
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, false);  // false = not visited
        }

        // Step 2: Traverse each number and expand in both directions
        for (int x : nums) {
            // Skip if already visited in a previous sequence
            if (map.get(x)) continue;

            int currentLength = 1;
            map.put(x, true);  // mark current as visited

            // Expand right (x+1, x+2, ...)
            int nextNum = x + 1;
            while (map.containsKey(nextNum) && !map.get(nextNum)) {
                map.put(nextNum, true);
                currentLength++;
                nextNum++;
            }

            // Expand left (x-1, x-2, ...)
            int prevNum = x - 1;
            while (map.containsKey(prevNum) && !map.get(prevNum)) {
                map.put(prevNum, true);  // BUG FIX: should be prevNum, not nextNum
                currentLength++;
                prevNum--;
            }

            // Update maximum sequence length
            longestLength = Math.max(longestLength, currentLength);
        }

        // Output the result
        System.out.println(longestLength);
    }
}
