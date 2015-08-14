package com.sample;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestPrivateCons {

	@Test
	public void test(){
			
			PrivateConstructor pr = PrivateConstructor.getInstance();
				
			assertTrue( pr instanceof PrivateConstructor);
	}
	
}
