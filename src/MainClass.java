
public class MainClass {

	public static void main(String[] args) {
		Store s1 = new Store();
		System.out.println("s1.x = "+s1.x);
		Store s2 = s1;
		s1.x=1;
		s2.x=2;
		System.out.println("s1.x = "+s1.x);
		System.out.println("s2.x = "+s2.x);
		
	}

}
