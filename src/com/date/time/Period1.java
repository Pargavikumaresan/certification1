package com.date.time;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Period1 {
	public static void main(String[] args) { 
		LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
		LocalDate end = LocalDate.of(2015, Month.MARCH, 30); 
		Period period = Period.ofMonths(1);               // create a period 
		System.out.println("period"+period);
		Period everyYearAndAWeek = Period.of(1, 0, 7);     // every year and 7 days      
		System.out.println("everyYearAndAWeek"+everyYearAndAWeek);
		Period  annually= Period.ofYears(1); // every 1 year 
	    System.out.println("annually"+annually);
		Period quarterly = Period.ofMonths(3); 
		System.out.println("quarterly"+quarterly);// every 3 months
		Period everyThreeWeeks = Period.ofWeeks(3);          // every 3 weeks
		Period everyOtherDay = Period.ofDays(2);          // every 2 days 
		System.out.println("everyOtherDay"+everyOtherDay);
		Period wrong1 = Period.ofWeeks(1);
		wrong1 = Period.ofYears(7);
		System.out.println("wrong1"+wrong1);

		
		
		Period wrong = Period.ofYears(1).ofWeeks(7);          // every week
		Period month = Period.ofMonths(1).ofMonths(1);
		System.out.println("wrong"+wrong);
		System.out.println("month"+month);
		
		performAnimalEnrichment(start, end, month); } 
	private static void performAnimalEnrichment(LocalDate start, LocalDate end,   Period month) {  // uses the generic period
		LocalDate upTo = start; 
		while (upTo.isBefore(end)) {
			System.out.println("give new toy: " + upTo);    
			upTo = upTo.plus(month);     // adds the period 
			System.out.println(upTo);
			}
			
		
	

	}
}
