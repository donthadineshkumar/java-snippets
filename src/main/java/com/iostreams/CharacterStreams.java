package com.iostreams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreams {

	/* 
	 * Java platform stores charcter values using Unicode conventions.
	 * Character Strema I/O automatically translates this internal format
	 * to and from the local character set.
	 * Character Streams are often "Wrappers" for byte streams.
	 * The Character stream uses the byte stream to perform the physical
	 * I/O, while the character stream handles translation between 
	 * characters and bytes.
	 * FileReader uses FileInputStream & FileWriter uses FileOutputStream(Internally)
	 */
	public static void main(String[] args) {
		
		/*
		 * A program that uses character streams in place of byte streams
		 * automatically adapts to the local character set and is ready for
		 * i18n
		 * 
		 * if 118n is not a priority, you can simply use the character stream
		 * classes without paying much attention to character set issues.
		 * later, if i18n becomes a priority, your program can be adopted without
		 * extensive recording.
		 */
		try(FileReader fr = new FileReader("/home/dinesh/hello.txt");
			 FileWriter fw = new FileWriter("/home/dinesh/hello_copy.pdf")){
			int c;
			while((c=fr.read())!=-1){
				System.out.println(c);
				fw.write(c);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
}
