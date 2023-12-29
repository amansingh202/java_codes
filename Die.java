public class Die {
	private int side;
	private static final int SIDE_COUNT=6, DEFAULT_SIDE=1;

	public Die() {
		setSide(DEFAULT_SIDE);
	}

	public Die(int newSide) {
		setSide(newSide);
	}

	public int getSide() {
		return side;
	}

	public void setSide(int newSide) {     // OK not to verify argument is correct for now
		side=newSide;
	}

	public void roll() {
		side = (int)(Math.random()*SIDE_COUNT+1);
	}

	public String toString( ) {
	    return "Die=" + side;
	  }
}