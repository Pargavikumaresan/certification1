package com.abc.orders;

public class VoterNotFoundException extends Exception{
	String string;
public VoterNotFoundException(String string) {
		// TODO Auto-generated constructor stub
	this.string = string;
	getMessage(string);
	
	}

public static String getMessage(String s ){
	return s;
}


	}
