package com.abc.orders;

public class Ex1 {
/*
	Ex1()
	{
		try{
		new Ex1() ;
		}
		catch(Error e){
			//e.printStackTrace();
		//System.out.println(e);
			System.out.println("Infinite Recursion");
		}
		
	}
*/	public static void main(String[] args) throws VoterNotFoundException {
		// TODO Auto-generated method stub
		
		//Ex1 ex= new Ex1();
		int age = 10;
	
		if(age<18)
		{
			throw new VoterNotFoundException("Voter Not Found");
		}
		
		

	}

}
