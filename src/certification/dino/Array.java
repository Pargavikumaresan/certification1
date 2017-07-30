package certification.dino;

import java.util.ArrayList;

public class Array {
public static void main(String[] args) {
	ArrayList<Integer> list = new ArrayList<>(2);
	list.add(1001);
	list.add(1002);
	System.out.println((list.get(list.size())));//ArrayIndexOutOfBoundException
}
}