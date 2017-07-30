package com.date.time;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class AddDate {
	public void addDate(Date date){
	  Calendar cal = Calendar  . getInstance();
	  cal.setTime(date); 
	  cal.add(Calendar.DATE, 1); 
	  System.out.println( cal.getTime());
	  }
	public void addDay(LocalDate date) {
		System.out.println(date.   plusDays(1));
		}
			

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddDate d1 = new AddDate();
		Date date = new Date();
		LocalDate localDate = LocalDate.of(2017, 07, 23);
		d1.addDay(localDate);
		d1.addDate(date);

	}

}
