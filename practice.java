
package JavaProgramListPackage;

import java.util.*;

public class practice {
	public static void main(String[] args) {
		abc();
	}


	public static void abc() {

		String s = "A man, a plan, a canal: Panama";
		String t = s.toLowerCase();
		Map<Integer, Character> map = new HashMap<>();
		StringBuilder sb = new StringBuilder(s);
		for (int i = 0; i < s.length(); i++) {
			char aa = t.charAt(i);

			if (aa == 'a' || aa == 'e' || aa == 'i' || aa == 'o' || aa == 'u') {
				map.put(i, s.charAt(i));
			}
		}
		System.out.println(map);
		List<Integer> list = new ArrayList<>(map.keySet());
 		for (int i = 0; i < list.size()/2; i++) {

char temp = map.get(list.get(i));
				sb.setCharAt(list.get(i), map.get(list.get(list.size()-1-i)));
				sb.setCharAt(list.get(list.size()-1-i), temp);

		}
		System.out.println(sb);
	//	return sb.toString();
	}}
	