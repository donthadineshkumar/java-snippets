package com.lambdas;

import java.io.Serializable;

public class SensitiveTest {

	public static void main(String a[]) {
		/*
		 * Since sensitive is not a functional interface
		 * this gives a compile-time error
		 * So for a marker interface - use 
		 * java 7's intersection types
		 */
		
		
		//Sensitive sen = (x,y) -> x+y;
		
		Sensitive sen = (Sensitive & Adder) (x,y) -> x+y;
		
		/*
		 * To serialize a lambda expression - use this
		 */
		
		Serializable ser = (Serializable & Adder) (x,y) -> x+y;
		[;aqwsp;l]
	}
	
}
