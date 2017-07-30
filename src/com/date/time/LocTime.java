package com.date.time;

import java.time.LocalTime;

public class LocTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime time1 =  LocalTime.of(6, 15);               // hour and minute
		LocalTime time2 =  LocalTime.of(6, 15, 30);          // + seconds
		LocalTime time3 =  LocalTime.of(6, 15, 30,200);     // + nanoseconds
		System.out.println(time1);
		System.out.println(time2);
		System.out.println(time3);

	}

}
