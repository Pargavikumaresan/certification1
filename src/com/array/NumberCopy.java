package com.array;

import java.util.Arrays;

public class NumberCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,3,4,5};
		//String[] array1 = {"1","4","6","7","8"};
		System.arraycopy(array, 2, array, 1, 2);  
		String arr = Arrays.toString(array);
		System.out.println(arr.toString());
		System.out.println(array[0]);
		System.out.println(array[1]);

	}

}
