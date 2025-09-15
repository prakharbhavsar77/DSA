package Binary_Search.one_d_array;

public class Peak_Element {

    /**
     * 📌 LeetCode 852: Peak Index in a Mountain Array
     * 
     * Given a mountain array (strictly increasing then strictly decreasing),
     * find the index of the peak element using binary search.
     *
     * Example:
     * Input: [1,2,3,4,5,6,7,4,3,2,1]
     * Output: 6 (element 7 is the peak)
     */

    public static void main(String[] args) {
        // ✅ Input array (mountain array)
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 4, 3, 2, 1};

        // 🔍 Initialize pointers for binary search
        int start = 0;
        int end = arr.length - 1;

        // 🧠 Binary Search to find peak element
        while (start < end) {
            int mid = start + (end - start) / 2;

            // If mid is greater than next element, peak is to the left (including mid)
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                // Otherwise, peak is to the right
                start = mid + 1;
            }
        }

        // 🔚 At the end of loop, start == end and pointing to the peak element
        System.out.println("Peak index: " + start);
        System.out.println("Peak value: " + arr[start]);
    }
}
