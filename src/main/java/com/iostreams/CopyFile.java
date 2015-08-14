package com.iostreams;

import java.io.*;

public class CopyFile {

	public static void main(String[] args) {
		
		
		
		try(FileInputStream fis = new FileInputStream(new File("src/main/resources/Example.txt"));
			FileOutputStream fos = new FileOutputStream(new File("src/main/resources/E1.txt"))	;		
				)
		{
			int read;
			while((read = fis.read()) != -1){
				fos.write(read);
			}
			fos.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
