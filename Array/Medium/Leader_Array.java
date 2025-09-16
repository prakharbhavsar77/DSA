package Array.Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leader_Array {

//https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1
	
	
    public static void main(String[] args) {
        
        int[] arr = {16, 17, 4, 3, 5, 2};
        
        List<Integer> leadersList = leaders(arr);
        
        System.out.println("Leaders in the array: " + leadersList);
    }

    private static List<Integer> leaders(int[] arr) {
        
        List<Integer> list = new ArrayList()<>();
        
        int max = Integer.MIN_VALUE;
        
        // Traverse from right to left
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                list.add(arr[i]);
            }
        }
        
        // Reverse the list to maintain left-to-right order
        Collections.reverse(list);
        return list;
    }
}

