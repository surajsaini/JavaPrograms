package JavaProgramListPackage;

import java.util.Arrays;

public class SortedArray {

	public static void main(String[] args) {

		arraySort();
		// TODO Auto-generated method stub

	}

	public static void arraySort() {

		int[] arr = { 1, 2, 13, 4, 5 };
		boolean issorted = true;

		for (int i = 0; i < arr.length - 1; i++) {

			if (arr[i] > arr[i + 1]) {

				issorted = false;
				break;
			}

		}
		System.out.println(issorted);
	}

}
