package  Array.EASY;

public class Second_Largest {

    /**
     * ✅ Find the largest and second largest elements in the array
     * 
     * Example:
     * Input:  [1, 54, 2, 98, 6, 8, 1321, 2]
     * Output: Max = 1321, Second Max = 98
     */

    public static void main(String[] args) {

        int[] arr = {1, 54, 2, 98, 6, 8, 1321, 2};

        // 📌 Initialize to smallest possible values
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            // 🔍 If current element is greater than max1
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            }
            // 🔍 If it's between max1 and max2 (but not equal to max1)
            else if (arr[i] > max2 && arr[i] != max1) {
                max2 = arr[i];
            }
        }

        System.out.println("Largest element: " + max1);
        System.out.println("Second largest element: " + max2);
    }
}
