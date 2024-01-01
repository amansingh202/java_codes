public class ParticleTest {  
	public static void main(String[] args) {
		System.out.println("Test Case 1a - getTable w/ valid arguments");
		Particle p1 = new Particle(-.015, .005, -.02, .1);	
		System.out.println("EXPECTED RESULT:location(t) = -0.015t^4+0.005t^3+-0.02t^2+0.1t");
		System.out.println("YOUR RESULT    :"+p1.toString());
		System.out.println("PASSED="+p1.toString().equals("location(t) = -0.015t^4+0.005t^3+-0.02t^2+0.1t")+"\n");
		p1.setA(-1);
		p1.setB(3);
		p1.setC(.0002);
		p1.setD(5);
		System.out.println("Test Case 1b - constructor, set* methods, toString()");
		System.out.println("EXPECTED RESULT:location(t) = -1.0t^4+3.0t^3+2.0E-4t^2+5.0t");
		System.out.println("YOUR RESULT    :"+p1.toString());
		System.out.println("PASSED="+p1.toString().equals("location(t) = -1.0t^4+3.0t^3+2.0E-4t^2+5.0t")+"\n");
	
		System.out.println("Test Case 2a - getTable w/ valid arguments");
		Particle p2a = new Particle(-.015, .005, -.02, .1);	
		System.out.println("EXPECTED RESULT:2.0;-0.080;-0.500\n2.5;-0.383;-0.944\n3.0;-0.960;-1.605\n3.5;-1.932;-2.529\n4.0;-3.440;-3.760;More than 1 unit movement\n4.5;-5.650;-5.344;More than 1 unit movement\n5.0;-8.750;-7.325;More than 1 unit movement\n");
		System.out.println("YOUR RESULT    :"+p2a.getTable(2,5,.5));
		System.out.println("PASSED="+p2a.getTable(2,5,.5).equals("2.0;-0.080;-0.500\n2.5;-0.383;-0.944\n3.0;-0.960;-1.605\n3.5;-1.932;-2.529\n4.0;-3.440;-3.760;More than 1 unit movement\n4.5;-5.650;-5.344;More than 1 unit movement\n5.0;-8.750;-7.325;More than 1 unit movement\n")+"\n");
		System.out.println("Test Case 2b - getTable w/ valid arguments");
		Particle p2b = new Particle(-.015, .005, -.02, .1);	
		System.out.println("EXPECTED RESULT:10.0;-146.000;-58.900\n10.2;-158.120;-62.520;More than 1 unit movement\n10.399999999999999;-170.978;-66.285;More than 1 unit movement\n10.599999999999998;-184.604;-70.200;More than 1 unit movement\n10.799999999999997;-199.028;-74.265;More than 1 unit movement\n10.999999999999996;-214.280;-78.485;More than 1 unit movement\n");
		System.out.println("YOUR RESULT    :"+p2b.getTable(10,11,.2));
		System.out.println("PASSED="+p2b.getTable(10,11,.2).equals("10.0;-146.000;-58.900\n10.2;-158.120;-62.520;More than 1 unit movement\n10.399999999999999;-170.978;-66.285;More than 1 unit movement\n10.599999999999998;-184.604;-70.200;More than 1 unit movement\n10.799999999999997;-199.028;-74.265;More than 1 unit movement\n10.999999999999996;-214.280;-78.485;More than 1 unit movement\n")+"\n");

		System.out.println("Test Case 3a - getTable w/ valid arguments");
		Particle p3 = new Particle(-.015, .005, -.02, .1);
		System.out.println("EXPECTED RESULT:getTable invalid arguments");
		System.out.println("YOUR RESULT    :"+p3.getTable(5,2,.5));
		System.out.println("PASSED="+p3.getTable(5,2,.5).equals("getTable invalid arguments")+"\n");

		System.out.println("Test Case 3b - getTable w/ valid arguments");
		System.out.println("EXPECTED RESULT:getTable invalid arguments");
		System.out.println("YOUR RESULT    :"+p3.getTable(10,11,-.2));
		System.out.println("PASSED="+p3.getTable(10,11,-.2).equals("getTable invalid arguments")+"\n");
	}
}