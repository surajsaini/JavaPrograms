package JavaProgramListPackage;

import java.util.*;

public class ArrayList_RemoveDuplicate {

	public static void main(String[] args) {
		RD();

	}

	static void RD() {

		List<Integer> list = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		list.addAll(Arrays.asList(1, 2, 3, 2, 4, 3, 5, 1));

		for (int i = 0; i < list.size(); i++) {
			if (!list2.contains(list.get(i))) {

				list2.add(list.get(i));
			}
		}
		System.out.println(list2);
	}

}
