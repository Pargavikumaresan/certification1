package com.array;

import java.util.Arrays;

public class Searching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {2,4,6,8}; 
		System.out.println(Arrays.binarySearch(numbers, 2)); // 0 5:
		System.out.println(Arrays.binarySearch(numbers, 4)); // 1 6:
		System.out.println(Arrays.binarySearch(numbers, 1)); // -1 7:
		System.out.println(Arrays.binarySearch(numbers, 3)); // -2 8:
		System.out.println(Arrays.binarySearch(numbers, 9)); // -5
		int[] number = new int[] {3,2,1}; 
		System.out.println(Arrays.binarySearch(number, 2)); 
		System.out.println(Arrays.binarySearch(number, 3));
	}

}
