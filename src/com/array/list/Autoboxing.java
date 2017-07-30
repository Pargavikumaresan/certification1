package com.array.list;

import java.util.ArrayList;
import java.util.List;

public class Autoboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Double> weights = new ArrayList<>(); 
		weights.add(50.5);               // [50.5] 6:
		weights.add(60.);     // [50.5, 60.0] 7:
		System.out.println(weights);
		weights.add(new Double(60));     // [50.5, 60.0] 7:
		System.out.println(weights);
		weights.remove(50.5);               // [60.0] 8:
		System.out.println(weights);
		double first = weights.get(0);     // 60.0
		System.out.println(first);
		List<Integer> heights = new ArrayList<>(); 
		heights.add(null); 
//		int h = heights.get(0);          // NullPointerException
		List<Integer> numbers = new ArrayList<>(); 
		numbers.add(1);
		numbers.add(2);
		numbers.remove(1); 
		System.out.println(numbers);
	}

}
