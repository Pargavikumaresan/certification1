package interface1;

public class Speak {
 // static class Sample{
	class Sample2{
		  void sample2(){
			  System.out.println("sample2");
		  }
	  }
	 

	static class Sample{
	  void display(){
		  System.out.println("Static");
	  }
	  abstract class Sample1{
		  void sample1(){
			  System.out.println("sample1");
		  }
	  }
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Speak speak = new Speak();
		Sample s = new Sample();
		s.display();
		 new Sample().display();
		 
		 
	//	com.interface1.Speak.Sample.Sample1 s1 = new com.interface1.Speak.Sample.Sample1();
	//	 com.interface1.Speak.Sample.Sample2 s2 = new com.interface1.Speak.Sample.Sample2();
		 
	
//		Speak s = new Tell();
//		Tell t = new Tell();
//		Tell t1 = (Tell)s;
//		t1.takeItLikeItIs();
//		Speak s1 = (Speak)t;
//		System.out.println(s1.toString());
//		((Tell)s).takeItLikeItIs();
//		System.out.println();
//		(Speak)t.takeItLikeItIs();
//		((Truth)s).takeItLikeItIs();
//		(Truth)t.takeItLikeItIs();
//		(Truth)s.takeItLikeItIs();
//		((Truth)t).takeItLikeItIs();
//
	}

}
