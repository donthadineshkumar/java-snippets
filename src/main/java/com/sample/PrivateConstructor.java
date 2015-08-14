package com.sample;

public class PrivateConstructor {

	
	
	private PrivateConstructor(){
		
	}
	
	public static PrivateConstructor getInstance(){
		return new PrivateConstructor();		
	}
	
}
