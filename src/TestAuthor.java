
public class TestAuthor {

	public static void main(String[] args) {

		Author a = new Author("Patrick", "alu@gmail.com", 'm');
		
		System.out.println(a.toString());
		
		a.setEmail("rrrrrr@gmail.com");
		
		System.out.println(a.toString());
	}

}
