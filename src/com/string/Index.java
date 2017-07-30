package com.string;

public class Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "animals"; 
		System.out.println(string.indexOf('a'));         // 0 
		System.out.println(string.indexOf("al"));        // 4 
		System.out.println(string.indexOf('a',3));      // 4 
		System.out.println(string.indexOf('A'));
		System.out.println(string.indexOf("al", 5));     // -1


	}

}
