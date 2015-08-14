package com.collections;

import java.util.HashMap;
import java.util.Map;

public class MapKeysAsArray {
	public static void main(String a[]) {

		Map<String, String> map = new HashMap<String, String>();
		fillMap(map);
		
		//convert keys to array
		String[] keyarray = KeysAsArray(map);
		
		for (String str : keyarray) {
			System.out.println(str);
		}
		
	}

	private static String[] KeysAsArray(Map<String, String> map) {
		return map.keySet().toArray(new String[map.keySet().size()]);
	}

	private static void fillMap(Map<String, String> map) {
		map.put("first", "Studies");
		map.put("second", "Sports");
		map.put("third", "Reading");
	}
}
