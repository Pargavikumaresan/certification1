package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int[] ran ={6,-4,12,0,-10};
		int x = 12;
		int y = Arrays.binarySearch(ran, x);
		System.out.println(y);
		
		String [] name2 = new String[]{"Tom", "Dick", "Harry"};
		 String [] names = {"Tom", "Dick", "Harry"};  
		 System.out.println(names[0]); 
		 System.out.println(names == name2);
		 System.out.println(names.equals(name2));

		 
	}
		
 
}
