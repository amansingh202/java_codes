import java.text.*;
public class InvestCalc {
	//instance variables
	private double rate, //interest rate in decimal
				   principal;	//amount of investment
	private static final int SHORT_TERM = 5, MIDDLE_TERM = 10, LONG_TERM = 20;
	private static final double DEFAULT_INTEREST=0, DEFAULT_PRINCIPAL=0;
	private static final NumberFormat DOLLAR_FORMAT = NumberFormat.getCurrencyInstance();
	private static final DecimalFormat PERCENT_FORMAT = new DecimalFormat("##0.00%");
		
	//default constructor
	public InvestCalc() {
		setRate(DEFAULT_INTEREST);		// good practice to call "sets" here
		setPrincipal(DEFAULT_PRINCIPAL);
	}
	
	//non-default constructor
	public InvestCalc(double newRate, double newPrincipal) 	{
		setRate(newRate);	 // good practice to call "sets" here
		setPrincipal(newPrincipal);
	}
	
	//accessor methods
	public double getRate() {
		return rate;
	}
	public double getPrincipal() {
		return principal;
	}
	
	//mutator methods
	public void setRate(double newRate) {
		rate = newRate;		// in the future we will add error checking here
	}
	public void setPrincipal(double newPrincipal) {
		principal = newPrincipal;	// in the future we will add error checking here
	}
	
	public double futureValue(int year) {
		return principal*(Math.pow(1+rate, year));
	}
	
	public String toString(){
		return "Principal: " + DOLLAR_FORMAT.format(principal) +
		       " Interest rate: " + PERCENT_FORMAT.format(rate);
	}
	
	public String getTable() {
		String temp=DOLLAR_FORMAT.format(principal)+";"+PERCENT_FORMAT.format(rate)+";"+SHORT_TERM+";"+DOLLAR_FORMAT.format(futureValue(SHORT_TERM))+"\n";
		temp=temp+DOLLAR_FORMAT.format(principal)+";"+PERCENT_FORMAT.format(rate)+";"+MIDDLE_TERM+";"+DOLLAR_FORMAT.format(futureValue(MIDDLE_TERM))+"\n";
		temp=temp+DOLLAR_FORMAT.format(principal)+";"+PERCENT_FORMAT.format(rate)+";"+LONG_TERM+";"+DOLLAR_FORMAT.format(futureValue(LONG_TERM))+"\n";
		return temp;
	}
	
}