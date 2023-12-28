public class ExpDecayTest1 {  
  public static void main(String[] args) {

    System.out.print("Test Case 1 ");
    ExpDecay value1 = new ExpDecay(-.01,1);
    boolean a1=value1.toString().equals("Initial Quantity: 1.000000  Lambda: 0.050000");
    value1.setN0(-1.5);
    boolean a2=value1.toString().equals("Initial Quantity: 100.000000  Lambda: 0.050000");
    if (a1 && a2) {
		System.out.println("PASSED");
    }
    else {
		System.out.println("FAILED");
    }

    System.out.print("Test Case 2 ");
    ExpDecay value2 = new ExpDecay(0.005,-1.5);
    boolean a3=value2.toString().equals("Initial Quantity: 100.000000  Lambda: 0.005000");
    value2.setLambda(-.001);
    boolean a4=value2.toString().equals("Initial Quantity: 100.000000  Lambda: 0.050000");
    if (a3 && a4) {
		System.out.println("PASSED");
    }
    else {
		System.out.println("FAILED");
    }

    System.out.print("Test Case 3 ");
    ExpDecay value3 = new ExpDecay(-0.01,-1.5);
    boolean a5=value3.toString().equals("Initial Quantity: 100.000000  Lambda: 0.050000");
    value3.setLambda(.001);
    value3.setN0(1.25);
    boolean a6=value3.toString().equals("Initial Quantity: 1.250000  Lambda: 0.001000");
    if (a5 && a6) {
		System.out.println("PASSED");
    }
    else {
		System.out.println("FAILED");
    }
  }
}