package com.string.builder;

public class ToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("ABC");
		sb.reverse();
		System.out.println(sb);
		String s = sb.toString();
		System.out.println(s);
	}

}
