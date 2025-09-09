package Array.EASY;

//https://leetcode.com/problems/move-zeroes/description/

public class MoveZeroToEnd {

    public static void main(String[] args) {

        // Input array with zeros
        int[] array = {0, 1, 2, 0, 0, 2, 0, 0, 9};

        // Index to place the next non-zero element
        int insertPosition = 0;

        // First pass: move all non-zero elements to the front
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                array[insertPosition] = array[i];
                insertPosition++;
            }
        }

        // Second pass: fill remaining positions with zeros
        while (insertPosition < array.length) {
            array[insertPosition] = 0;
            insertPosition++;
        }

        // Output the updated array
        System.out.println("Array after moving zeros to the end:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
