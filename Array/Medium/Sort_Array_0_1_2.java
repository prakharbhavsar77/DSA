package Array.Medium;

/**
 * This class sorts an array containing only 0s, 1s, and 2s
 * using the Dutch National Flag Algorithm (single pass, O(n) time).
 */
public class Sort_Array_0_1_2 {

    public static void main(String[] args) {

        // Input array containing 0s, 1s, and 2s
        int arr[] = {1, 2, 2, 1, 0, 0, 0, 1, 2, 1};

        // Initialize pointers
        int low = 0;              // Pointer for the next position of 0
        int mid = 0;              // Current element being evaluated
        int high = arr.length - 1; // Pointer for the next position of 2

        // Traverse the array
        while (mid <= high) {
            if (arr[mid] == 0) {
                // Swap arr[low] and arr[mid] and move both pointers forward
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                // 1 is already in the correct position; just move mid forward
                mid++;
            } else { // arr[mid] == 2
                // Swap arr[mid] and arr[high], move only high pointer
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
                // Do not move mid here because the swapped element from high still needs to be evaluated
            }
        }

        // Print the sorted array
        System.out.print("Sorted array: ");
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
