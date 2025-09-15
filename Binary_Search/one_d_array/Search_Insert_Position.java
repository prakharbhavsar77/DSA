package Binary_Search.one_d_array;

public class Search_Insert_Position {

    /**
     * 📌 LeetCode 35: Search Insert Position
     *
     * Given a sorted array and a target value, return the index if the target is found.
     * If not, return the index where it would be if it were inserted in order.
     *
     * Example:
     * Input: [1, 3, 5, 6, 23], target = 13
     * Output: 4 (13 would be inserted at index 4)
     */

    public static void main(String[] args) {

        // ✅ Sorted input array
        int[] arr = {1, 3, 5, 6, 23};

        // 🎯 Target to search for
        int target = 13;

        // 🔍 Initialize start and end pointers
        int start = 0;
        int end = arr.length - 1;

        // 🧠 Perform binary search
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                // 🎯 Target found at mid
                System.out.println("Target found at index: " + mid);
                return;
            } else if (arr[mid] > target) {
                end = mid - 1; // Move to left half
            } else {
                start = mid + 1; // Move to right half
            }
        }

        // 📌 If not found, 'start' is the correct insert position
        System.out.println("Target not found. Insert at index: " + start);
    }
}
