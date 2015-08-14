package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindEnd {

	public static void main(String[] args) {
		
		String txt ="My name is Bond. James Bond.";
		
		Pattern p = Pattern.compile("Bond");
		Matcher matcher = p.matcher(txt);
		
		// first end point of first match
		matcher.find();
		System.out.println(matcher.end());
		
		//finds the end point of second match
		matcher.find();
		System.out.println(matcher.end());
		
	}
	
}
