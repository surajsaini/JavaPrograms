package JavaProgramListPackage;

import java.util.*;

public class String_SumOfDigit {

	public static void main(String[] args) {

		String ab = "asgf4kjh678kh5f";
		int sum = 0;
		StringBuilder aa = new StringBuilder();

		for (int i = 0; i < ab.length(); i++) {
			if (Character.isDigit(ab.charAt(i))) {
				aa.append(ab.charAt(i));
			} else {
				if (aa.length() > 0) {
					sum += Integer.parseInt(aa.toString());
					aa.setLength(0);
				}
			}
		}
		if (aa.length() > 0) {
			sum += Integer.parseInt(aa.toString());
		}
		System.out.println(sum);
	}
}
