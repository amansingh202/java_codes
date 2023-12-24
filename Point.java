public class Point {
	private double x, y;
	private static final double DEFAULT_COORDINATE=0;

	public Point() {
		setX(DEFAULT_COORDINATE);
		setY(DEFAULT_COORDINATE);	
	}
	public Point(double newX, double newY) {
		setX(newX);
		setY(newY);
	}
	
	public double getX() { return x; }
	public double getY() { return y; }
	
	public void setX(double newX) { x=newX; }  // note no validation is needed
	public void setY(double newY) { y=newY; }
	
	public double distanceToOrigin() { return Math.sqrt(x*x + y*y); }	
	
	public double distanceTo(Point otherPoint) { 		// local scope parameter
		double otherX=otherPoint.getX();   // local scope variables
		double otherY=otherPoint.getY();
		return Math.sqrt(Math.pow(x-otherX,2) + Math.pow(y-otherY,2));   // x and y, class instance scope
	}

	public String toString() { return "("+x+", "+y+")"; }	
}