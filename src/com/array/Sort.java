  package com.array;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 6, 9, 1 };
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		for (int i = 0; i < numbers.length; i++) 
		System.out.print (numbers[i] +  " ");
		String[] strings = { "10", "9", "100" }; 
		Arrays.sort(strings); 
		System.out.println(Arrays.toString(strings));
		for (String string : strings)
		System.out.print(string + " ");
}
}
