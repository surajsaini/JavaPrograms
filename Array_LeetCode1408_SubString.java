package JavaProgramListPackage;

import java.util.ArrayList;
import java.util.List;

public class Array_LeetCode1408_SubString {

	public static void main(String[] args) {
		abc();
	}

	public static List<String> abc() {

		String[] words = { "mass", "as", "hero", "superhero" };
		List<String> list = new ArrayList<>();

		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < words.length; j++) {

				if (words[i].length() < words[j].length()) {

					if (words[j].contains(words[i]) == true) {

						if (!list.contains(words[i])) {
							list.add(words[i]);
						}
					}

				}

			}
		}
		System.out.println(list);
		return list;
	}
}