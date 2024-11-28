package JavaProgramListPackage;

public class Array_MaxPositiveDifference {

	public static void main(String[] args) {
		// MPD();
		maximumDifference();

	}

	static void maximumDifference() {
		int[] a = { 6, 1, 3, 7, 8, 4, 1 };
		int difference = 0;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 1; j < a.length; j++) {
				if (a[j] > a[i]) {
					int subtraction = a[j] - a[i];
					if (subtraction > difference) {
						difference = subtraction;
					}
				}
			}
		}
		System.out.println(difference);

	}

	public static void MPD() {

		int[] a = { 6, 1, 3, 7, 8, 4, 1 };
		int ab = Integer.MIN_VALUE;
		int c = 0;
		int b = 0;

		for (int i = a.length - 1; i >= 0; i--) {
			for (int j = i - 1; j >= 0; j--) {

				if (a[i] - a[j] > ab && a[i] - a[j] > 0) {
					ab = a[i] - a[j];
					b = i;
					c = j;

				}
			}
		}
		System.out.println(b + "-" + c + "=" + (a[b] - a[c]));
	}
}
