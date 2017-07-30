package com.array;

import java.util.Arrays;

public class MultiDimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] vars1;          // 2D array 
		int vars2 [][];         // 2D array
		int[] vars3[];          // 2D array 
		int[] vars4 [], space [][];  // a 2D AND a 3D array
		String [][] rectangle = new String[3][2];
		rectangle[0][1] = "set";   
		int[][] differentSize = {{1, 4}, {3}, {9,8,7}};
		int[] name= {1,2,3,4};
		String num = Arrays.toString(name);
        String s1=Arrays.toString(differentSize);
       // System.out.println(rectangle.toString());
        System.out.println(s1.toString());
        System.out.println(num.toString());
        int[] array = {1,2,3,4,5};
        String arr = Arrays.toString(array);
		System.out.println(arr.toString());
		

	}

}
