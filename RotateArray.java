package JavaProgramListPackage;

public class RotateArray {

	public static void main(String[] args) {
		rotateArray();

	}

	public static void rotateArray() {

		int[] arr = { 2, 4, 1, 9, 7, 5 };

		for (int i = 0; i < arr.length / 2; i++) {

			int num = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = num;

		}

		for (int n : arr) {
			System.out.print(n);
		}
	}

}
