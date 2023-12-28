import java.text.*;
public class ExpDecay {
	//static constants
	private static final double DEFAULT_LAMBDA=.05, DEFAULT_N0=100;
	private static final int SHORT_PERIOD = 5, MIDDLE_PERIOD = 25, LONG_PERIOD = 50;
	private static final DecimalFormat NUMBER_FORMAT = new DecimalFormat("##0.000000");
	
	//instance variables
	double lambda,			//decay constant
			n0;				// initial quantity

	//default constructor
	public ExpDecay(){
		setLambda(DEFAULT_LAMBDA);           // good practice to call "sets" here
		setN0(DEFAULT_N0);
	}
	//non-default constructor
	public ExpDecay(double newLambda, double newN0) {
		setLambda(newLambda);	 // good practice to call "sets" here
		setN0(newN0);
	}
	
	//accessor methods
	public double getLambda() {
		return lambda;
	}
	public double getN0() {
		return n0;
	}

	//mutator methods
	public void setLambda(double newLambda) {		// no error checking needed yet
		lambda = newLambda;
	}
	
	public void setN0(double newN0) {		// no error checking needed yet
		n0 = newN0;
	}

	public double futureQuantity(int time) {
		return n0*(Math.pow(Math.E, (-1*lambda*time)));
	}
	
	public String toString() {
		return "Initial Quantity: " + NUMBER_FORMAT.format(n0) +
		       "  Lambda: " + NUMBER_FORMAT.format(lambda);
	}

	public String getTable() {
		String temp=NUMBER_FORMAT.format(lambda)+";"+NUMBER_FORMAT.format(n0)+";"+SHORT_PERIOD+";"+NUMBER_FORMAT.format(futureQuantity(SHORT_PERIOD))+"\n";
		temp=temp+NUMBER_FORMAT.format(lambda)+";"+NUMBER_FORMAT.format(n0)+";"+MIDDLE_PERIOD+";"+NUMBER_FORMAT.format(futureQuantity(MIDDLE_PERIOD))+"\n";
		temp=temp+NUMBER_FORMAT.format(lambda)+";"+NUMBER_FORMAT.format(n0)+";"+LONG_PERIOD+";"+NUMBER_FORMAT.format(futureQuantity(LONG_PERIOD))+"\n";
		return temp;
	}
}