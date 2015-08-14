package com.generics;

public class GenericRuntimeClassTest {

	/*
	 * All objects of a Parameterized type share the same class
	 * at Runtime
	 * Note: The type information you supply is to the generic type 
	 * is removed from the code during compilation.
	 * Eg: compiler changes - Wrapper<String> a; 
	 * to Wrapper a;
	 * 
	 * 
	 * Representing a type at runtime is called  reification.
	 * 
	 * A type that can be represented at runtime is called a 
	 * reifiable type.
	 * 
	 * A type that is not completely represented at
	 * runtime is called a non-reifiable type.
	 * 
	 * Most generic types are non-reifiable because generics
	 * are implemented using erasure, which removes type's 
	 * parameters information at compile time.
	 * 
	 * Heap Pollution :- is a situation that occurs when 
	 * a variable of a parameterized type refers to 
	 * an object not of the same parameterized type.
	 * 
	 * The compiler issues an unchecked warning if it 
	 * detects possible heap pollution.
	 */
	
	public static void main(String args[]) {
		Wrapper<String> a = new Wrapper<String>("Hello");
		Wrapper<Integer> b = new Wrapper<Integer>(new Integer(12));
		
		Class aClass = a.getClass();
		Class bClass = b.getClass();
		
		System.out.println("Class for a"+ aClass);
		System.out.println("Class for b"+ bClass);
		
		System.out.println("aClass==bClass "+ (aClass  == bClass));
	
	/*	Wrapper nWrapper = new Wrapper<Integer>(101);
		
		Wrapper<String> sWrapper = nWrapper;
		String str = sWrapper.get();
		System.out.println(str);*/
		
		Wrapper<? extends Number> nW = new Wrapper<Short>((short)1L);		
		
		Wrapper<Short> sw = (Wrapper<Short>) nW;
		
		long s = sw.get();
		
		System.out.println(s);
		
	}
	
}
