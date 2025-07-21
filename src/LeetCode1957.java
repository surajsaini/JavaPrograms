
public class LeetCode1957 {

	public static void main(String[] args) {

		String s = "leeetcode";
		char aa = s.charAt(0);
		int count = 0;
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == aa) {
				count++;
			}

			if (s.charAt(i) != aa) {
				aa = s.charAt(i);

				count = 1;

			}
			if (count < 3) {
				sb.append(aa);
			}

		}

		System.out.println(sb);
	}

}
