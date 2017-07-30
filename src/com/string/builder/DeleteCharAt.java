package com.string.builder;

public class DeleteCharAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("abcdef");
		System.out.println(sb.delete(1, 3));      // sb = adef
	    System.out.println(sb);
	    sb.deleteCharAt(2);
	    System.out.println(sb);
		sb.deleteCharAt(4);                // throws an exception
		System.out.println(sb);
	}

}
