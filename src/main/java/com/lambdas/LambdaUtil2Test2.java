package com.lambdas;

public class LambdaUtil2Test2 {
/*
 * The target type of the lambda expression is 
 * always a functional interface
 */
	public static void main(String a[]) {
		/*
		 * Demonstrates the ambiguity of lambda expressions
		 * - if there are any overloaded methods.
		 */
		LambdaUtil2 lu = new LambdaUtil2();
		
		// calls the test(Adder )
		lu.test((float x, float y) -> x+y);
		
		// calls the test(Joiner )
		lu.test((String x,String y) -> x+y);
		
		//the joiner will a space between the two strings
		lu.test( (Joiner)(x,y) -> x+" "+y);
		
		lu.test((Joiner)(x,y) -> {
			StringBuilder sbx = new StringBuilder(x);
			StringBuilder sby = new StringBuilder(y);
			sby.reverse().append(",").append(sbx.reverse());
			return sby.toString();
		});
	}
}
