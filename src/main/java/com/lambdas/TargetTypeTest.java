package com.lambdas;

public class TargetTypeTest {

	public static void main(String a[]) {
		
		Adder adder = (x,y) -> x+y;
		
		Joiner joiner = (x,y) -> x+y;
		
		float n1 = adder.add(1.2F, 12.2F);
		
		float n2 = adder.add(12.1F, 23.23F);
		//MissingFormatException - Format specifier %f
		//System.out.printf("n1=%f  n2= %f"+n1,n2);
		System.out.println("n1= "+n1+" n2= "+n2);
		
		String combinedStr = joiner.join("Dinesh", "Dontha");
		System.out.println("concat string "+combinedStr);
		
	}
	
}
