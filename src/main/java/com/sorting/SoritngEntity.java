package com.sorting;

import java.util.Arrays;

public class SoritngEntity {

	public static void main(String[] args) {
		
		//Sorting Custom Object Array		
		Student[] stuArray = new Student[4];
		
		stuArray[0] = new Student(10, "Dinesh", 25, 2500l);
		stuArray[1] = new Student(20, "Ravi", 21, 1500l);
		stuArray[2] = new Student(30, "Naresh", 28, 2800l);
		stuArray[3] = new Student(40, "Nisha", 20, 1900l);
		
		/*
		 * Java provides Comparable interface which should be
		 * implemented by any custom class if we want to 
		 * use Arrays or Collections sorting methods.
		 * 
		 * As Student object is not implementing Comparable interface
		 * it throws java.lang.ClassCastException
		 * Student cannot be cast to java.lang.Comparable
		 */
		Arrays.sort(stuArray);
		
		System.out.println(Arrays.toString(stuArray));
			
	}
	
}
