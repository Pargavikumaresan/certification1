package staticimp;

public class StaticImplementation {
	private static int i =10;
    {
	System.out.println("inside Instance block1");
	}
	static{
		System.out.println("inside static");
	}
		{
			System.out.println("inside instance 2");
		}
	static{
			System.out.println("inside static");
		}
	
	

}
