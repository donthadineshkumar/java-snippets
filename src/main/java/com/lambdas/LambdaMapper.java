package com.lambdas;

public class LambdaMapper {

	public static void main(String a[]) {
		//here lambda expr type is the functional interface type
		StringToIntMapper mapper = (String str) -> str.length() ;
		/*
		 * you can omit type - it works
		 * if you have a single parameter - we can remove the
		 * paranthesis (optional)
		 * StringToIntMapper mapper = str -> str.length();
		 * 
		 * Note: paranthesis can be omitted only if the single parameter
		 * omits its type.
		 */
		String name="dinesh";
		int mappedValue = mapper.map(name);
		System.out.println("name="+name+" , mapped value="+mappedValue);
		/*
		 * Java is a strongly-typed language, which means the compiler
		 * must know the type of all expressions used in a java program.
		 * A lambda expression by itself does not have a type, and therefore,
		 * it cannot be used as a standalone expression.
		 * The type of the lambda expression is always inferred by the compiler
		 * by the context in which it is used.
		 */
		
		/*
		 * Everything done - using anonymous classes prior to java 8
		 * you can do that with lambda expression
		 */
		/*
		 * Lambda expressions are not the complete replacement
		 * of the Anonymous classes - you still need the anonymous classes
		 */
		/*
		 * A lambda expression that does not declare the types
		 * of its parameters is known implicit lambda expression 
		 * or implictly-typed lambda expression
		 * 
		 * A lambda expression that declares the types of its
		 * parameters is known as explicit lambda expression
		 * or explictly-typed lambda expression
		 * 
		 */

	}
}
