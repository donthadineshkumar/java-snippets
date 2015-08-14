package com.exceps;

import java.io.IOException;

class Parent {
	void msg() {
		System.out.println("parent");
	}
}

public class TestExceptionHierarchy extends Parent{

		/*
	 * Rule: If the super class method does not declare an exception,
	 * then the subclass overridden method cannot declare the
	 * checked exception
	 */
	
/*
	@Override
	void msg() throws IOException{

			System.out.println("Test Exception Hierarchy");
		
	}*/

	/*
	 * Rule2: if the super class method does not declare 
	 * an exception, subclass overriden method cannot
	 * declare the checked exception but can 
	 * declare an unchecked exception
	 */
	@Override
	void msg() throws ArithmeticException{
		System.out.println("can declare the Unchecked exceptions");
	}

	public static void main(String[] args) {
		//TestExceptionHierarchy test = new TestExceptionHierarchy();
		Parent p = new Parent();
		p.msg();
	}
	
}
