package com.date.time;

import java.time.LocalDate;
import java.time.Month;

public class ManipulateDateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
		 System.out.println(Month.JANUARY);
		 System.out.println(date);          // 2014-01-20 14:
		 date = date.plusDays(2); 
		 System.out.println(date);          // 2014-01-22 16:
		 date = date.plusWeeks(1);
		 System.out.println(date);          // 2014-01-29 18:
		 date = date.plusMonths(1); 
		System.out.println(date);           // 2014-02-28 20:
		 date = date.plusYears(5); 
		 System.out.println(date);         // 2019-02-28


	}

}
