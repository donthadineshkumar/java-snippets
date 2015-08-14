package com.sorting;

import java.util.Arrays;


public class SortUsingComparator {

	public static void main(String[] args) {
		
		Product[] listProducts = new Product[4];
		
		listProducts[0] = new Product(10, "Washing Machine",22.55F);
		listProducts[1] = new Product(20, "Video Game",  10.55F);
		listProducts[2] = new Product(40, "Ipad", 44.4F);
		listProducts[3] = new Product(30, "Iphone", 55.5F);
		
		//based on prices - in ascending order
		Arrays.sort(listProducts, Product.priceComparator);
		System.out.println(Arrays.toString(listProducts));
		
		//based on id - in descending order
		Arrays.sort(listProducts, Product.idComparator);
		System.out.println(Arrays.toString(listProducts));
			
		University[] listUnivs = new University[4];
		
		listUnivs[0] = new University(1, "Washing Machine",22);
		listUnivs[1] = new University(2, "Video Game",  10);
		listUnivs[2] = new University(2, "Ipad", 44);
		listUnivs[3] = new University(4, "Iphone", 11);
		
		//the custom compartor has written to compare by id and name
		Arrays.sort(listUnivs, new UniversityComparatorByIdAndName());
		System.out.println(Arrays.toString(listUnivs));
		
		
	}
}
