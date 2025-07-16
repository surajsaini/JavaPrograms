
public class RemoveDuplicateChar {

	public static void main(String[] args) {

		String aa = "Ghaziabad";
		StringBuilder sb = new StringBuilder();
		sb.append(aa.charAt(0));
		boolean b = false;

		for (int i = 1; i < aa.length(); i++) {
			for (int j = 0; j < sb.length(); j++) {
				if (aa.charAt(i) == sb.charAt(j)) {
					b = true;
					break;

				}

			}
			if (b == false) {
				sb.append(aa.charAt(i));
			}
			b = false;

		}
		System.out.println(sb);
	}

}
