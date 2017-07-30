package certification.dino;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Dino {
	
//1.
	
	/*static final String species="Str"; // error must be initialize
//	final String species;   //  no error
	//static String species; // no error
	double weight;
	{
	//	species = "Raptor";//errror because species final
	}
	public Dino(double weight){
		this.weight = weight;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dino dino = new Dino(500);
		System.out.println(dino.weight);
	}

*/
	

//2.
	
/*	private String color;
	public Dino(String color){
		color = color;
	}
	public static void main(String[] args) {
		Dino d = new Dino(""); // we have to pass parameter
		System.out.println(d.color);
	}
*/

//3.
	/*public static void main(String[] args) {
		int[][] numbers = {{1,2},{3},{4,5,6}};
		System.out.println(numbers[0][1]);
		System.out.println(numbers[0][2]);
		System.out.println(numbers[1][0]);
		System.out.println(numbers[1][1]);
		System.out.println(numbers[2][0]);
		System.out.println(numbers[3][0]);
		System.out.println(numbers);
	*/	
	
//4.
	
/*private boolean b;
public static void main(String[] args) {
	Dino c = new Dino();
	int one,two = 0;
	if(c.b){
		System.out.println(one);
	}
	
}
*/
	
//5.
	
	/*public static void main(String[] args) {
		String letters = " java ";
		String answer = letters.trim();
		String ans = letters.substring(1);
		String ans1 = letters.replace("", "");
		System.out.println(answer);
		System.out.println(ans);
		System.out.println(ans1);
	}
	*/
	
/*//6.
	public static void main(String[] args) {
		String s = null ;
		System.out.println(s);
	}*/
	
	
//7.
	/*public static void main(String[] args) {
		int[] nums = new int[]{1,0,2};
		Object p = nums;
		int[] two = (int[])p;
		System.out.println(10/two[2]);
	}*/
	
	
//8.
	/*public static void main(String[] args) {
		int y = 4;
		int x = 10-++y/5;
		System.out.println(x%y);
	}
	*/
	
//9.
	/*public static void main(String[] args) {
		int x = 4;
		if((x<=5)^(x==4))     //exclusive-OR (ff,tt)=F,  (tf,ft = T)
			System.out.println("low");
		else if(x==4)
			System.out.println("Match");
		if(x>1)
			System.out.println("High");
	}*/
	
//10.
	/*public static void main(String[] args) {
		LocalDateTime d = LocalDateTime.of(2018,9,23,22,28,33);
		Period p = Period.of(1,2,3);
		d = d.minus(p);
		DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		System.out.println(d.format(f));
	}*/
	
//11.
	
/*public static void main(String[] args) {
	System.out.println(16<<3);
	System.out.println(16>>>3);
}
*/	
	
//12.
	/*
	public static void main(String[] args) {
		String s1 = new String("Java");
		String s2 = new String("Java");           //infinite loop(s3==s4)
		String s3 = "java";
		String s4 = "java";
		do{
		System.out.println(s1.equals(s2));
		} while(s3==s4);
	*/	
	
	
}
