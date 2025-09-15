package Array.EASY;

public class MissingNumber {

    /**
     * 📌 LeetCode 268: Missing Number
     * 
     * Given an array containing n distinct numbers taken from 0 to n,
     * find the one number that is missing from the array.
     *
     * Input:  [9, 6, 4, 2, 3, 5, 7, 0, 1]
     * Output: 8
     */

    public static void main(String[] args) {

        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};

        int sum = 0;
        int n = nums.length;

        // 🔁 Calculate sum of all elements in the array
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }

        // 📐 Calculate expected sum of numbers from 0 to n
        int total = (n * (n + 1)) / 2;

        // 💡 The difference is the missing number
        int missing = total - sum;

        System.out.println("Missing number: " + missing);
    }
}
