package com.lambdas;

public class LambdUtil2Test {
	public static void main(String a[]) {

		LambdaUtil2 lu2 = new LambdaUtil2();
		// this gives a compile-time error: ambigious
		//lu2.test((x,y)->x+y);
		
		/*to make this work
		 * make lambda expression to explicit expression
		 */
		
		lu2.test((String x,String y)->x+y); 
		/*
		 * or you can use a cast
		 */
		lu2.test((Adder) (x,y)-> x+y);
		
		/*
		 * or Don't use lambda expression directly as the method parameter
		 * - first assign it to a variable of the desired type -
		 * then pass the variable to the method
		 */
		Joiner joiner = (x, y) -> x+y;
		lu2.test(joiner);
		
	}
}
