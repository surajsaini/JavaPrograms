package JavaProgramListPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_MoveNegativeAtBeginning {

	public static void main(String[] args) {
		MNAB();

	}

	static void MNAB() {

		int[] input = { -12, 11, -13, -5, 6, -7, 5, -3, -6 };
		// Output: -12 -13 -5 -7 -3 -6 11 6 5
		int ind = 0;
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < input.length; i++) {
			if (input[i] < 0) {
				list.add(ind++, input[i]);
			} else {
				list.add(input[i]);
			}
		}
		System.out.println(list);
	}
}
