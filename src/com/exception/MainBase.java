package com.exception;

import java.io.IOException;


public class MainBase {
	/*void myMethod() throws IOException{
		System.out.println("Base");
	}
*/	
	void myMethod() throws Throwable{
		System.out.println("Base");
	}
	String var = "Main";
	void printVar(){
		System.out.println(var);
	}

}
