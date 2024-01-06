public class DieTest {  
	public static void main(String[] args) {
		Die a = new Die();
		Die b = new Die();
		System.out.print("Test Case 1 - 0 rolls ");
		String out1=Die.getAverageRoll();
		if (out1.equals("rolls=0")) {
			System.out.println("PASSED");
		}
		else {
			System.out.println("FAILED");
		}	
		System.out.print("Test Case 2 - 100000 more rolls ");		
		for (int i=0; i<100000; i++) {
			a.roll();
		}
		String out2=Die.getAverageRoll();
		if (out2.equals("rolls=100000 avg=3.5")) {
			System.out.println("PASSED");
		}
		else {
			System.out.println("FAILED");
		}	
		System.out.print("Test Case 3 - 200000 more rolls ");		
		for (int i=0; i<200000; i++) {
			b.roll();
		}
		String out3=Die.getAverageRoll();
		if (out3.equals("rolls=300000 avg=3.5")) {
			System.out.println("PASSED");
		}
		else {
			System.out.println("FAILED");
		}
	}
}