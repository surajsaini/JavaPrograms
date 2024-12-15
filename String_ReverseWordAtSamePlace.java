package JavaProgramListPackage;

public class String_ReverseWordAtSamePlace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		abc();
	}

	public static void abc() {
		// Reverse words at same place of given string: I/p: Test Automation and o/p:
		// tseT noitamotuA

		String ip = "Test Automation";
		StringBuilder ot = new StringBuilder();

		String[] ip2 = ip.split(" ");

		for (int i = 0; i < ip2.length; i++) {
			for (int j = ip2[i].length() - 1; j >= 0; j--) {
				ot.append(ip2[i].charAt(j));
			}
			ot.append(" ");

		}

		System.out.println(ot.toString());
	}

}
