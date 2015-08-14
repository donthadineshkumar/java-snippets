package com.scanner;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/*
 * Objects of type Scanner are useful for breaking down 
 * formatted input into tokens and translating individual 
 * tokens according to their data type
 * 
 * By default, Scanner uses white space to separate tokens
 * (white spaces include - blanks : tabs : line terminators
 */
public class ScannerApi {

	public static void main(String[] args) {

		//Scanner by default uses space as delimiter 
		try (Scanner s = new Scanner(new BufferedReader(new FileReader(
				"/home/dinesh/hello.txt")))) {
			//s.useDelimiter(",\\s*"); // can also use a delimiter
			while(s.hasNext()){
				System.out.println(s.next());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
