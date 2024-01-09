import java.util.*;  
public class Coinflips {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String data = in.next();
		char [] d = new char[data.length()];
		for (int i=0; i<data.length(); i++) {
			d[i]=data.charAt(i);
		}
		System.out.println(longestHeadRun(d));
	}
	public static int longestHeadRun(char [] data){

   }
}
