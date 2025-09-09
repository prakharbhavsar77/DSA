package Array.EASY;

//https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/

public class CheckArraySortedRotated {

    public static void main(String[] args) {
        // Sample input array
        int[] array = {1, 2, 3, 4};

        // Check if the array is sorted and rotated
        System.out.println(isSortedAndRotated(array));
    }

    /**
     * This method checks whether the given array is sorted and rotated.
     * A sorted and rotated array has at most one place where the next element is smaller than the current.
     *
     * @param nums the input array
     * @return true if the array is sorted and rotated, false otherwise
     */
    public static boolean isSortedAndRotated(int[] nums) {
        int countDropPoints = 0;

        // Count the number of places where the current element is greater than the next one
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                countDropPoints++;
            }
        }

        // Also check the last and first element to consider rotation
        if (nums[nums.length - 1] > nums[0]) {
            countDropPoints++;
        }

        // Array is sorted and rotated if there is at most one drop point
        return countDropPoints <= 1;
    }
}
