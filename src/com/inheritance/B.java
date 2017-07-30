package com.inheritance;

public class B extends A{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A b = new B();
		C c = new A();
		B b1=(B) new A();
		C c1 = new B();
		//B b1=(B) new A();
		b.aMethod();

	}
	public void aMethod(){
		System.out.println("Inside the aMethod");
	}

}
