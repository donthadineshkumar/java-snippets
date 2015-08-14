package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AppendReplacement {
 
	public static void main(String[] args) {
		
	      Pattern p = Pattern.compile("(\\w+) (\\w+)");
	      //create a StringBuffer
	      StringBuffer sb =new StringBuffer();

	     //create the candidate Strings
	     String candidateString =
	     "James Bond";

	     String replacement = "$2, $1";
	     //Attempt to match the first candidate String
	     Matcher matcher = p.matcher(candidateString);
	     matcher.matches();

	     //populate the StringBufffer
	     matcher.appendReplacement(sb,replacement);

	     //display the output for the candidate
	     String msg = sb.toString();

	     System.out.println( msg );
		
		
	}
}
