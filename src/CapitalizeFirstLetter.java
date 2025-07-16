
public class CapitalizeFirstLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String aa = "i am from ghaziiabad and live in canada";

		String[] ab = aa.trim().split("\\s+");
		StringBuilder ac = new StringBuilder();
		StringBuilder ad = new StringBuilder();

		for (int i = 0; i < ab.length; i++) {
			for (int j = 0; j < ab[i].length(); j++) {

				if (j == 0) {
					ac.append(Character.toUpperCase(ab[i].charAt(j)));
				}

				else {
					ac.append(ab[i].charAt(j));
				}

			}
			ac.append(' ');
		}
		System.out.println(ac);

		for (String word : ab) {
			ad.append(Character.toUpperCase(word.charAt(0)));
			ad.append(word.substring(1));
			ad.append(' ');
		}

		System.out.println(ad);
	}

}
