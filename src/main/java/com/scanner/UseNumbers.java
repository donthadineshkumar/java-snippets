package com.scanner;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Locale;
import java.util.Scanner;

public class UseNumbers {

	public static void main(String[] args) {

		double sum =0;
		
		try (Scanner s = new Scanner(new BufferedReader(new FileReader(
				"/home/dinesh/usnumbers.txt")))) {
			s.useLocale(Locale.US);
			while (s.hasNext()) {
				if(s.hasNextDouble()){
					sum += s.nextDouble();
				}else{
					s.next();
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

			System.out.println(sum);
	}
}
