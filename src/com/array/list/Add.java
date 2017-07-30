package com.array.list;

import java.util.ArrayList;
import java.util.List;

public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList(); 
		list.add("hawk");          // [hawk]
		list.add(Boolean.TRUE);    // [hawk, true] 
		System.out.println(list);  // [hawk, true]
		ArrayList<String> safer = new ArrayList<>(); 
		safer.add("sparrow");
		//safer.add(Boolean.TRUE);    // DOES NOT COMPILE
		List<String> birds = new ArrayList<>(); 
	    birds.add("hawk");            // [hawk] 6:
	    birds.add(1, "robin");        // [hawk, robin] 7: 
	    birds.add(0, "blue jay");     // [blue jay, hawk, robin] 8:
	    birds.add(1, "cardinal");     // [blue jay, cardinal, hawk, robin] 9: 
	    System.out.println(birds);    // [blue jay, cardinal, hawk, robin]




	}

}
