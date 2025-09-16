package Array.HARD;

public class find_repeating_missing_number {

	 public static void main(String[] args) {
	        // Sample input array
	        int[] nums = {3, 5, 4, 1, 1};

	        // Find the repeating and missing numbers
	        int[] result = findMissingRepeatingNumbers(nums);

	        // Output the result
	        System.out.println("Repeating: " + result[0]);
	        System.out.println("Missing: " + result[1]);
	    }

	    
	    public static int[] findMissingRepeatingNumbers(int[] nums) {
	        int missing = -1;
	        int repeating = -1;

	        // Frequency array to count occurrences of each number
	        int[] freq = new int[nums.length + 1]; // Size n+1 for 1-based indexing

	        // Step 1: Count the frequency of each number
	        for (int i = 0; i < nums.length; i++) {
	            freq[nums[i]]++;
	        }

	        // Step 2: Find the number with freq 2 (repeating) and freq 0 (missing)
	        for (int i = 1; i <= nums.length; i++) {
	            if (freq[i] == 2) {
	                repeating = i;
	            } else if (freq[i] == 0) {
	                missing = i;
	            }
	        }

	        // Return the result as an array
	        return new int[]{repeating, missing};
	    }
	}