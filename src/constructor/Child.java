package constructor;

public class Child extends Parent{
	Child(){
		super(4,6);
		System.out.println("inside the child default");
	}
	Child(int a, String s){
		super(a*2);
	//	this();
		System.out.println("inside the two param child");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub,
	//	Parent p = new Parent(2,4);
		//Parent p1 = new Parent(2,"parent");
	//	Parent p2 = new Child(2,"child");
		Child c = new Child();
//		Child c1 = new Child(3,"child1");

	}

}
