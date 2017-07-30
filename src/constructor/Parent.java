package constructor;

public class Parent {
	Parent(){
		System.out.println("default");
	}
	Parent(int x, int s){
		this();
		System.out.println("two param int");
		}
	Parent(int n){
		this(n,n);
		System.out.println("one param");
	}
	Parent(int x, String s){
		this();
		System.out.println("two param string");
		}
	
}
