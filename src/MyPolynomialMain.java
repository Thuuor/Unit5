public class MyPolynomialMain {

	public static void main(String[] args) {
		
		MyPolynomial p1 = new MyPolynomial(2, 2, 2);  
		MyPolynomial p2 = new MyPolynomial(1, 2, 3, 4, 5); 
		// Can also invoke with an array  
		double[] coeffs = {3, 6, 2, 3, 0, 5}; 
		MyPolynomial p3 = new MyPolynomial(coeffs);
		MyPolynomial p4 = new MyPolynomial("poly");

		System.out.println(p3.toString());
		System.out.println(p3.evaluate(2));
		
		System.out.println(p4.toString());
		System.out.println(p4.evaluate(2));
		System.out.println();
		
		
		System.out.println("---------------¡¡ADD!!---------------");
		System.out.println(p2);
		System.out.println(p4);
		System.out.println("-------------------------------------");
		System.out.println(p2.add(p4));
		
		System.out.println();
		System.out.println("-------------¡¡Multiply!!-------------");
		System.out.println(p4);
		System.out.println(p2);
		System.out.println("--------------------------------------");
		System.out.println(p4.multiply(p2));
		
	}

}
