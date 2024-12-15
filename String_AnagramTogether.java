package JavaProgramListPackage;

import java.util.*;

public class String_AnagramTogether {

	public static void main(String[] args) {
		AT();
	}

	static void AT() {

		String[] input = { "eat", "tea", "tan", "ate", "nat", "bat" };
		// Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
		// List<List<String>> list = new ArrayList<>();
		Map<String, List<String>> map = new HashMap<>();

		for (int i = 0; i < input.length; i++) {
			char[] chr = input[i].toCharArray();
			Arrays.sort(chr);
			String sortedString = new String(chr);

			if (!map.containsKey(sortedString)) {
				map.put(sortedString, new ArrayList<>());
			}

			map.get(sortedString).add(input[i]);
		}

		System.out.println(map);
	}

}
