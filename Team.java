public class Team {
	private int wins, losses;
	private String name;
	private static final String DEFAULT_TEAM_NAME="Default Team";
	private static final int DEFAULT_WINS_LOSSES=0;
	public Team () {
		setWinsLosses(DEFAULT_WINS_LOSSES,DEFAULT_WINS_LOSSES); setName(DEFAULT_TEAM_NAME);
	}
	public Team (int w, int l, String n) {
		setWinsLosses(w,l); setName(n);
	}

	public void setWinsLosses (int w, int l) {
		setWins(w); setLosses(l);
	}
	private void setWins(int w) {
		if (w>=0) {
			wins=w;
		}
		else {
			wins=DEFAULT_WINS_LOSSES;
		}
	}
	private void setLosses(int l) {
		if (l>=0) {
			losses=l;
		}
		else {
			losses=DEFAULT_WINS_LOSSES;
		}
	}
	private void setName(String n) {
		if (n==null) {
			name=DEFAULT_TEAM_NAME;
		}
		else {
			name=n;
		}
	}
	
	public int getWins() { return wins;}
	public int getlosses() { return losses;}
	public String getName() { return name;}
	public double getWinningPercentage() {
		double winpct=0;
		if (wins+losses>0) {
			winpct=(double)wins/(wins+losses);
		}
		return winpct;
	}

	public String toString() {
		String temp=name;
		double winpct=getWinningPercentage();
		if (Math.abs(winpct-.5)<.001) {
			temp=" 500 Team";
		}
		else if (winpct>.5) {
			temp=" Over 500 Team";
		}
		else {
			temp=" Under 500 Team";
		}
		return " Wins="+wins+" Losses="+losses+" PCT="+winpct+temp;
	}
}