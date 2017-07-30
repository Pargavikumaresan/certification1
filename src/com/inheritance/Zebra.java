package com.inheritance;

public class Zebra extends Animal {
	public Zebra(int age) {
		super(age); 
		System.out.println("inside Zebra1");
		} 
	/*public Zebra() { 
		this(4,4);
		
		System.out.println("inside Zebra2");
		}
*/
public static void main(String[] args) {
	//Zebra z = new Zebra(5);
	Zebra z = new Zebra(2);
}


}
