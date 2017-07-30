package com.array.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> list = new ArrayList<>(); 
		 list.add("hawk");
		 list.add("robin"); 
		 String[] stringArray = list.toArray(new String[0]); 
		 List<String> list1 = Arrays.asList(stringArray);
		 	// list1.add("abc");
		       list1.remove(1);   //unSupportedOperationException

	}

}
