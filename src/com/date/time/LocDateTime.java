package com.date.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocDateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20); 
		LocalTime time1 = LocalTime.of( 20, 6, 15, 30);
		LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30,20); 
		LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);
		System.out.println(dateTime2);
		System.out.println(dateTime1);
		System.out.println(time1);
		}

}
