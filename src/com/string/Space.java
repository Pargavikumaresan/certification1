package com.string;

import java.util.Arrays;

public class Space {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String collegeName="Chennai Institute Of Technology";
		String name=collegeName.replace(" ", "");
		System.out.println(name);
		//join
		String string = String.join("", "Chennai","Institute","Of","Technology");
		System.out.println(string);
		
		/*String[] s = collegeName.split(" ", 1);
		String name1 = Arrays.toString(s);
		System.out.println(name1);
		*/}

}
