public class Bubble_Sort {

    public static void main(String[] args) {

        // Declare and initialize the array to be sorted
        int[] arr = {1, 3, 4, 12, 90, -8, 7};

        // Bubble Sort algorithm starts here
        // Outer loop: controls the number of passes
        for (int i = 0; i < arr.length - 1; i++) {

            // Inner loop: compares adjacent elements and swaps if needed
            // It goes up to (length - 1 - i) to avoid re-checking sorted elements at the end
            for (int j = 0; j < arr.length - 1 - i; j++) {

                // Swap if elements are in the wrong order (ascending sort)
                if (arr[j] > arr[j + 1]) {
                    // Temporary variable for swapping
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print the sorted array
        System.out.println("Sorted array in ascending order:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
