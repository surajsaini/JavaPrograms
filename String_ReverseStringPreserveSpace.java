package JavaProgramListPackage;

import java.util.*;

public class String_ReverseStringPreserveSpace {

	public static void main(String[] args) {
		RSPS();
	}

	public static void RSPS1() {
		String input = "I Am Not String";
		// Output: g ni rtS toNmAI

		// List to store the positions of spaces in the input string
		List<Integer> spacePositions = new ArrayList<>();
		int inputLength = input.length();

		// Record space positions
		for (int i = 0; i < inputLength; i++) {
			if (input.charAt(i) == ' ') {
				spacePositions.add(i);
			}
		}

		StringBuilder reversedOutput = new StringBuilder();
		int spaceIndex = 0; // To track spaces in the reversed string

		// Iterate from the end of the input string
		for (int i = inputLength - 1; i >= 0; i--) {
			// If the current position matches a space position, append a space
			if (spaceIndex < spacePositions.size() && reversedOutput.length() == spacePositions.get(spaceIndex)) {
				reversedOutput.append(' ');
				spaceIndex++;
			}
			// Append non-space characters
			if (input.charAt(i) != ' ') {
				reversedOutput.append(input.charAt(i));
			}
		}

		System.out.println(reversedOutput.toString());
	}

	static void RSPS() {
		String input = "I Am Not String";
		// Output: g ni rtS toNmAI
		List<Integer> list = new ArrayList<>();
		int ab = 0;
		int inputlength = input.length();
		for (int i = 0; i < inputlength; i++) {
			if (input.charAt(i) == ' ') {
				list.add(i);
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i = inputlength - 1; i >= 0; i--) {
			if (ab < list.size() && sb.length() == list.get(ab)) {
				sb.append(' ');
				ab++;
			}
			if (input.charAt(i) != ' ') {
				sb.append(input.charAt(i));
			}
		}
		System.out.println(sb.toString());
	}
}
