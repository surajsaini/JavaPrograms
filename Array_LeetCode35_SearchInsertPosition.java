package JavaProgramListPackage;

public class Array_LeetCode35_SearchInsertPosition {

	public static void main(String[] args) {
		SIP();

	}

	public static void SIP() {
		int[] num = { 1, 3, 5, 6 };
		int target = 7;
		int ind = 0;
		for (int i = 0; i < num.length - 1; i++) {
			if (num[i] == target) {
				ind = i;
			} else if (target > num[i] && target < num[i + 1]) {
				ind = i + 1;
			}
		}

		if (target == num[num.length - 1])
			ind = num.length - 1;
		if (target > num[num.length - 1])
			ind = num.length - 1 + 1;
		System.out.println(ind);
	}
}
