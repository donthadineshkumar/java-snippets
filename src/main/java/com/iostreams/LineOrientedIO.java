package com.iostreams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * Character Streams read data characters wise .
 * BufferedReader and PrinterWriter classes use line
 * oriented IO
 * 
 * BufferedReader - readLine reads a line
 * PrintWriter - println writes a line 
 */

public class LineOrientedIO {

	public static void main(String[] args) {
		File infile = new File("/home/dinesh/hello.txt")	;
		File outfile = new File("/home/dinesh/hello_copy.txt");
		
		try(BufferedReader br = new BufferedReader(new FileReader(infile));
			PrintWriter pr = new PrintWriter(new PrintWriter(outfile))){
			String l;
			
			while((l = br.readLine()) != null){
				System.out.println("l: "+l);
				pr.println(l);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}
	
}
