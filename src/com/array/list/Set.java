package com.array.list;

import java.util.ArrayList;
import java.util.List;

public class Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> birds = new ArrayList<>(); 
		birds.add("hawk");// [hawk] 
		birds.add(1, "hi");
		birds.add(2,"hello");
		System.out.println(birds);
		birds.add(2,"bye");
		System.out.println(birds);
		System.out.println(birds.size());     // 1 18: 
		birds.set(0, "robin");   
		System.out.println(birds);// [robin] 19:
		System.out.println(birds.size());     // 1 20:
    	birds.set(1, "robin");  
		System.out.println(birds);// IndexOutOfBoundsException


	}

}
