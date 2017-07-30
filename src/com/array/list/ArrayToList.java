package com.array.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> list = new ArrayList<>(); 
		 list.add("hawk");
		 list.add("robin"); 
		 String[] stringArray = list.toArray(new String[0]); 
		 System.out.println(stringArray.length);
		 String s = Arrays.toString(stringArray);
		 System.out.println(s.toString()); 
		 list.remove(1); 
		  stringArray[2]="hello";
		
		 /* Object[] objectArray = list.toArray();
		 System.out.println(objectArray);
		 String s = Arrays.toString(objectArray);
		 System.out.println(s.toString());      
		 System.out.println(objectArray.length);     // 2 8: 
		 /*System.out.println(stringArray.length);     // 2*/
		

	}

}
