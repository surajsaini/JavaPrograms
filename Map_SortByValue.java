package JavaProgramListPackage;

import java.util.*;

public class Map_SortByValue {

	public static void main(String[] args) {
		SBV();

	}

	static void SBV() {

		Map<String, Integer> map = new HashMap<>();

		map.put("A", 21);
		map.put("B", 12);		
		map.put("D", 34);
		map.put("C", 13);
		
		System.out.println(map);
		
	//	Collections.sort(map.values());
		
	}
	
}
