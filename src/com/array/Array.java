package com.array;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strings = { "stringValue" }; 
		Object[] objects = strings; 
		String[] strings1 = strings;
		String[] againStrings = (String[]) objects; 
		System.out.println(Arrays.toString(againStrings));
		System.out.println(Arrays.toString(objects));
		System.out.println(Arrays.toString(strings));
		//againStrings[0] = new StringBuilder();   // DOES NOT COMPILE 
		//objects[0] = new StringBuilder();        // careful!   java.lang.ArrayStoreException
		 String[] mammals = {"monkey", "chimp", "donkey"}; 
		 System.out.println(mammals.length);           // 3 
		 System.out.println(mammals[0]);               // monkey 
		 System.out.println(mammals[1]);               // chimp 
		 System.out.println(mammals[2]);               // donkey
		 String[] birds = new String[6];
		 System.out.println(birds.length);
		 System.out.println(Arrays.toString(birds));
	}
}
