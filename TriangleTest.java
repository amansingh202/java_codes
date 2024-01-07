public class TriangleTest {  
	public static void main(String[] args) {
		
		System.out.println("Test Case 1a - constructors, toString");
		Triangle t1 = new Triangle();
		System.out.println("EXPECTED RESULT:(0.0, 0.0) (0.0, 0.0) (0.0, 0.0)");
		System.out.println("YOUR RESULT    :"+t1.toString());
		System.out.println("PASSED="+t1.toString().equals("(0.0, 0.0) (0.0, 0.0) (0.0, 0.0)")+"\n");
		
		System.out.println("Test Case 1b - constructors, toString");
		Triangle t2 = new Triangle(new Point(0.,0.), new Point(3.,0.), new Point(0.,4.));
		System.out.println("EXPECTED RESULT:(0.0, 0.0) (3.0, 0.0) (0.0, 4.0)");
		System.out.println("YOUR RESULT    :"+t2.toString());
		System.out.println("PASSED="+t2.toString().equals("(0.0, 0.0) (3.0, 0.0) (0.0, 4.0)")+"\n");

		System.out.println("Test Case 1c - constructors, toString");
		Point x = new Point(-1., 0.);
		Point y = new Point(1., 0.);
		Point z = new Point(0., 2.);
		Triangle t3 = new Triangle(x,y,z);
		System.out.println("EXPECTED RESULT:(-1.0, 0.0) (1.0, 0.0) (0.0, 2.0)");
		System.out.println("YOUR RESULT    :"+t3.toString());
		System.out.println("PASSED="+t3.toString().equals("(-1.0, 0.0) (1.0, 0.0) (0.0, 2.0)")+"\n");
	
		System.out.println("Test Case 1d - constructors, toString");
		x.setX(-2);
		System.out.println("EXPECTED RESULT:(-1.0, 0.0) (1.0, 0.0) (0.0, 2.0)");
		System.out.println("YOUR RESULT    :"+t3.toString());
		System.out.println("PASSED="+t3.toString().equals("(-1.0, 0.0) (1.0, 0.0) (0.0, 2.0)")+"\n");
		
		System.out.println("Test Case 1e - constructors, toString");
		t3.setP1(x);
		System.out.println("EXPECTED RESULT:(-2.0, 0.0) (1.0, 0.0) (0.0, 2.0)");
		System.out.println("YOUR RESULT    :"+t3.toString());
		System.out.println("PASSED="+t3.toString().equals("(-2.0, 0.0) (1.0, 0.0) (0.0, 2.0)")+"\n");
		
		System.out.println("Test Case 3a - isRightTriangle");
		Triangle t3a = new Triangle();
		System.out.println("EXPECTED RESULT:false");
		System.out.println("YOUR RESULT    :"+t3a.isRightTriangle());
		System.out.println("PASSED="+(t3a.isRightTriangle()==false)+"\n");
		
		System.out.println("Test Case 3b - isRightTriangle");
		Triangle t3b = new Triangle(new Point(0.,0.), new Point(3.,0.), new Point(0.,4.));
		System.out.println("EXPECTED RESULT:true");
		System.out.println("YOUR RESULT    :"+t3b.isRightTriangle());
		System.out.println("PASSED="+(t3b.isRightTriangle()==true)+"\n");

		System.out.println("Test Case 3c - isRightTriangle");		
		Triangle t3c = new Triangle( new Point(-1., 0.),new Point(1., 0.),new Point(0., 2.));
		System.out.println("EXPECTED RESULT:false");
		System.out.println("YOUR RESULT    :"+t3c.isRightTriangle());
		System.out.println("PASSED="+(t3c.isRightTriangle()==false)+"\n");

		System.out.println("Test Case 3d - isRightTriangle");		
		Triangle t3d = new Triangle( new Point(-1., 0.),new Point(0., 0.),new Point(1., 0.));
		System.out.println("EXPECTED RESULT:false");
		System.out.println("YOUR RESULT    :"+t3d.isRightTriangle());
		System.out.println("PASSED="+(t3d.isRightTriangle()==false)+"\n");

		System.out.println("Test Case 3e - isRightTriangle");
		Triangle t3e = new Triangle( new Point(-5., 0.),new Point(0., 0.),new Point(0., -12.));
		System.out.println("EXPECTED RESULT:true");
		System.out.println("YOUR RESULT    :"+t3e.isRightTriangle());
		System.out.println("PASSED="+(t3e.isRightTriangle()==true)+"\n");
	}
}