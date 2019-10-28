
public class Polygon {
	
	private Point[] points;
	
	public Polygon(Point[] points) {
		this.points = points;
	}
	
	public Polygon() {
		points = new Point[0];
	}
	
	@Override
	public String toString() {
		String s = "";

		for (int i = 0;i < points.length;i++) {
			
			s += points[i].toString() + " - ";
		}
		s += points[0];
		return s;
	}
	
	public void setOffSet(int offX,int offY) {
		
		for (int i = 0; i < points.length;i++) {
			points[i].setOffset(offX, offY);
		}
	}
	
	public double getLength() {
		
		double seg = 0.0;
		Point p1 = points[0];
		
		for (int i = 1;i < points.length;i++) {
			
			Segment s = new Segment(p1,points[i]);
			
			seg += s.module();
			
			p1 = points[i];
		}
		Segment s = new Segment(points[points.length-1],points[0]);
		
		seg += s.module();
		
		return seg;
		
	}
	
}
