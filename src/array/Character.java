package array;

public class Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] c = new char[]{'1'};
		int length = c.length;   // there is no size and capacity in array
		//char[] d = new char[]{'1'};
		char [] d = c;
		System.out.println(c.equals(d));
		
	
	}

}
