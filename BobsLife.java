public class BobsLife {
	private String location;
	private int hunger;
	private int fitness;
	private int dollars;
	private int time;
	private boolean isDead;
	private boolean inJail;
	
	private static final int DEFAULT_HUNGER=0, DEFAULT_FITNESS=4, DEFAULT_DOLLARS=5;
	private static final String HOME="home", WORK="work", GYM="gym", DEFAULT_LOCATION=HOME;
	private static final int MAX_HUNGER=6, MIN_DOLLARS=0, MIN_FITNESS=1;
	
	public BobsLife (String l, int h, int d, int f) {
		time = 0;
		isDead = false;
		inJail = false;
		setLocation(l);
		if (h>=0 && h<=MAX_HUNGER) {
			hunger=h;
		}
		else {
			hunger=DEFAULT_HUNGER;
		}
		if (f>=MIN_FITNESS) {
			fitness=f;
		}
		else {
			fitness=DEFAULT_FITNESS;
		}		
		if (d>=MIN_DOLLARS) {
			dollars=d;
		}
		else {
			dollars=DEFAULT_DOLLARS;
		}
	}
	
	public void move(String to) {
		if(isDead || inJail) {
			System.out.println(this);
		}
		else {		
			setLocation(to);
			time++;
			if (location.equals(HOME)) {
				atHome();
			}
			else if (location.equals(WORK)) {
				atWork();
			}
			else if (location.equals(GYM)) {
				atGym();
			}
		}
	}

	public String toString() {
		return "Time:"+time+" Location:"+location+" Hunger:"+hunger+" Dollars:"+dollars+" Fitness:"+fitness+" ("+getStatus()+")";
	}
	
	private void setLocation(String l) {
		if (l!=null && (l.equals(HOME) || l.equals(WORK) || l.equals(GYM))) {
			location = l;
		}
		else {
			location=DEFAULT_LOCATION;
		}
	}		

	private void atHome() {
		hunger = Math.max(0, hunger - 3);
		dollars -= 1;
		updateState();
	}

	private void atWork() {
		hunger+= 2;
		dollars += 3;
		fitness -= 1;
		updateState();
	}

	private void atGym() {
		hunger += 3;
		dollars -= 2;
		fitness += 2;
		updateState();		
	}
	
	private void updateState() {
		if (dollars < MIN_DOLLARS) {
			inJail = true;
		}
		if (hunger > MAX_HUNGER) {
			isDead = true;
		}
		if (fitness < MIN_FITNESS) {
			isDead = true;
		}
	}
}