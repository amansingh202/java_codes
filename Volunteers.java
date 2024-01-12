import java.util.*;
import java.io.*;  
public class Volunteers {
	private static int [] data = new int[31]; 
	private static final int DAILY_GOAL=10;
	
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the full name of the input file: ");
		String inFileName=in.next();
		File inFile = new File(inFileName);
		Scanner fileScan = new Scanner(inFile);
		// ADD CODE HERE TO READ THE VOLUNTEER DATA INTO THE “DATA” ARRAY























		printMinAndCount();
		int [] daysBelowGoal = getDaysBelowGoal();
		System.out.println("Days Below Goal: " + Arrays.toString(daysBelowGoal));
	}
	
	public static void printMinAndCount() {
	// ADD CODE TO FIND THE NUMBER OF DAYS WITH MINIMUM VOLUNTEER COUNT
	// OUTPUT THE MINIMUM VOLUNTEER AMOUNT AND HOW MANY DAYS HAS THAT MINIMUM




















	


}


	public static int [] getDaysBelowGoal() {
	// ADD CODE TO FIND THE NUMBER OF DAYS BELOW GOAL AND RETURN THOSE DAY
	// NUMBERS IN AN ARRAY

























	}
}