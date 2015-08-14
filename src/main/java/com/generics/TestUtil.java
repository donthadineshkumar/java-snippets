package com.generics;

import java.util.List;

public class TestUtil<T> {
/*
 * Generic constructor
 */
	public T var1;
	
	public <U extends T> TestUtil(U k){
		var1 = k;
	}
	
	public static void process(List<String> list){
		for (String str : list) {
			System.out.println(str);
		}
	}
	
}
