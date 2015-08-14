package com.lambdas;

import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;

public class CommonlyUsedFnInterfaces {

	/*
	 * Java 8 has added more frequently used
	 * functional interfaces in the package
	 * 
	 * java.util.function
	 * 
	 * Note: a functional interface should have only one
	 * method - but can have default and static methods
	 * which are excluded from the methods count
	 */
	
	public static void main(String args[]) {
		
		/*
		 * T - type of input parameter
		 * R - type of result parameter
		 * 
		 * Function<T,R> 
		 * 
		 * there are six specialized functions of Function<T,R>
		 */
		
		Function<Integer,Integer> s1 = x -> (x * x) ; 
		
		System.out.println(s1.apply(5));
		
		/*
		 * IntFunction<R>
		 * R is the result
		 * 
		 */
		IntFunction<Integer> s2 = x -> x * x * 10;
		
		System.out.println(s2.apply(20));
		
		ToIntFunction<Integer> s3 = x -> x * x;
		
		System.out.println(s3.applyAsInt(12));
		
		UnaryOperator<Double> s4 = x -> x * x;
		
		System.out.println(s4.apply(12.1D));
		
		
	}
	
}
