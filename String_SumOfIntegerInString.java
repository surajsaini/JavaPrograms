package JavaProgramListPackage;

public class String_SumOfIntegerInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "prince123";
		int sum = 0;

		for (int i = 0; i < str.length(); i++) {

			if (Character.isDigit(str.charAt(i))) {
				int a = str.charAt(i) - '0';
				sum = sum + a;

			}
		}

		System.out.println(sum);
	}

}
