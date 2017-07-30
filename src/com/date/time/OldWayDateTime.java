package com.date.time;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class OldWayDateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();               //curentDate and TIme
		System.out.println(d.getDate());
		System.out.println(d.toString());

		Calendar c = Calendar.getInstance();
		c.set(2015, Calendar. JANUARY, 1); 
		Date jan = c.getTime();
		System.out.println("Inside Calender time = "+jan+"Date = "+c.getFirstDayOfWeek());

		Calendar c1 = new GregorianCalendar(2015, Calendar. JANUARY, 1); 
		Date jan1= c1.getTime();
		
		
		Calendar c2 = Calendar.getInstance();
		c2.set(2015, 1, 1); 
		Date jan2 = c2.getTime();
		System.out.println(jan2);


	}

}
