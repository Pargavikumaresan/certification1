package numbers;

public class Method {
	private int i=6;
	private int j=i;
	public Method() {
		i = 5;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method m = new Method();
		System.out.println(m.i +m.j);

	}

}
