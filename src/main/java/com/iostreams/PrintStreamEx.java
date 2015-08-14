package com.iostreams;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamEx {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		//How to divert the output to a file instead of Standard Output
		System.setOut(new PrintStream(new BufferedOutputStream(
				new FileOutputStream(new File("src/main/resources/output.txt"))), true));
		
		byte[] bytes = "dinesh".getBytes();
		
		//PrintStream ps = new PrintStream(System.out);
		
		//PrintStream ps = new PrintStream(new File("src/main/resources/E1.txt"));
		PrintStream ps = new PrintStream(System.out, false);
		
		try {
			ps.write(bytes);
			
			char[] a = null;
			
			//error - NullPointerException
			//ps.println(a);
			
			String a1 = null;
			ps.println(a1);
			
			//System.out.println(ps.checkError());
			
	
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
