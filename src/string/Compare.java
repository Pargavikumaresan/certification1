package string;

public class Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "";
		StringBuilder sb = new StringBuilder("");
	//	s==sb; //
		sb.append(true); //there is no += operator
		s+='c';
		s+= 2;
		s+=true;
		
		if(s=="c2true"){
			System.out.println("==");
			}
		if(s.equals("c2true")){
			System.out.println("equals");
		}
		System.out.println(s.hashCode());
		System.out.println("c2true".hashCode());
	}
	

}
