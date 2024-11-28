package JavaProgramListPackage;

import java.util.Arrays;

public class String_LongestCommonPrefix {

	public static void main(String[] args) {
		SLCP();

	}

	public static void SLCP() {

		String[] strs = { "dlower", "flow", "flight" };
		StringBuilder cmn = new StringBuilder();
		Arrays.sort(strs);
		
		for(String s:strs) {
		System.out.println(s);
	}}

}
