package com.array.list;

import java.util.ArrayList;
import java.util.List;

public class Equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> one = new ArrayList<>(); 
		 List<String> two = new ArrayList<>(); 
		 System.out.println(one.equals(two));      // true 34:
		 one.add("a");                         // [a] 35: 
		 System.out.println(one.equals(two));     // false 36:
		 two.add("a");                         // [a] 37: 
		 System.out.println(one.equals(two));     // true 38: 
		 one.add("b");                         // [a,b] 39: 
		// two.add(0, "b");                    // [b,a] 40:
		 System.out.println(one.equals(two));     // false
		 two.add("b");                    // [a,b] 40:
		 System.out.println(one.equals(two));     // true
}

}
