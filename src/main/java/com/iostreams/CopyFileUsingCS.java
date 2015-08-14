package com.iostreams;

import java.io.*;

public class CopyFileUsingCS {

	public static void main(String[] args) {

		try (FileReader fr = new FileReader(new File(
				"src/main/resources/E1.txt"));
				FileWriter fw = new FileWriter(new File(
						"src/main/resources/E2.txt"));) {

			int read;
			while( (read =fr.read()) !=-1 ){
				fw.write(read);
			}
			
		fw.flush();  // not mandatory
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
