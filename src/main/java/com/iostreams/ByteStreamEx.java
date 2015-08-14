package com.iostreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class ByteStreamEx {
	public static void main(String[] args) {
	
		try(FileInputStream fin = new FileInputStream("/home/dinesh/hello.txt");
			FileOutputStream fout = new FileOutputStream("/home/dinesh/hello_copy.txt")){

			/*
			 * as the source file contains characters - it is best to use
			 * character streams - avoid this byte stream
			 * This is kind of low-level I/O
			 */
			
			int c;
			while ((c= fin.read()) != -1) {
				System.out.println(c);
				fout.write(c);
				}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
}
