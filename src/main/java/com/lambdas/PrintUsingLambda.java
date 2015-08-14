package com.lambdas;

public class PrintUsingLambda {

	
	public static void  main(String a[]) {
	/*
	 * It is not allowed to omit parenthesis 
	 * when lambda expressions takes no parameters.
	 */
		/*
		 * the body of the lambda expression
		 *  is an expression or a block of statements
		 *  ex:Expression
		 *  (int x, int y) -> x + y
		 *  
		 *  ex:block
		 *  (int x, int y) -> { return x + y; }
		 */
	PrintInterface pr = () -> {  System.out.println("Hello"); } ;
	pr.print();
	
		
	}
}
