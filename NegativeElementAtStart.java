package JavaProgramListPackage;

import java.util.*;

public class NegativeElementAtStart {

	public static void main(String[] args) {
		NES();

	}

	public static void NES() {

		int[] arr = { 1, 2, -3, 2, -4, 1, 5 };
		List<Integer> list = new ArrayList<>();
		int num=0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				list.add(num,arr[i]);
				num++;
			}
			else {
				list.add(arr[i]);
			}		
			
		}
		
		System.out.println(list);
	}

}
