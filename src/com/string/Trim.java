package com.string;

public class Trim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("abc".trim());           // abc 
		System.out.println("\t   a b c\n".trim()); // a b c
		String start = "AniMaL   ";
		String trimmed = start.trim(); 
		System.out.println(trimmed);
		String lowercase = trimmed.toLowerCase();      // "animal"
		String result = lowercase.replace('a', 'A');   // "Animal"
		System.out.println(result);
		String result1 = "AniMaL   ".trim().toLowerCase().replace('A', 'a');
		System.out.println(result1);
		String a = "abc"; 
		String b = a.toUpperCase(); 
		b = b.replace("B", "2").replace('C', '3'); 
		System.out.println("a=" + a); 
		System.out.println("b=" + b);
		String alpha = ""; 
		for(char current = 'a'; current <= 'z'; current++) 
		alpha += current; 
		System.out.println(alpha);
	}

}
