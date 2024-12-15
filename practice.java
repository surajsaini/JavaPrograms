
package JavaProgramListPackage;

import java.util.*;

public class practice {
	public static void main(String[] args) {
		abc();
	}

	public static void abc() {

		int[] nums = { 0, 1, 2, 3, 4, 5 };

		for (int i = 0; i < nums.length - 1; i++) {

			for (int j = 0; j < nums.length - i - 1; j++) {

				if (nums[j] > nums[j + 1]) {
					int temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;

				}

			}
			for (int h : nums) {
				System.out.print(h);
			}
		}
	}
}