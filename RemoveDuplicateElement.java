package JavaProgramListPackage;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateElement {

	public static void main(String[] args) {
		RDE();

	}

	public static void RDE() {

		int[] arr = { 1, 2, -3, 2, -4, 1, 5 };

		List<Integer> list = new ArrayList<>();
		

		for (int i = 0; i < arr.length; i++) {

			if (!list.contains(arr[i])) {
				list.add(arr[i]);
			}
		}
		
		System.out.println(list);
	}

}
