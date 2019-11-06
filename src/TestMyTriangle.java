
public class TestMyTriangle {

	public static void main(String[] args) {

		Triangle t = new Triangle(2, 2, 3, 2, 2, 1);
		System.out.println(t);

		System.out.println(t.getPerimeter());
		
		t.printType();
	}

}
