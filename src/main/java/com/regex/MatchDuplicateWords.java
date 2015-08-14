package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchDuplicateWords {

	public static void main(String[] args) {
		hasDuplicate("62");		
	}

	private static void hasDuplicate(String text) {
		
		/*\p{L} matches a single code point in the category "letter".
		\p{N} matches any kind of numeric character in any script.*/
		
		// \\1 access the first repeated group
		//String regex = "\\b(\\w+)  \\1\\b";	
		
		//String regex = "(\\p{Upper}(\\p{Lower}+\\s?)){2,3}";	
		
		String regex = "(\\d-)";	
		Pattern pt=null;
		
		try{
			
			pt = Pattern.compile(regex);
			
		}catch(Exception e){
			
			e.printStackTrace();
			System.exit(0);
			
		}
		
		Matcher m = pt.matcher(text);
		String val=null;
		
		while(m.find()){
			val =m.group();
		}
		if(val == null){
			System.out.println("No Matches");
			
		}
		
		System.out.println(val);
		
		
	}
	
}
