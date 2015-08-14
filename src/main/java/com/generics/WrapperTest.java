package com.generics;


public class WrapperTest {
	
	public static void main(String a[]) {
		
		//compiler infers the type
		Wrapper<Integer> wr = new Wrapper<>(new Integer(2));
		
		Integer result = wr.get();
		System.out.println("get result "+ result);
		
		wr.set(new Integer(6));
		result = wr.get();
		System.out.println("get result "+ result);
		
		System.out.println("var value "+wr.var1);
		
		/*
		 * compile-time error - incompatible types
		 * Integer cannot be converted to String
		 */
		//wr.set("S");
		/*
		 * Person and Integer are the actual type parameters
		 * When you replace the formal type parameter T with
		 * the actual type parameter - then it is called as 
		 * Parameterized type.
		 */
		Wrapper<Person> per = new Wrapper<Person>(new Person("Dinesh", 20));
		
		System.out.println(per.var1.getName());
		System.out.println(per.var1.getAge());
		
		per.set(new Person("Rajesh", 100));
		System.out.println(per.get().getAge());
		
		Wrapper<String> stringWrapper = new Wrapper<String>("Hello");
		stringWrapper.set("a string"); //setting another string
		
		Wrapper<Object> objectWrapper = new Wrapper<Object>(new Object());
		objectWrapper.set(new Object()); //setting another object
		
		/*
		 * supertype - subtype conversion is not 
		 * allowed with parameterized types
		 */
		//objectWrapper = stringWrapper;
		
		/*
		 * this supertype - subtype conversion is possible here
		 * but this is not possible with parameterized types
		 */
		String ex = "Example";
		Object obj = ex; 
		
		/*
		 * non-generic version of a generic type is
		 * called a raw type. It is for the backward compatability
		 * 
		 * Using raw types is discourged
		 * 
		 * If used - the compiler will generate the uncheked 
		 * warnings
		 * 
		 */
/*		
		Wrapper rawType = new Wrapper("Hello"); // An unchecked warning
		Wrapper<String> genericType = new Wrapper<String>("Hello");
		genericType = rawType; // An unchecked warning
		rawType = genericType;
*/
		
		/*
		 * you can assign a Wrapper<String> to Wrapper<?> type
		 * question mark ? indicates an unknown type
		 */
		Wrapper<?> wildCardWrapper = stringWrapper;
		
		System.out.println(wildCardWrapper.get());
		
		// cannot use <?> with new Operator - Compile time error
		//new Wrapper<?>("");
		Wrapper<?> wr1 = new Wrapper<String>("Helo");
		System.out.println(wr1.get());
		/*
		 * The purpose of using generics is to have compile-time
		 * type-safety n Java programs
		 */
		
		//first three are compile-time error
		/*wr1.set(new String("H"));
		wr1.set(new Integer(10));
		wr1.set(new Object());*/
		
		//A null is assignment-compatabile to any reference type in java
		wr1.set(null);
		
	}
	
}
