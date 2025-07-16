
public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String aa = "i am from  ghaziiabad and live in canada";
		int count = 0;
		String[] ab = aa.trim().split("\\s+");
		
		//or 
		
		for (int i = 0; i < aa.length(); i++) {
			if (aa.charAt(i) == ' ') {
				count++;
			}

		}

		System.out.println(count + 1);

		System.out.println(ab.length);
	}

}
