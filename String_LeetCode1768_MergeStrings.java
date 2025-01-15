package JavaProgramListPackage;

public class String_LeetCode1768_MergeStrings {

	public static void main(String[] args) {
		abc();
	}

	public static String abc() {

		StringBuilder word3 = new StringBuilder();

		String word1 = "abciuokujyh", word2 = "pqrrt";
		int smallLength = Math.min(word1.length(), word2.length());

		for (int i = 0; i < smallLength; i++) {

			word3.append(word1.charAt(i)).append(word2.charAt(i));
		}

		if (word1.length() > smallLength) {
			word3.append(word1, smallLength, word1.length());
		}

		if (word2.length() > smallLength) {
			word3.append(word2, smallLength, word2.length());
		}

		System.out.println(word3.toString());
		return word3.toString();

	}
}
