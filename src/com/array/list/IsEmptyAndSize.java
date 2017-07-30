package com.array.list;

import java.util.ArrayList;
import java.util.List;

public class IsEmptyAndSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> birds = new ArrayList<>();
		System.out.println(birds.isEmpty());     // true 
		System.out.println(birds.size());     // 0
		birds.add("hawk");                    // [hawk]
		birds.add("hawk");                    // [hawk, hawk]
		System.out.println(birds.isEmpty());     // false
		System.out.println(birds.size());     // 2


	}

}
