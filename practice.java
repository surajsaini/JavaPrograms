
package JavaProgramListPackage;

import java.util.*;

public class practice {
	public static void main(String[] args) {
		abc();
	}

	public static void abc() {

		
		List<List<Integer>> lottoList = new ArrayList<>();
		
		Random random = new Random();

		for (int j = 0; j < 2; j++) {
			List<Integer> lotto = new ArrayList<>();
			for (int i = 0; i < 7; i++) {
				int num = random.nextInt(50) + 1;
				lotto.add(num);

			}
			lottoList.add(lotto);
		}

		System.out.println(lottoList);
	}
}