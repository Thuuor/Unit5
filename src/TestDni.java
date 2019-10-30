
public class TestDni {

	public static void main(String[] args) {
		
		DNI d1 = new DNI(12121212);
		System.out.println(d1);
		
		DNI d2 = new DNI("18.957.690-K");
		System.out.println(d2);
		System.out.println(d2.isCorrect());
		
		DNI d3 = new DNI (20906469);
		
		System.out.println(d3.toFormattedString());
	}

}
