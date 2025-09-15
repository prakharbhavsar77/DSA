package  Array.EASY;

public class Max_Consecutive_One {

    /**
     * 📌 LeetCode 485: Max Consecutive Ones
     * 
     * Given a binary array `nums`, return the maximum number of consecutive 1s in the array.
     * 
     * Example:
     * Input: [1, 1, 1, 1, 1, 1, 0, 1, 1, 1]
     * Output: 6
     */

    public static void main(String[] args) {
        // ✅ Input binary array
        int[] nums = {1, 1, 1, 1, 1, 1, 0, 1, 1, 1};

        int max = 0;     // Stores max consecutive 1s
        int count = 0;   // Current consecutive 1s counter

        // 🔁 Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++; // Increase counter for 1s
            } else {
                count = 0; // Reset if 0 is found
            }

            max = Math.max(max, count); // Update max if current streak is longer
        }

        // 🖨️ Print the result
        System.out.println("Max consecutive 1s: " + max);
    }
}
