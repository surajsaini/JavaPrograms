import java.util.Arrays;
import java.util.Collections;

public class TwoStringAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "listen";
		String b = "netsil";

		char[] ab = a.toLowerCase().toCharArray();
		char[] bb = b.toLowerCase().toCharArray();

		Arrays.sort(ab);
		Arrays.sort(bb);

		if (Arrays.equals(ab, bb)) {

			System.out.println("YES");
		}
		else {System.out.println("NO");}

	}

}
