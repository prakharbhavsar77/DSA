package Binary_Search.Answer;

public class Binary_Search_answer {

    /**
     * 📌 LeetCode 69: Sqrt(x)
     * 
     * Given a non-negative integer x, return the square root of x rounded down to the nearest integer.
     * The returned integer should be the **floor of sqrt(x)**.
     * 
     * Example:
     * Input: 28
     * Output: 5 (since 5*5 = 25 and 6*6 = 36 > 28)
     */

    public static void main(String[] args) {

        int n = 28;  // 🎯 Number to find square root of

        int start = 0;
        int end = n;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // If mid*mid == n, exact square root found
            if (mid * mid == n) {
                System.out.println("Exact square root: " + mid);
                return;
            }

            // If mid*mid > n, move to left half
            else if (mid * mid > n) {
                end = mid - 1;
            }

            // Else move to right half
            else {
                start = mid + 1;
            }
        }

        // If exact square root not found, floor value is in 'end'
        System.out.println("Floor square root: " + end);
    }
}
