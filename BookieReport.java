import java.text.NumberFormat; 
import java.util.*;	
import java.io.*;
public class BookieReport {
	private double balance;
	private String report;
	private static NumberFormat formatter = NumberFormat.getCurrencyInstance();
	
	public BookieReport(){
		balance=0;
		report="";
	}

	public void readData(String fileName) throws IOException { 
	// files all assumed to be OK and named ????.txt  any length ?????
		File input = new File(fileName);
		Scanner in = new Scanner(input);
		String player = fileName.substring(0, fileName.length()-4);
/*
0Week	1HomeTeam	2HomeSpread	3HomeOdds	4AwayTeam	5AwaySpread	6AwayOdds	
7HomeScore	8AwayScore	9TeamBetOn	10AmountBet
*/	



	}
	
	public double getBalance() { return balance; }
	
	public String getReport() { return report; }	
}