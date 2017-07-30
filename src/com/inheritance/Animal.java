package com.inheritance;

public class Animal {
	Animal(){
		System.out.println("inside default");
	}
	  private int age; 
	  public Animal(int age) {  
		 // this();
		  super();
		  System.out.println("inside Animal");
		  this.age = age;
		  System.out.println(age);
		  } 
	  }
	