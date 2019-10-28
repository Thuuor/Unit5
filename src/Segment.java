
public class Segment {
	
	private Point startPoint;
	private Point endPoint;
		
	public Segment() {
		startPoint = new Point();
		endPoint = new Point();
	}
	
	public Segment(Point startPoint,Point endPoint) {
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}
	
	public void setStartPoint(Point p) {
		startPoint = p;
	}
	
	public void setEndPoint(Point p) {
		endPoint = p;
	}
	
	public Point getStartPoint() {
		return startPoint;
	}
	
	public Point getEndPoint() {
		return endPoint;
	}
	
	public double module() {
		int c1 = endPoint.getX() - startPoint.getX();
		int c2 = endPoint.getY() - startPoint.getY();
		double distance = Math.sqrt(Math.pow(c1, 2) + Math.pow(c2, 2));
		return distance;
	}
	
	@Override
	public String toString() {
		return startPoint.toString() + " - " + endPoint.toString();
	}
	
	public void setOffset(int offX,int offY)	{
		
		startPoint.setOffset(offX,offY);
		endPoint.setOffset(offX,offY);
	}
	
		
}
