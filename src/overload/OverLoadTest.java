package overload;

public class OverLoadTest {
	 public int sum(int i1, int i2) { return i1 + i2; }
	 public int sum(int i1, long i2) { return (int) i2; }
	 public int sum(long i1, long i2) { return (int) i1; }
	 public long sum(long i1, int i2) { return i1 + i2; }
	// public int sum(int a, int b) { return a + b; }
	// public long sum(int i1, int i2) { return i1 + i2; }


}
