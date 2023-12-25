public class Triangle {
	private double side1, side2, side3;
	private static final double DEFAULT_SIDE=1;

	public Triangle() {
		setSide1(DEFAULT_SIDE);
		setSide2(DEFAULT_SIDE);
		setSide3(DEFAULT_SIDE);
	}
	public Triangle(double s1, double s2, double s3) {
		setSide1(s1);
		setSide2(s2);
		setSide3(s3);
	}
	
	public double getSide1() { return side1; }
	public double getSide2() { return side2; }
	public double getSide3() { return side3; }

	public void setSide1(double s1) {
		if (s1>0) {
			side1=s1;
		}
		else {
			side1=DEFAULT_SIDE;
		}
	}
			
	public void setSide2(double s2) {
		if (s2>0) {
			side2=s2;
		}
		else {
			side2=DEFAULT_SIDE;
		}
	}

	public void setSide3(double s3) {
		if (s3>0) {
			side3=s3;
		}
		else {
			side3=DEFAULT_SIDE;
		}
	}	
	
	public String toString() { return "s1="+side1+" s2="+side2+" s3="+side3; }	
}
