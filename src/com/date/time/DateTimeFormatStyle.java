package com.date.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeFormatStyle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date1 = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time = LocalTime.of(11, 12, 34); 
		LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
		LocalDateTime dateTime = LocalDateTime.of(date1, time);
		 DateTimeFormatter shortDateTime =  DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
	       // System.out.println(shortDateTime);
	        System.out.println(shortDateTime.format(dateTime));     // 1/20/20 
	        System.out.println(shortDateTime.format(date1));      // 1/20/20 
	        DateTimeFormatter shortDateTime1 =  DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
	        System.out.println(dateTime.format(shortDateTime1)); 
	        System.out.println(date.format(shortDateTime1));
	        DateTimeFormatter shortDateTime2 =  DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
	       /* System.out.println(time.format(shortDateTime1));    // UnsupportedTemporalTypeException
	        System.out.println(  shortDateTime1.format(time)); // UnsupportedTemporalTypeException
	       */ System.out.println(time.format(shortDateTime2));  
	        System.out.println(  shortDateTime2.format(time));
	        DateTimeFormatter shortF = DateTimeFormatter   .ofLocalizedDateTime(FormatStyle.SHORT);
	        DateTimeFormatter mediumF = DateTimeFormatter  .ofLocalizedDateTime(FormatStyle.MEDIUM);
	        System.out.println(shortF.format(dateTime));     // 1/20/20 11:12 AM 
	        System.out.println(mediumF.format(dateTime));     // Jan 20, 2020 11:12:34 AM



	}

}
