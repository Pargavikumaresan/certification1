package com.exception;

import java.io.IOException;

public class MainDerived extends MainBase {
void myMethod() throws RuntimeException{
	System.out.println("Derived");
}
String var = "AAA";
void printVar(){
	System.out.println(var);
}
public static void main(String[] args) {
	MainBase b = new MainBase();
	MainBase d = new MainDerived();
	System.out.println(b.var);
	System.out.println(d.var);
	b.printVar();
	d.printVar();
	
	/*try {
		m.myMethod();
	} catch (IOException e) {
		// TODO Auto-generated catch block             if it is IOException
		e.printStackTrace();
	}*/
	/*m.myMethod();   //if it is ExceptionInInitializerError
*/	
	
	
	
}
}
