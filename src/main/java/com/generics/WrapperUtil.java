package com.generics;

public class WrapperUtil {
	public static void printDetails(Wrapper<?> wrapper) {
		// Can assign get() return value to Object
		Object value = wrapper.get();
		String className = null;
		if (value != null) {
			className = value.getClass().getName();
		}
		System.out.println("Class: " + className);
		System.out.println("Value: " + value);
	}
	
	/*
	 * using upper-bounded wildcards
	 *  <? extends Number>
	 *  allows only classes of Number type and its sub-types   
	 */
	public static double sum(Wrapper<? extends Number> n1, Wrapper<? extends Number> n2) {
		Number num1 = n1.get();
		Number num2 = n2.get();
		double sum = num1.doubleValue() + num2.doubleValue();
		return sum;
	}
	
	/*
	 * lower-bounded wildcards
	 * <? super T>
	 * anything that is a supertype of T
	 */
	public static <T> void copy(Wrapper<T> source, Wrapper<? super T> dest) {
		T value = source.get();
		dest.set(value);
	}
	
	
	
}
