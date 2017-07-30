package array;

import java.util.Arrays;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array ={1,2};
		int[][] array2D = {{0,1,2},{3,4,5,6}}; 
		int[][][] array3D = new int[2][2][2];
		/*int [][] arr = new int[0][2];
		arr[0][0] = 1;
		*/array3D[0][1] = array; 
		System.out.println(Arrays.toString(array3D[0][1]).toString());
		/*String s = Arrays.toString(array2D);
		System.out.println(s.to);
		*///int [][] array = new int[0][];
		System.out.print(array2D[0].length+"");
		System.out.print(array2D[0].getClass().isArray()+"");
		System.out.println(array2D[0][1]);

	}

}
