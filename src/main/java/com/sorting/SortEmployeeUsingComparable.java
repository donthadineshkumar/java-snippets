package com.sorting;

import java.util.Arrays;

import org.w3c.dom.ls.LSInput;

public class SortEmployeeUsingComparable {

	public static void main(String[] args) {

		Employee[] listEmps = new Employee[4];
		
		listEmps[0] = new Employee(4, "Dinesh", 24, 2400l);
		listEmps[1] = new Employee(1, "Ramesh", 21, 4500l);
		listEmps[2] = new Employee(2, "Rakesh", 14, 2300l);
		listEmps[3] = new Employee(3, "Anil", 33, 3400l);
		
		Arrays.sort(listEmps);
		
		System.out.println(Arrays.toString(listEmps));
				
	}
	
}
