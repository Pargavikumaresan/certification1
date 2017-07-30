package com.string;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "wild animals";
	StringTokenizer s = new StringTokenizer(string);
while(s.hasMoreTokens()){
	System.out.print(s.nextToken());
	//String name1 = s.nextToken();
	//String name2 = name1;
	//System.out.print(name1);
	
}

		
	}
}
		/*//StringFormatter s = new StringFormatter();
		//String[] string1=string.split("animals", 2);
		String[] string1=string.split(" ", 2);
		String s = Arrays.toString(string1).replace(",", "-");
		System.out.println(s);
		System.out.println(string.join(string, string1));
		System. out .println(string.length());

	}*/


