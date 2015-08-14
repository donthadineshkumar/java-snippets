package com.lambdas;

public class MapperTest {
	public static void main(String a[]) {

		//map names to their lengths
		System.out.println("Map names to their lengths");
		
		String names[] = 	{ "Dinesh", "Rohit", "Naresh"};
		
		int[] lengthMappings =Mapper.mapToInt(names, 
				(String name) -> name.length());	
		printMappings(names, lengthMappings);
		
		System.out.println("Mapping integers to their cubes");
		
		Integer[] nums = { 3, 5, 7 };
		int[] cubes = Mapper.mapToInt(nums ,
					(Integer n) -> n * n * n );
		printMappings(nums, cubes);
			
		
	}

	private static void printMappings(Object[] from, int[] to) {
		for (int i = 0; i < from.length; i++) {
			System.out.println(from[i] +" mapped to "+ to[i]);
		}
	}
}
