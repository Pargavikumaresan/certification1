package com.string.builder;

public class Equality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder one = new StringBuilder(); 
		StringBuilder two = new StringBuilder();
		StringBuilder three = one.append("a");
	    three.append("bc");
	    System.out.println(one + " "+three);
		System.out.println(one == two); // false
		System.out.println(one == three); // true
		String x = "Hello World";
		String y = "Hello World";
		System.out.println(x == y);    // true
		String z = " Hello World".trim(); 
		System.out.println(x == z); // false
        System.out.println(z.equals(x));
}

}
