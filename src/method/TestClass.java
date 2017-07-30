package method;

public class TestClass {
	public static void main(String[] args) throws Exception {
        Square sq = new Square(10.0);
        sq.area = sq.getSide()*sq.getSide();
        System.out.println(sq.getArea());
    }


}
