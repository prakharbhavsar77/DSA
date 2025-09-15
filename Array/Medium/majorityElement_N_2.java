package Array.Medium;

import java.util.HashMap;

public class majorityElement_N_2 {

    public static void main(String[] args) {

        int arr[] = {2, 2, 1, 1, 1, 2, 2};

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequencies
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int majorityCount = arr.length / 2;
        int majorityElement = -1;

        // Find the element with count > n/2
        for (Integer key : map.keySet()) {
            if (map.get(key) > majorityCount) {
                majorityElement = key;
                break;
            }
        }

        System.out.println("Majority Element: " + majorityElement);
    }
}
