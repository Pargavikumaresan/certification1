package exception;

import java.io.IOException;

public class ExceptionEx {
	
	public static void doSomething() throws IOException{
		if(Math.random()>0.5)
			throw new IOException();
		throw new RuntimeException();
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			doSomething();
		} catch (RuntimeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
