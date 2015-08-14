package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationTest {

	public static void main(String[] args) {
/*        String candidate = "I love Java 4";
        String  pattern = "Java \\d";
        System.out.println(candidate.matches(pattern));*/
		
		/* 
		 * Checking with Pattern and Matcher
		 * so it .matches didnt find this patern where as Matcher has found
		 * it
		 */
		Pattern pt =null;
		
		pt = Pattern.compile("Java \\d");
		
		String stmt = "I love Java 4";
		
		Matcher m = pt.matcher(stmt);
		
		if(m!=null) { 	System.out.println(m.find()+ " "+ m.group()); }
		
	}
	
}
