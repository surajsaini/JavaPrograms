package JavaProgramListPackage;

public class String_LeetCode1071 {

	public static void main(String[] args) {
		abc();
	}

	public static void abc() {

		String str1 = "ABCABC", str2 = "ABC";
	

		if (str1.contains(str2)) {

		str1 = 	str1.replaceFirst(str2, "");
			System.out.println("123");
			
		}
		
		else {
		str1="";}
		System.out.println(str1);
	}
}
