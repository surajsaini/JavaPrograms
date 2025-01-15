package JavaProgramListPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class List_RandomNumber {

	public static void main(String[] args) {
		abc();

	}

	public static void abc() {

		List<List<Integer>> lottoList = new ArrayList<>();

		Random random = new Random();

		for (int j = 0; j < 12; j++) {
			List<Integer> lotto = new ArrayList<>();
			int n = 7;
			for (int i = 0; i < n; i++) {
				int num = random.nextInt(50) + 1;
				if (!lotto.contains(num)) {
					lotto.add(num);
				} else {
					n++;
				}
			}
			lottoList.add(lotto);
		}

		System.out.println(lottoList);
	}
}
