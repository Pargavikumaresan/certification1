package com.array.list;

import java.util.ArrayList;
import java.util.List;

public class Contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> birds = new ArrayList<>();
		birds.add("hawk");                         // [hawk] 
		System.out.println(birds.contains("hawk")); // true 
		System.out.println(birds.contains("robin")); // false


	}

}
