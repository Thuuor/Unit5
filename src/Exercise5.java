
public class Exercise5 {

	public static void main(String[] args) {

		SwitchBoard sb = new SwitchBoard(20);
		
		sb.registerCall(new Call(111, 333, 15, 1));
		sb.registerCall(new Call(222, 444, 10, 1));
		sb.registerCall(new Call(555, 666, 12, 2));
		
		sb.print();
		
		System.out.println("-----------------");
		
		sb.print(1);
	}

}
