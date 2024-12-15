package JavaProgramListPackage;

import java.util.HashMap;
import java.util.Map;

public class Array_SubArrayZeroSum {

	public static void main(String[] args) {
		SAZS();

	}
	
	static void findZeroSumSubarrays() {
	    int[] input = {6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7};
	    Map<Integer, Integer> map = new HashMap<>();
	    int sum = 0;

	    // Add an initial sum of 0 to handle subarrays starting at index 0
	    map.put(0, -1);

	    for (int i = 0; i < input.length; i++) {
	        sum += input[i]; // Add current number to cumulative sum

	        // Check if the current sum has been seen before
	        if (map.containsKey(sum)) {
	            System.out.println("Subarray: " + (map.get(sum) + 1) + " to " + i);
	        }

	        // Store the current sum with the index
	        map.put(sum, i);
	    }
	}


	static void SAZS() {

		int[] input = { 6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7 };
		int sum = 0;
		int start = 0;
		int end = 0;

		for (int i = 0; i < input.length; i++) {
			for (int j = i; j < input.length; j++) {
				sum = sum + input[j];
				start = i;
				if (sum == 0) {
					end = j;
					System.out.println(start + "-" + end);
				}
			}

			sum = 0;
			start = 0;
			end = 0;
		}
	}
}
