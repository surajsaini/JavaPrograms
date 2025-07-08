

import java.util.*;
public class Array_LeetCode1394 {
	// 1394. Find Lucky Integer in an Array
	
	public static int findLucky(int[] arr) {

		int count2 = 0, lucky = -1;
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}
		for (int i : map.keySet()) {
			if (i == map.get(i)) {
				if (lucky < map.get(i)) {
					lucky = map.get(i);
				}
			}
		}

		return lucky;
	}

	
	public static void main(String[] args) {

		System.out.println(findLucky(new int[] {2, 2, 3,3, 4}));
	}
}
