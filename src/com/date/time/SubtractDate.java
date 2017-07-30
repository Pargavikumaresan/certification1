package com.date.time;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class SubtractDate {
	public void subtractDay(Date date) {
		Calendar cal = Calendar . getInstance();
		cal.setTime(date); 
		cal.add(Calendar.DATE, -1); 
		System.out.println( cal.getTime());
		}
	public void subtractDay(LocalDate date) { 
		System.out.println(date.   minusDays(1));
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubtractDate d1 = new SubtractDate();
		Date date = new Date();
		LocalDate localDate = LocalDate.of(2017, 07, 25);
		d1.subtractDay(localDate);
		d1.subtractDay(date);

	}

}
