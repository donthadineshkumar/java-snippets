package com.iostreams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

import javax.swing.text.html.HTMLDocument.Iterator;

public class CopyAllfilesToOne {
	
	public static void main(String[] args) {
		
		

		
		try {
			Stream<Path> list =  Files.list( Paths.get("src/main/resources/").toAbsolutePath());
			//System.out.println(list.count());
			BufferedWriter 	bw = new BufferedWriter(new FileWriter(new File("src/main/resources/total.txt")));
	
			for(Object p: list.toArray()){
				Path p1 =(Path)p;
				System.out.println(p1.getFileName());
				try   (BufferedReader br = new BufferedReader(new FileReader(p1.toFile()));						  
						){
					String line;
					while( (line = br.readLine()) != null ){
						bw.write(line);
					}
					//bw.flush();
					bw.write("\n*****************");
				}
			}
			
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	/*	try(
		BufferedReader br = new BufferedReader(new FileReader())		
		){
			
		}*/
		
	}
	

}
