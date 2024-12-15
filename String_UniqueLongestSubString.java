package JavaProgramListPackage;

import java.util.*;

public class String_UniqueLongestSubString {

	public static void main(String[] args) {
		ULSS();
	}

	public static void ULSS() {

		String input = "pwwkew";

		Set<Character> set = new HashSet<>();

		int start = 0;
		int length = 0;

		for (int end = 0; end < input.length(); end++) {

			while (set.contains(input.charAt(end))) {

				set.remove(input.charAt(start));
				start++;
			}

			set.add(input.charAt(end));
			length = Math.max(length, end - start + 1);

		}

		System.out.println(length + " --");
		System.out.println(set);
	}
}
