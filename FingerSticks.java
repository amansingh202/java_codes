import java.util.Scanner;
public class FingerSticks {
	public static void main(String[] args) {
		int [] human={1,1}, computer={1,1};
		Scanner input = new Scanner(System.in);

		if (Math.random()>.5) {	
			System.out.println("Computer went first");
			System.out.println(computerMove(human, computer));
			System.out.println("humanLeft="+human[0]+" humanRight="+human[1]+" computerLeft="+computer[0]+" computerRight="+computer[1]);			
		}
		
		while ( !gameOver(human, computer)  ) {
			System.out.print("Human turn, which hand of your's (R or L)? ");
			String humanHand = input.next();
			System.out.print("Human turn, which hand of computer's (R or L)? ");
			String computerHand = input.next();
			
			if (humanHand.equals("L")) {
				if (computerHand.equals("L")) {
					computer[0]+=human[0];
					if (computer[0]==5) {
						computer[0]=-1;
					}
					else {
						computer[0]=computer[0]%5;
					}
				}
				else {
					computer[1]+=human[0];
					if (computer[1]==5) {
						computer[1]=-1;
					}
					else {
						computer[1]=computer[1]%5;
					}					
				}
			}
			else {
				if (computerHand.equals("L")) {
					computer[0]+=human[1];
					if (computer[0]==5) {
						computer[0]=-1;
					}
					else {
						computer[0]=computer[0]%5;
					}
				}
				else {
					computer[1]+=human[1];
					if (computer[1]==5) {
						computer[1]=-1;
					}
					else {
						computer[1]=computer[1]%5;
					}					
				}
			}
			System.out.println("humanLeft="+human[0]+" humanRight="+human[1]+" computerLeft="+computer[0]+" computerRight="+computer[1]);			
			if (!gameOver(human, computer) ) {
				System.out.println(computerMove(human, computer));
				System.out.println("humanLeft="+human[0]+" humanRight="+human[1]+" computerLeft="+computer[0]+" computerRight="+computer[1]);			
			}
		}
	}
	
	public static boolean gameOver(int [] h, int [] c) {
		if ( (h[0]==-1 && h[1]==-1) || (c[0]==-1 && c[1]==-1)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static String computerMove(int [] h, int [] c) {
	  // add your code here
	  
	}
}
