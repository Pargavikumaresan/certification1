package overload;

public class Method {
	 public int setVar(int a, int b, float c) {
		return b;
			}
	 public float setVar(int a){
		  return a;
		}
	 public int setVar(int a, float b, int c){
			  return (int)(a + b + c);
			}
			/*	public int setVar(int x, int y, float z){
				  return x+y;
				}
			public float setVar(int a, int b, float c){
			  return c*a;
			}
			 public int setVar(int a, float b, int c){
		  return this(a, c, b);
		}
*/
}
