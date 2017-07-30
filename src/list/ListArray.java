package list;

import java.util.ArrayList;
import java.util.List;

public class ListArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>(); 
		list.add("a");
		list.set(0, "Sue");
		list.add(new Integer(0), "b");
		System.out.println(list);
		
		   List<Integer> ages = new ArrayList<>(); 
			ages.add(Integer.parseInt("5"));
		    ages.add(Integer.valueOf("6")); 
			ages.add(7); 
			ages.add(0);
			 
			for (int age : ages) 
				System.out.print(age);
				
			}

	}


