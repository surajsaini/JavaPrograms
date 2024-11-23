package JavaProgramListPackage;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

	public static void main(String[] args) {
		RTI();

	}

	public static void RTI() {

		String roman = "MCMXCIV";
		int num = 0;

		Map<Character, Integer> m = new HashMap<>();

		m.put('I', 1);
		m.put('V', 5);
		m.put('X', 10);
		m.put('L', 50);
		m.put('C', 100);
		m.put('D', 500);
		m.put('M', 1000);

		for (int i = 1; i < roman.length(); i++) {

			if (m.get(roman.charAt(i - 1)) >= m.get(roman.charAt(i))) {
				num = num + m.get(roman.charAt(i - 1));
			}
			else{num = num - m.get(roman.charAt(i - 1));}

		}
		System.out.println(num + m.get(roman.charAt(roman.length() - 1)));
	}
}
