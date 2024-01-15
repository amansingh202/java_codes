import java.util.*;
import java.io.*;
public class Hiring {
  public static void main( String [] args ) throws IOException{
	String [][] data = {{"93","89","63","88","60","73","80"},
						{"100","63","57","96","58","71","78"},
						{"81","91","99","78","57","87","86"}, 
						{"81","73","100","57","91","60","66"}, 
						{"86","89","64","81","69","93","92"}, 
						{"78","63","88","95","59","98","90"},
						{"55","74","68","55","69","94","80"}, 
						{"64","77","75","92","77","72","83"}, 
						{"95","58","92","62","77","64","59"}, 
						{"94","78","84","83","68","63","76"}};
/*
	// 5,000 applicants (rows), 7 columns per applicant
   	String [][] data = new String[5000][7]; 
	File f = new File("data.txt");
	Scanner in = new Scanner(f);
	for (int i=0; i<5000; i++) {
		String d=in.nextLine();
		data[i]=d.split(",");
	}
*/
	String [][] d1 = analyze_applicant1(data);
	System.out.println("analyze_applicant1");
	for (int i=0; i<d1.length; i++) {
		System.out.println(d1[i][0]+","+d1[i][1]+","+d1[i][2]+","+
							d1[i][3]+","+d1[i][4]+","+d1[i][5]+","+d1[i][6]);
	}
	String [][] d2 = analyze_applicant2(data);
	System.out.println("analyze_applicant2");
	for (int i=0; i<d2.length; i++) {
		System.out.println(d2[i][0]+","+d2[i][1]+","+d2[i][2]+","+
							d2[i][3]+","+d2[i][4]+","+d2[i][5]+","+d2[i][6]);
	}
	String [][] d3 = analyze_applicant3(data);	
	System.out.println("analyze_applicant3");
	for (int i=0; i<d3.length; i++) {
		System.out.println(d3[i][0]+","+d3[i][1]+","+d3[i][2]+","+
							d3[i][3]+","+d3[i][4]+","+d3[i][5]+","+d3[i][6]);
	}
	String [][] d4 = analyze_applicant4(data);	
	System.out.println("analyze_applicant4");
	for (int i=0; i<d4.length; i++) {
		System.out.println(d4[i][0]+","+d4[i][1]+","+d4[i][2]+","+
							d4[i][3]+","+d4[i][4]+","+d4[i][5]+","+d4[i][6]);
	}
	String [][] d_yours = your_analysis(data);	
	System.out.println("your_analysis");
	for (int i=0; i<d_yours.length; i++) {
		System.out.println(d_yours[i][0]+","+d_yours[i][1]+","+d_yours[i][2]+","+
							d_yours[i][3]+","+d_yours[i][4]+","+d_yours[i][5]+","+d_yours[i][6]);
	}
  }
  
  // analyze_applicant1 returns applicants that have an overall GPA above 80.
  public static String[][] analyze_applicant1 (String [][] d) {

  }
  
  // analyze_applicant2 returns applicants that have no grade below 65.
  public static String[][] analyze_applicant2 (String [][] d) {
  }

  // analyze_applicant3 returns applicants that have at least 4 grades above 85.
  public static String[][] analyze_applicant3 (String [][] d) {
  }  

  // analyze_applicant4 returns applicants that have a core CS courses average above 85.
  public static String[][] analyze_applicant4 (String [][] d) {
  }  

  // your_analysis
  public static String[][] your_analysis (String [][] d) {
  }
}