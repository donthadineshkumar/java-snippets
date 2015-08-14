package com.generics;
/*
 * Note: cmpile time safety and run time safety is 
 * primary goal of the generics
 */
public class WatchUtilTest {
	public static void main(String a[]) {
		WrapperUtil wu = new WrapperUtil();
		
		Wrapper<?> wrapper = new Wrapper<Double>(new Double(45.4));
		
		wu.printDetails(wrapper);
		
		Wrapper<Integer> intWrapper = new Wrapper<Integer>(new Integer(10));
		Wrapper<? extends Number> numberWrapper = intWrapper;
		
		double su = wu.sum(numberWrapper,numberWrapper);
		
		//compile-time error
		//double su = wu.sum(new Integer(23), new Integer(10));
		
		Wrapper<Double> dblWrapper = new Wrapper<Double>(new Double(29.11));
		Wrapper<? extends Number> numberWrapper1 = dblWrapper;
		double su1 = wu.sum(numberWrapper1,numberWrapper1);

		System.out.println(su +" "+su1);
		
		Wrapper<Object> objectWrapper = new Wrapper<Object>(new Object());
		Wrapper<String> stringWrapper = new Wrapper<String>("Hello");
		wu.copy(stringWrapper, objectWrapper);
		System.out.println(objectWrapper.get());
	}
}
