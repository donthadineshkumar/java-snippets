package com.datatypes;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormatEx {
	
	public static void main(String[] args) {
				
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		
		System.out.println(df.format(new Date()));	
		
		
	}

}
