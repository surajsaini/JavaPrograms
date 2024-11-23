package JavaProgramListPackage;

import java.util.*;

public class CountOccuranceInArray {

	public static void main(String[] args) {
		COIA();

	}

	public static void COIA() {

		int[] num = { 3, 7, 2, 8, 7, 3, 1, 2 };

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < num.length; i++) {
			
			

		}

	}

	public static void COIA1() {

		int[] num = { 3, 7, 2, 8, 7, 3, 1, 2 };
		int count = 0;

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {

				if (num[i] == num[j]) {

					count++;
				}
			}

			System.out.println(num[i] + "--" + count);
			count = 0;

		}
	}

}
