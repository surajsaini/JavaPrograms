package JavaProgramListPackage;

public class SecondLargestElementInArray {

	public static void main(String[] args) {
		SLEA();

	}

	public static void SLEA() {
		int[] arr = { 1, 2, 3, 2, 4, 1, 5, 10 };

		int largestElement = arr[0];
		int secondLargestElement = Integer.MIN_VALUE;
		int smallestElement = arr[0];

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] > largestElement) {
				secondLargestElement = largestElement;
				largestElement = arr[i];
			} else if (arr[i] > secondLargestElement && largestElement != arr[i]) {
				secondLargestElement = arr[i];
			} else if (arr[i] < smallestElement) {
				smallestElement = arr[i];
			}
		}
		System.out.println(largestElement + "--" + secondLargestElement + "--" + smallestElement);
	}
}
