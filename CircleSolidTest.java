public class CircleSolidTest {  
	public static void main(String[] args) {
		System.out.println("Test Case 1 - Cylinder constructors");
		// create and output a default Cylinder
		System.out.print("default Cylinder testing ");
		Cylinder cylinder1 = new Cylinder();
		boolean a1=cylinder1.toString().equals("CircleSolid: Radius=1.0 Cylinder: Height=1.0");
		if (a1) System.out.println("PASSED");
		else System.out.println("FAILED "+ cylinder1);

		System.out.print("nondefault Cylinder args OK testing ");
		Cylinder cylinder2 = new Cylinder(3, 5);
		boolean a2=cylinder2.toString().equals("CircleSolid: Radius=3.0 Cylinder: Height=5.0");
		if (a2) System.out.println("PASSED");
		else System.out.println("FAILED "+ cylinder2);

		System.out.print("nondefault Cylinder args NOT OK testing ");
		Cylinder cylinder3 = new Cylinder(-1, -1);
		boolean a3=cylinder3.toString().equals("CircleSolid: Radius=1.0 Cylinder: Height=1.0");
		if (a3) System.out.println("PASSED");
		else System.out.println("FAILED "+ cylinder3);

		System.out.println("Test Case 2 - Sphere constructors");
		// create and output a default Cylinder
		System.out.print("default Sphere testing ");
		Sphere sphere1 = new Sphere();
		boolean s1=sphere1.toString().equals("CircleSolid: Radius=1.0 Sphere");
		if (s1) System.out.println("PASSED");
		else System.out.println("FAILED "+ sphere1);

		System.out.print("nondefault Sphere args OK testing ");
		Sphere sphere2 = new Sphere(3);
		boolean s2=sphere2.toString().equals("CircleSolid: Radius=3.0 Sphere");
		if (s2) System.out.println("PASSED");
		else System.out.println("FAILED "+ sphere2);

		System.out.print("nondefault Sphere args NOT OK testing ");
		Sphere sphere3 = new Sphere(-1);
		boolean s3=sphere3.toString().equals("CircleSolid: Radius=1.0 Sphere");
		if (s3) System.out.println("PASSED");
		else System.out.println("FAILED "+ sphere3);

		System.out.println("Test Case 3 – polymorphism");
		CircleSolid [] data = new CircleSolid[4];
		data[0] = new Sphere();
		data[1] = new Sphere(3);
		data[2] = new Cylinder();
		data[3] = new Cylinder(3,5);

		System.out.print("polymorphism testing ");
		boolean p1=Math.abs(data[0].getVolume()-4.1887902047863905)<.00000001;
		boolean p2=Math.abs(data[1].getVolume()-113.09733552923254)<.00000001;
		boolean p3=Math.abs(data[2].getVolume()-3.141592653589793)<.00000001;
		boolean p4=Math.abs(data[3].getVolume()-141.3716694115407)<.00000001;

		if (p1 && p2) System.out.println("Sphere PASSED");
		else System.out.println("Sphere FAILED "+ data[0].getVolume() + " " +data[1].getVolume());

		if (p3 && p4) System.out.println("Cylinder PASSED");
		else System.out.println("Cylinder FAILED "+ data[2].getVolume() + " " +data[3].getVolume());
	}
}