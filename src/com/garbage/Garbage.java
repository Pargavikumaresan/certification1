package com.garbage;

public class Garbage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Garbage g = new Garbage();
		Garbage g1 = new Garbage();
	  String one, two; 
	  one = new String("a"); 
	  two = new String("b"); 
   	  one = two; 
	  String three = one;  
	  one = null;
	  two =one;
	  three = null;
	  g=null;
	  g1 = null;
	  System.gc();
	  }
	
	@Override
	public void finalize(){
		System.out.println("Garbage Collected");
	}

	}


