package com.iostreams;

import java.io.IOException;
import java.io.InputStreamReader;

public class Example {

	public static void main(String[] args) throws IOException {
		
		/*
		 * using System.in.read() you can read only the next byte
		 * so not useful for reading the keyboard data
		 */
		
		//System.out.println(System.in.read());
		
		InputStreamReader isr = new InputStreamReader(System.in);
		
		int i;
		while( (i =isr.read())!= -1  ){
			System.out.write(i);
		}
		
	}
	
}
