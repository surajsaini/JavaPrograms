package JavaProgramListPackage;

import java.util.HashSet;
import java.util.Set;

public class ValidatingUsername {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		abc();

	}

	public static void abc() {
		
		//We need to save username of students, input username and print valid if it contains alphanumeric and invalid if it contains any special characters or spaces or duplicate username. WAP in java or python to handle it

		String aa = "surajs1 aini";
		int countAL = 0;
		int countDI = 0;
		int countSP = 0;
		boolean finalc = true;

		Set<String> username = new HashSet<>();
		if (!username.contains(aa)) {
			for (int i = 0; i < aa.length(); i++) {
				char ab = aa.charAt(i);
				if (Character.isAlphabetic(ab)) {
					countAL++;
				}
				if (Character.isDigit(ab)) {
					countDI++;
				}
				if (Character.isSpaceChar(ab)) {
					countSP++;
				}
			
			}
		}

		if (countAL > 0 && countDI > 0) {
			finalc = true;
		}
		if (countSP > 0) {
			finalc = false;
		}
		if (finalc == true) {

			username.add(aa);
		} else {
			System.out.println("novalid username");
		}
	}


}
