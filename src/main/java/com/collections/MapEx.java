package com.collections;

import java.util.HashMap;
import java.util.Map;

public class MapEx {
	public static void main(String a[]) {

		Map<String, String> map = new HashMap<String, String>();
		fillMap(map);
		
		// using lambda expressions
		map.forEach((k,v) -> System.out.printf("%s %s%n", k, v));
		
		map.put("fourth", "Recreation");
		map.remove("third");
		System.out.println("*******************");
		map.forEach((k,v) -> System.out.printf("%s %s%n", k, v));
		
	}

	private static void fillMap(Map<String, String> map) {
		map.put("first", "Studies");
		map.put("second", "Sports");
		map.put("third", "Reading");
		// does not take duplicates - here it overrides
		//map.put("first", "BLAH BLAH");
	}
}