package com.lambdas;

/*
 * A lambda expression cannot declare
 * type parameters, and therefore, it cannot have a target type 
 * whose abstract method is generic.
 * 
 * you cannot represent Processor interface below in lambda expressions
 * @FuntionalInterface
 * public interface Processor {
 * 		<T> void process(T[] list);
 * }
 * 
 */

@FunctionalInterface
public interface Mapper<T> {

	//an abstract method
	int map(T source);
	
	//a generic static method
	public static  <U> int[] mapToInt( U[] list, Mapper<? super U> mapper ){
		int[] mappedValues = new int[list.length];
		
		for (int i = 0; i < mappedValues.length; i++) {
			// map the object to an int
			mappedValues[i] = mapper.map(list[i]);
		}
		return mappedValues;
	}
	
}
