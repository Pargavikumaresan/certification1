package com.string.builder;
  
import java.util.Scanner;

public class StringReverse {
	
static String name1;
	
static String reverseString(String s){
	
	return new StringBuilder(s).reverse().toString();
	
}
  static Boolean palindrome(String s){
	
	//return name1.equals(new StringBuilder(name1).reverse().toString());
	  return s.equals(reverseString(s));
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StringBuilder sb = new StringBuilder(name);
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String to reverse"); 
		String name = s.next();
		StringReverse sr= new StringReverse();
		
		System.out.println(reverseString(name));
		/*System.out.println("Enter the String to check"); 
		name1 = s.next();
		System.out.println(sr.palindrome());
		*/
		System.out.println(palindrome(name));
		
		
	}
	

}
