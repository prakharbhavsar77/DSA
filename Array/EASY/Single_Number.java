package Array.EASY;

public class Single_Number {


    /**
     * 📌 LeetCode 136: Single Number
     * 
     * Given a non-empty array of integers where every element appears twice except for one,
     * find that single one.
     *
     * XOR Trick:
     * - a ^ a = 0
     * - a ^ 0 = a
     * - XOR is commutative and associative
     *
     * So: a ^ b ^ a = (a ^ a) ^ b = 0 ^ b = b
     */

    public static void main(String[] args) {

        int[] arr = {4, 1, 2, 1, 2};

        int unique = 0;

        // 🔁 XOR all elements
        for (int i = 0; i < arr.length; i++) {
            unique ^= arr[i];
        }

        System.out.println("Single number: " + unique);
    }
}