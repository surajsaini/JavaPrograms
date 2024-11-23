package JavaProgramListPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeSortedArrays {

	public static void main(String[] args) {
		MSA();

	}

	public static void MSA() {

		int[] arr1 = { 1, 3, 5, 7 };
		int[] arr2 = { 2, 4, 6, 8 };

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < Integer.max(arr1.length, arr2.length); i++) {
			list.add(arr1[i]);
			list.add(arr2[i]);
		}
		
		Collections.sort(list);
		System.out.println(list);
	}
}
