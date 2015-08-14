package com.iostreams;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

public class PushbackEx {

	public static void main(String[] args) throws IOException {
		
		PushbackInputStream ps = new PushbackInputStream(System.in, 8);
		
		InputStream is = new FileInputStream(file);
		
		is.re
		
		int read, i=0;
		while(  (read = ps.read()) != -1 ){
			i++;
		
				System.out.println((char)read);
		
				if(  (char)read == 'e'){
					ps.unread(read);
				}
				
		
			//System.out.println(i);
		}
		
		
	}	
	
}
