package JavaProgramListPackage;

import java.util.Arrays;

public class Array_LeetCode14_CommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	String ll(String[] strs) {

		//	String[] strs = { "flower", "flow", "flight" };

			Arrays.sort(strs);

			for (String ab : strs) {

				System.out.println(ab);
			}

			StringBuilder sb = new StringBuilder();

			for (int i = 0; i < strs[0].length(); i++) {

				if (strs[0].charAt(i) == strs[strs.length - 1].charAt(i)) {

					sb.append(strs[0].charAt(i));
				}
			}
			System.out.println(sb);
			
			return sb.toString();

		}

}
