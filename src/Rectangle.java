
public class Rectangle extends Point {

	private int width;
	private int height;

	public Rectangle() {
		super();
		width = 0;
		height = 0;
	}
	
	public Rectangle(Point p,int width,int height) {
		super(p.getX(),p.getY());
		this.height = height;
		this.width = width;
		
	}
	
	public Rectangle(Point p1,Point p2) {
		
		super(p1.getX(),p1.getY());
		width = p2.getX() - p1.getX();
		height = p2.getY() - p1.getY();
		
	}
	
	public Rectangle(Segment seg) {
		super(seg.getStartPoint().getX(),seg.getStartPoint().getY());
		Point p1 = seg.getStartPoint();
		Point p2 = seg.getEndPoint();
		width = p2.getX() - p1.getX();
		height = p2.getY() - p1.getY();
		
	}
	
	public Rectangle(int x,int y,int width,int height) {
		
		super(x,y);
		this.height = height;
		this.width = width;
	}
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return super.toString() + " width: " + width + " height: " + height;
	}
	
	public int getArea() {
		return height * width;
	}
	
	public Point getPoint() {
		
		return new Point(getX(),getY());
		
	}
	
	public Point getTopLeftPoint() {
		return new Point(getX(),getY()+height);
	}
	
	public Point getTopRightPoint() {
		return new Point(getX()+width,getY()+height);
	}
	
	public Point getBottomLeftPoint() {
		return getPoint();
	}
	
	public Point getBottomRightPoint() {
		return new Point(getX()+width,getY());
	}
	
	
}
