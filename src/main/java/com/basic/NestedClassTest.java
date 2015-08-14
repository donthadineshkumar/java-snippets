package com.basic;

import java.util.Arrays;

import com.basic.OuterClass.InnerClass;



public class NestedClassTest {

	public static void main(String[] args) {
		
		OuterClass outer = new OuterClass(10, 20, 30, 40);
		
		/*
		 * Static Nested class - can access only static members
		 * of Outer class / enclosing class
		 * 
		 * Need to get an instance to access it
		 * as 
		 * OuterClass.StaticNestedClass st= new OuterClass.StaticNestedClass();
		 * 
		 * Need to import as
		 * xx.OuterClass.StaticNestedClass
		 * Then create an object as
		 * 
		 * StaticNestedClass st1 = new StaticNestedClass();
		 * 
		 */
		OuterClass.StaticNestedClass st1 = new OuterClass.StaticNestedClass();
		
		System.out.println(st1.getA());
		System.out.println(st1.getName());
		
		// InnerClass - can also access static & all outer class variable values
		InnerClass innerClass = outer.new InnerClass();
		
		System.out.println(innerClass.getName());
		System.out.println(innerClass);
		innerClass.setValues();
				
		System.out.println(innerClass);
		
		outer.print("Dinesh");
		
		//calling method using anonymous inner class
		System.out.println(Arrays.toString(outer.getFilesInDir("src/main/java/com/basic", ".java")));
		System.out.println(Arrays.toString(outer.getFilesInDir("src/main/java/com/basic", ".class")));
		
		
	}
	
}
