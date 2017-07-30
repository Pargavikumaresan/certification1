package com.array;

public class MultiDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] twoD = new int[3][2];          //default values
		int[][] twoD1 = new int[][]	{{1,2},{3,4}};
		System.out.println(twoD.length);
		//1.
		for (int i = 0; i <twoD.length; i++) {
			System.out.println(twoD[i].length);
			for (int j = 0; j < twoD[i].length; j++){
				System.out.print(twoD[i][j] + " "); // print element
				//System.out.println();                 // time for a new row }
			}
			}
		//2.
		for (int[] inner : twoD1) { 
			for (int num : inner)
			 System.out.print(num + " ");  
		     System.out.println();

		}
	}

}
