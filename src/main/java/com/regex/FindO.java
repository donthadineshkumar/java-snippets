package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindO {

	public static void main(String[] args) {
		
		
		//String regex = "(([A-Za-z])+\\.?)?";
		
		//String name ="([A-Za-z])+ (([A-Za-z])+\\.? )?([A-Za-z])+\\s*";
		
		//String zip="\\d{5}(-\\d{4})?" ;
		
		//date - \\d{1,2}-\\d{1,2}-\\d{4}
		
		//()? - this is optional group
		
		String regex ="\\d{1,2}-\\d{1,2}-\\d{4}" ;
		
		String text = "12-12-1212";
		
		Pattern pat = Pattern.compile(regex);
		
		Matcher m = pat.matcher(text);
		
		String val = null;
		
		while(m.find()){
			
			val = m.group();
		
			System.out.println("MATCH "+val + " start "+m.start()+" end "+m.end());
		}
		
		if(val ==null){
			System.out.println("No Matches");
		}
		
		
	}
}
