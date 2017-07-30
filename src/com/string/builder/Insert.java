package com.string.builder;

public class Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 StringBuilder sb = new StringBuilder("animals");     
		 sb.insert(7, "-"); 
		 System.out.println(sb); // sb = animals-
		 sb.insert(0, "-");                   // sb = -animals
		 sb.insert(4, "-");   // sb = -ani-mals- 
		 System.out.println(sb);
		 sb.insert(12, "c");
		 System. out .println(sb);
}

}
