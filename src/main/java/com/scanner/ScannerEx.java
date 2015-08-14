package com.scanner;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Scanner;

 

public class ScannerEx {

	public static void main(String[] args) {
		
/*		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNext()){
			System.out.println(scanner.next());
		}
		
		scanner.close();*/
		
		DataInputStream ds = new DataInputStream(System.in);
		
		int read;
		try {
			while( (read = ds.read()) != -1){
				System.out.write(read);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
	
}
