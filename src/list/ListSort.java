package list;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         List<String> hex = Arrays.asList("30", "8", "3A", "FF"); 
		 Collections.sort(hex); 
		 System.out.println(hex); 
		 int x1 = Collections.binarySearch(hex, "8"); 
		 int y1 = Collections.binarySearch(hex, "3A"); 
		 int z = Collections.binarySearch(hex, "4F"); 
		 System.out.println(x1 + " " + y1 + " " + z); 
	

	}

}
