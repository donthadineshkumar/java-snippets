package com.generics;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Test {
	public static void main(String a[]) {
		/*
		 * I can place the constructor type <Integer> between
		 * new operator and the name of the constructor
		 * 
		 * or else the compiler can figure out - placing it is an 
		 * optional - your choice
		 */
		//TestUtil<Number> test = new <Integer>TestUtil<Number>(new Integer(10));
		
		TestUtil<Number> test = new <Integer>TestUtil<Number>(new Integer(10));
		System.out.println(test.var1);
		
		//in java 7, it gives compile time error
		TestUtil.process(new ArrayList<>());
		
		/*
		 * allowed to create an array of unbounded
		 * wildcard generic types
		 */
		Wrapper<?>[] arr1 = new Wrapper<?>[10];
		
		/* 
		 * you cannot create an array of generic type
		 * but by using newInstance() method of 
		 * java.lang.reflect.Array class as follows.
		 */
		
		Wrapper<String>[] wrarray = (Wrapper<String>[]) Array.newInstance(Wrapper.class, 10);
		//Object[] objArray = (Object[]) wrarray;
		//objArray[0] = new Object(); - throws ArrayStoreException
		wrarray[0] = new Wrapper<String>("Hello");
		System.out.println(wrarray[0].var1);
	}
}
