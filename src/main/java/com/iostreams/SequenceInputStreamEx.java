package com.iostreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class SequenceInputStreamEx {

	public static void main(String[] args) {
		
		
		FileInputStream fs;
		FileInputStream fs2;
		FileOutputStream fo;
		
		try {
			fs = new FileInputStream("src/main/resources/E1.txt");
			fs2 = new FileInputStream("src/main/resources/E2.txt");
			
			Enumeration<InputStream> enums;
			
			Vector<InputStream> streams = new Vector<InputStream>();
			
			streams.add(fs);
			streams.add(fs2);
			
			enums = streams.elements();
			
			fo =new FileOutputStream("src/main/resources/total.txt");
			
			//SequenceInputStream seq = new SequenceInputStream(fs, fs2);
			
			SequenceInputStream seq = new SequenceInputStream(enums);

			int read;
			while( (read =seq.read()) != -1 ){
				fo.write(read);
			}
			fo.write("\n".getBytes());
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
	
}
