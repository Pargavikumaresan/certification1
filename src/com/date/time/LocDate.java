package com.date.time;

import java.time.LocalDate;
import java.time.Month;

public class LocDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LocalDate d = new LocalDate(); // DOES NOT COMPILE
		System.out.println(LocalDate.of(1997,9,10));
		System.out.println(LocalDate.of(1997, Month.SEPTEMBER,10));
    	LocalDate.of(2015, Month.JANUARY, 32);     // throws DateTimeException
	}

}

