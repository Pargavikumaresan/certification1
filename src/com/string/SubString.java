package com.string;

public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "animals"; 
		System.out.println(string.substring(3));  // mals 
		System.out.println(string.substring(string.indexOf('m'))); // mals 
		System.out.println(string.substring(3, 4)); // m 
		System.out.println(string.substring(3, 3)); // empty string
		System.out.println(string.substring(3, 7)); // mals 
		System.out.println(string.substring(3, 2));  // throws exception 
		//System.out.println(string.substring(3, 8)); // throws exception

	}

}
