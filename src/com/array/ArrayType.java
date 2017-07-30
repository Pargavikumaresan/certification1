package com.array;

import java.util.Arrays;

public class ArrayType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   String [] bugs = { "cricket", "beetle", "ladybug" };  
		   String [] alias = bugs;  
		   System. out .println(bugs.equals(alias));     // true  
		   System. out .println(bugs==alias);     // true
		   System. out .println(bugs.toString()); // [Ljava.lang.String;@160bc7c0 
		//   System.out.println(alias.toString());    same
		   System. out .println(Arrays.toString(bugs));
		   System. out .println(Arrays.toString(alias));
		    }
}


