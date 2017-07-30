package com.string.builder;

public class Append {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		StringBuilder sb = new StringBuilder("start"); 
		sb.append("+middle");                      // sb = "start+middle" 
		StringBuilder same = sb.append("+end");    // "start+middle+end"
		
		System.out.println(same);
		System.out.println(sb); 
		 StringBuilder a = new StringBuilder("abc"); 
		 StringBuilder b = a.append("de");
		 b = b.append("f").append("g"); 
		 System.out.println("a=" + a); 
		 System.out.println("b=" + b);
		 StringBuilder sb1 = new StringBuilder().append(1).append('c');
		 sb.append("-").append(true); 
		 sb1.append("-").append(true);
		 System.out.println(sb1);    // 1c-true
		 System.out.println(sb);
		 StringBuilder s = new StringBuilder("abcdefghijklmnopqrstuvwxyz"); //42
		/* s.ensureCapacity(10);
		 System.out.println(s.append("abcdefghijklmnopqrstuvwxyz"));
		
		*/
		 System.out.println(s.capacity());
	}
	

}
