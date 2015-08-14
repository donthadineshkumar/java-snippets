package com.lambdas;

public class LambdaUtil {
	
	public void testAdder(Adder adder){
		float x = 1.2F;
		float y = 2.3F;
		float sum = adder.add(x,y);
		System.out.print("using an Adder:");
		System.out.println(x +" + "+ y +" = "+ sum);
	}

	public void testJoiner(Joiner joiner){
		String x = "Hello";
		String y = "World";
		String z = joiner.join(x,y);
		System.out.print("using an Joiner:");
		System.out.println(x +" + "+ y +" = "+ z);
	}

}
