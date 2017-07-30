package com.string.builder;

public class Builder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 StringBuilder alpha = new StringBuilder(); 
	 for(char current = 'a'; current <= 'z'; current++) 
	 alpha.append(current); 
	 System.out.println(alpha);
	 StringBuilder sb = new StringBuilder("animals"); 
	 String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
	System.out.println( sb.substring(sb.indexOf("a"), sb.indexOf("al")));
	 System.out.println(sb);
	 int len = sb.length();
	 char ch = sb.charAt(6); 
	 System.out.println(sb + " " + len + " " + ch);

	}

}
