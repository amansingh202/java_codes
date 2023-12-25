import java.text.*;
public class SubwayMath {
	// instance variables
	private double bonus, ride;
	
	// class constants
	private static final double DEFAULT_BONUS=.15, DEFAULT_RIDE=2.0;
	private static final NumberFormat DOLLAR_FORMAT = NumberFormat.getCurrencyInstance();
	private static final DecimalFormat PERCENT_FORMAT = new DecimalFormat("##0.0%");

	//default constructor
	public SubwayMath() {
		setBonus(DEFAULT_BONUS);	// good practice to call "sets" here
		setRideCost(DEFAULT_RIDE);
	}
	
	//non-default constructor
	public SubwayMath(double newBonus, double newRide) {
		setBonus(newBonus);			// good practice to call "sets" here
		setRideCost(newRide);
	}
	
	//accessor methods
	public double getBonus() {
		return bonus;
	}
	public double getRideCost() {
		return ride;
	}
	
	//mutator methods
	public void setBonus(double newBonus) {
		bonus = newBonus;	// you do NOT need to do any data validation, the input interface on the vending machine does this
	}
	public void setRideCost(double newRide) {
		ride = newRide;		// you do NOT need to do any data validation, the input interface on the vending machine does this
	}

	public String toString() {
		return "Bonus: " + PERCENT_FORMAT.format(bonus) +
		       " Ride Cost: " + DOLLAR_FORMAT.format(ride);
	}
	
	public double optimalAmount(int count) {
		return Math.ceil(((count*ride) / (1 + bonus)) * 100.0) / 100.0;
	}
	
	public String optimalAmount(int count1, int count2) {
		double amt1=Math.ceil(((count1*ride) / (1 + bonus)) * 100.0) / 100.0;
		double amt2=Math.ceil(((count2*ride) / (1 + bonus)) * 100.0) / 100.0;
		return DOLLAR_FORMAT.format(amt1)+","+DOLLAR_FORMAT.format(amt2);
	}	
}