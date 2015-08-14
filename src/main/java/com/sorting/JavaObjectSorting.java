package com.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JavaObjectSorting {
	
	
	public static void main(String[] args) {
		
		//sort the primitive array like int array
		int[] intArray = {5, 9, 1, 10};		
		Arrays.sort(intArray);		
		System.out.println(Arrays.toString(intArray));
		
		//sorting the String array
		String[] strArray = { "A", "C", "B", "Z","E"};
		
		Arrays.sort(strArray);
		System.out.println(Arrays.toString(strArray));
		
		//sorting the list of objects of wrapper classes
		List<String> strList = new ArrayList<String>();
		
		strList.add("A");
		strList.add("D");
		strList.add("C");
		strList.add("B");
		
		/*
		 * you cannot sort the collection 
		 * using Arrays - Use Collections.sort  
		 */
		
		Collections.sort(strList);
		
		System.out.println("Collection values after sorting");	
		strList.stream().forEach(l -> System.out.println(l));
		
			List<Integer> ints =Arrays.asList(1, 2, 5, 3, 4);
			Collections.sort(ints);
			
			ints.stream().forEach(i -> System.out.println(i));
		
	}

}
