package JavaProgramListPackage;

import java.util.ArrayList;
import java.util.List;

public class Array_LeetCode1431 {

	public static void main(String[] args) {
		abc();
	}

	public static List<Boolean> abc() {

		int[] candies = { 2, 3, 5, 1, 3 };
		int extraCandies = 3;
		int num = 0;
		List<Integer> list = new ArrayList<>();
		List<Boolean> bList = new ArrayList<>();

		for (int i = 0; i < candies.length; i++) {
			list.add(candies[i] + extraCandies);
			if (candies[i] > num) {
				num = candies[i];
			}
		}

		for (int j = 0; j < list.size(); j++) {

			if (list.get(j) >= num) {
				bList.add(true);
			} else {
				bList.add(false);
			}
		}

		return bList;
	}
}
