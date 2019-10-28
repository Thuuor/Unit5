
public class MainClass4 {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		System.out.println(r);
		r.moveTo(4, 4);
		System.out.println(r);
		
		Rectangle r2 = new Rectangle(new Point(1,1), 8, 6);
		System.out.println(r2);
		
		Rectangle r3 = new Rectangle(new Point(2,2), new Point(8,8));
		System.out.println(r3);
		
		Segment s = new Segment(new Point(4,5),new Point(6,8));
		Rectangle r4 = new Rectangle(s);
		System.out.println(r4);
		System.out.println(r4.getArea());
		System.out.println(r4.getPoint());
		System.out.println("---------------------------");

		Rectangle r5 = new Rectangle(new Point(5,6), 10, 8);
		System.out.println(r5);
		System.out.println("Top-Left: " + r5.getTopLeftPoint() + 
							" Top-Right: " + r5.getTopRightPoint() + 
							" Bottom-Left: " + r5.getBottomLeftPoint() + 
							" Bottom-Right: " + r5.getBottomRightPoint());
	}
}
