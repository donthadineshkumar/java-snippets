package com.datatypes;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.joda.time.DateTime;
import org.joda.time.Days;

public class CalendarEx1 {

	public static void main(String[] args) {
		
		
		long checkinDate, checkoutDate;
		
		Calendar calender = Calendar.getInstance();
		
		calender.add(Calendar.DAY_OF_MONTH, 1);
		
		checkinDate = calender.getTimeInMillis();
				
		calender.add(Calendar.DAY_OF_MONTH, 1);
		
		checkoutDate = calender.getTimeInMillis();
		
		long diff = checkoutDate - checkinDate;
		
		//jodatime
		//int days = Days.daysBetween(new DateTime(checkoutDate), new DateTime(checkinDate)).getDays();
		
		long diffDays = diff / (24 * 60 * 60 * 1000);
		
		System.out.println(diffDays);
		
		long diffSeconds = diff/1000;
		
		System.out.println("seconds "+diffSeconds);
		
		long diffMinutes = diff/ (1000 * 60);
		
		System.out.println("minutes "+diffMinutes);
		
		long diffHours = diff / (1000 * 60 * 60);
		
		System.out.println("Hours "+diffHours);
				
		System.out.println(calender.getTime());
//		System.out.println(checkoutDate-checkinDate);
		
	}
	
}
