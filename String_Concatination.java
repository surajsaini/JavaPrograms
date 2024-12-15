package JavaProgramListPackage;

public class String_Concatination {

	public static void main(String[] args) {
		SC();

	}

	public static void SC() {

		String input = "aaabbbacfwww";
		// Output: a3b3acfw3
		int count = 0;

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < input.length(); i++) {
			sb.append(input.charAt(i));
			if (input.charAt(i) != sb.charAt(sb.length() - 1)) {
				
				sb.append(input.charAt(i));

			}
			if (input.charAt(i) == sb.charAt(sb.length() - 1)) {

				count++;

			}
			sb.append(count);
			count=0;

		}
		System.out.println(sb);
	}
}
