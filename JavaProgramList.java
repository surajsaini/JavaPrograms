package JavaProgramListPackage;

import java.util.*;

public class JavaProgramList {

	public static void main(String[] args) {
		mm();

	}
	
	

	public static void targetSumUsingMap() {

		int[] num = { 2, 7, 11, 3,7 };

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < num.length; i++) {

			if (map.containsKey(9 - num[i])) {

				System.out.println(i + "--" + (map.get(9- num[i])));

			}

			
				map.put(num[i], i);
			

		}
	}

	public static void mm() {
		// public ListNode addTwoNumbers(ListNode l1, ListNode l2)

		List<Integer> l1 = new LinkedList<>();

		l1.add(2);
		l1.add(4);
		l1.add(3);

		List<Integer> l2 = new LinkedList<>(Arrays.asList(4, 6, 5));

		List<Integer> l3 = new LinkedList<>();

		System.out.println(l1.get(l1.size() - 1) + l2.get(l1.size() - 1));

		for (int i = 0; i < Math.max(l1.size(), l2.size()); i++) {

			int j = l1.get(i) + l2.get(i);
			l3.add(j);

		}
		System.out.println(l3);

	}

	public static void numberStartsWith1() {

		int[] num = { 1, 23, 123, 45, 67, 167 };
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < num.length; i++) {
			int j = num[i];

			while (j >= 10) {
				j = j / 10;
			}
			if (j == 1) {
				list.add(num[i]);
			}
		}
		System.out.println(list);
	}

	private static void commonSubString() {

		String s1 = "kkmanojhhhmanojabcjj";
		String s2 = "xyzmanojabcmanojkk";
		int numz = 0;
		int numj = 0;
		int numi = 0;

		for (int i = 0; i < s1.length(); i++) {

			for (int j = i; j < s1.length(); j++) {
				if (s2.contains(s1.substring(i, j + 1))) {
					int z = j - i;
					// System.out.println(z);
					if (z > numz) {

						numz = z;
						numi = i;
						numj = j;
						System.out.println(numz + "" + numi + "" + numj);
					}
				}

			}

		}
		System.out.println(numz + "" + numi + "" + numj);
		System.out.println(s1.substring(numi, numj + 1));
	}

	private static void maxChar() {

		String ab = "Teeeessst Autoooooomationn";
		Map<Character, Integer> map = new HashMap<>();
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < ab.length(); i++) {
			map.put(Character.toUpperCase((ab.charAt(i))),
					map.getOrDefault(Character.toUpperCase(ab.charAt(i)), 0) + 1);
		}
		System.out.println(map);

		list.addAll(map.values());
		Collections.sort(list);
		System.out.println(list);

		for (Map.Entry<Character, Integer> z : map.entrySet()) {

			if (z.getValue() == list.get(list.size() - 1)) {
				int k = z.getKey();
				System.out.println(z.getKey() + "" + z.getValue());
			}

		}
	}
}