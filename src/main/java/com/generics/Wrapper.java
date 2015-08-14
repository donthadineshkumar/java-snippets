package com.generics;

/*
 * Defining a simple generic class
 * T is the formal type parameter
 */
public class Wrapper<T> {
	
	public T var1;
	
	public Wrapper(T t){
		this.var1 = t;
	}
	
	public T get(){
		return var1;
	}
	
	public void set(T t){
		var1 = t;
	}
}
