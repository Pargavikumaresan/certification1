package com.trycatch;

public class Sample {

	static {
		System.out.println("Static");
	}
	{
		System.out.println("Instance");
	}
	
	void method() {
	    try {
	      myMethod();
	      return;
	    }  finally
	    {
	      System.out.println("finally 1");
	    }
	  }

	  void myMethod() {
		  throw new StackOverflowError();
	  /* System.out.println("myMethod");
	    throw new StackOverflowError();
	  */
	  }  static{
			System.out.println("static1");
		}

	  public static void main(String args[]) {
		  boolean myValue = false;
		  if(myValue =true){
			  for(int i=0;i<2;i++){
				  System.out.println(i);
			  }}
		  else{
			  
			  System.out.println("else");
		  }
	    Sample var = new Sample();
	    var.method();
	 }

}
