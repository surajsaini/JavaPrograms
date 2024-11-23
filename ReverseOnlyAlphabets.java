package JavaProgramListPackage;

public class ReverseOnlyAlphabets {

	public static void main(String[] args) {
		ROA();

	}

	public static void ROA() {

		String s = "34test909gda@sdet!23pro";
		StringBuilder ss = new StringBuilder();
		StringBuilder rs = new StringBuilder();

		int start = 0;
		int end = 0;

		// Expected o/p: 34tset909adg@teds!23orp

		for (int i = 0; i < s.length(); i++) {

			if (Character.isAlphabetic(s.charAt(i))) {

				rs.append(s.charAt(i));
			}

			if (!Character.isAlphabetic(s.charAt(i))) {

				rs.reverse();
				ss.append(rs);
				ss.append(s.charAt(i));
				rs.setLength(0);
			}
		}
		rs.reverse();
		ss.append(rs);
		System.out.println(ss.toString());
	}

	public static void reverseOnlyAlphabets() {
		String input = "34test909gda@sdet!23pro";
		StringBuilder finalResult = new StringBuilder();
		StringBuilder temp = new StringBuilder();

		for (int i = 0; i < input.length(); i++) {
			char currentChar = input.charAt(i);
			if (Character.isAlphabetic(currentChar)) {
				temp.append(currentChar);
			} else {
				finalResult.append(temp.reverse());
				finalResult.append(currentChar);
				temp.setLength(0);
			}
		}
		finalResult.append(temp.reverse());
		System.out.println(finalResult.toString());
	}

}
