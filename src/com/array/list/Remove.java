package com.array.list;

import java.util.ArrayList;
import java.util.List;

public class Remove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> birds = new ArrayList<>(); 
		 birds.add("hawk");     // [hawk] 5:
		 birds.add("hawk");     // [hawk, hawk] 6:
		 System.out.println(birds);
		 System.out.println(birds.remove("cardinal")); // prints false 7:
		 System.out.println(birds.remove("hawk")); // prints true
		 System.out.println(birds);
		 System.out.println(birds.remove(0)); // prints hawk 9:
		 System.out.println(birds);     // []

}
}
