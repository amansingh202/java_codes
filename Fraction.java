public class Fraction {
	private int numerator, denominator; 
	private static final int DEFAULT_DENOMINATOR=1;
	public Fraction(int num, int den) {
		setNumerator(num); setDenominator(den);
	}
	public void setNumerator(int num) { 
		numerator = num; 
		fixNegative(); 
	}
	public int getNumerator() { 
		return numerator; 
	}
	public void setDenominator(int den) {
		if (den==0) {
			denominator = DEFAULT_DENOMINATOR;
		}			
		else {
			denominator = den;
		}
		fixNegative();
	}
	public int getDenominator() { 
		return denominator; 
	}
	private void fixNegative() {
		if (denominator<0 && numerator<0) {
			denominator=Math.abs(denominator);
			numerator=Math.abs(numerator);
		}
		else if (denominator<0 && numerator>0) {
			denominator=Math.abs(denominator);
			numerator=-1*numerator;
		}
	}
	public Fraction add(Fraction arg) {
		Fraction tempFraction; 
		int tempN, tempD;
		tempN=numerator*arg.getDenominator()+arg.getNumerator()*denominator;
		tempD = denominator * arg.getDenominator();
		tempFraction = new Fraction(tempN, tempD);
		return tempFraction;
	}
	public Fraction subt(Fraction arg) {
		Fraction arg1 = arg.mult(new Fraction(-1, 1));
		return this.add(arg1);
	}	
	public Fraction mult(Fraction arg) {
		Fraction tempFraction = new Fraction(numerator*arg.getNumerator(), denominator*arg.getDenominator());
		tempFraction.fixNegative();
		return tempFraction;
	}
	public Fraction div(Fraction arg) {
		Fraction arg1 =  new Fraction(arg.getDenominator(), arg.getNumerator());
		arg1.fixNegative();
		Fraction tempFraction = new Fraction(numerator*arg1.getNumerator(), denominator*arg1.getDenominator());
		tempFraction.fixNegative();
		return tempFraction;
	}	
	
	private int GCD(int num1, int num2) {
		int gcd=1;
	    for(int i = 2; i <= num1 && i <= num2; i++)  {
            if(num1%i==0 && num2%i==0) {
                gcd = i;
			}
        }
		return gcd;
	}

	public void reduce(){
		int gcd=GCD(Math.abs(numerator), Math.abs(denominator));
		setNumerator(numerator/gcd); 
		setDenominator(denominator/gcd); 
	}
	
	public boolean equals(Fraction that) {
		this.reduce();
		that.reduce();
		return this.numerator==that.numerator && this.denominator==that.denominator;
	}
	
	public String toString() { 
		return (numerator + "/" + denominator); 
	}
}