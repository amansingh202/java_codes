public class StudentAnswerSheetTest {  
	public static void main(String[] args) {
		System.out.println("Test Case 1 - constructor, toString");
		char [] answers = {'a','e','b','b','?','b','c','d','a','e'};
		StudentAnswerSheet s1 = new StudentAnswerSheet("Matt", answers);
		boolean a1=s1.toString().equals("Matt a e b b ? b c d a e");
		System.out.println("valid args");
		System.out.println("Expected Output:"+"Matt a e b b ? b c d a e");
		System.out.println("Your Output    :"+s1.toString());
		answers[4]='c'; // verfies deep copy on answers argument

		StudentAnswerSheet s2 = new StudentAnswerSheet(null, answers);
		boolean a2=s2.toString().equals("Noname a e b b c b c d a e");
		System.out.println("invalid name");
		System.out.println("Expected Output:"+"Noname a e b b c b c d a e");
		System.out.println("Your Output    :"+s2.toString());

		StudentAnswerSheet s3 = new StudentAnswerSheet("Mary", null);
		boolean a3=s3.toString().equals("Mary ?");
		System.out.println("invalid answers");
		System.out.println("Expected Output:"+"Mary ?");
		System.out.println("Your Output    :"+s3.toString());

		StudentAnswerSheet s4 = new StudentAnswerSheet("Fred", new char[0]);
		boolean a4=s4.toString().equals("Fred ?");
		System.out.println("empty answers");
		System.out.println("Expected Output:"+"Fred ?");
		System.out.println("Your Output    :"+s4.toString());

		StudentAnswerSheet s5 = new StudentAnswerSheet(null, null);
		boolean a5=s5.toString().equals("Noname ?");
		System.out.println("empty answers");
		System.out.println("Expected Output:"+"Noname ?");
		System.out.println("Your Output    :"+s5.toString());
		if (a1 && a2 && a3 && a4 && a5) {
			System.out.println("PASSED");
		}
		else {
			System.out.println("FAILED");
		}

		System.out.println("Test Case 2 - setKey, getScore");
		StudentAnswerSheet s21 = new StudentAnswerSheet("Matt", answers);
		boolean a21=(s21.getScore()==Double.NEGATIVE_INFINITY);
		System.out.println("no key set yet");
		System.out.println("Expected Output:"+Double.NEGATIVE_INFINITY);
		System.out.println("Your Output    :"+s21.getScore());

		char [] emptyKey=new char[0];
		StudentAnswerSheet.setKey(emptyKey);
		boolean a22=(s21.getScore()==Double.NEGATIVE_INFINITY);
		System.out.println("empty key set, default wrong length");
		System.out.println("Expected Output:"+Double.NEGATIVE_INFINITY);
		System.out.println("Your Output    :"+s21.getScore());

		char [] wrongLengthKey=new char[] {'a', 'b'};
		StudentAnswerSheet.setKey(wrongLengthKey);
		boolean a23=(s21.getScore()==Double.NEGATIVE_INFINITY);
		System.out.println("answer length != key length");
		System.out.println("Expected Output:"+Double.NEGATIVE_INFINITY);
		System.out.println("Your Output    :"+s21.getScore());

		char [] goodKey=new char[] {'e','e','b','b','e','b','c','d','a','e'};
		StudentAnswerSheet.setKey(goodKey);
		boolean a24=(s21.getScore()==7.75);
		System.out.println("good key - average score");
		System.out.println("Expected Output:"+"7.75");
		System.out.println("Your Output    :"+s21.getScore());

		answers = new char[] {'e','e','b','b','e','b','c','d','a','e'};
		SudentAnswerSheet s22 = new StudentAnswerSheet("Mary", answers);
		boolean a25=(s22.getScore()==10);
		System.out.println("good key - perfect score");
		System.out.println("Expected Output:"+"10.0");
		System.out.println("Your Output    :"+s22.getScore());

		answers = new char[] {'f','f','f','f','f','f','f','f','f','f'};
		StudentAnswerSheet s23 = new StudentAnswerSheet("Mary", answers);
		boolean a26=(s23.getScore()==-2.5);
		System.out.println("good key - lowest possible score, all wrong");
		System.out.println("Expected Output:"+"-2.5");
		System.out.println("Your Output    :"+s23.getScore());

		answers = new char[] {'?','?','?','?','?','?','?','?','?','?'};
		StudentAnswerSheet s24 = new StudentAnswerSheet("Joan", answers);
		boolean a27=(s24.getScore()==0);
		System.out.println("good key - zero score, all missing");
		System.out.println("Expected Output:"+"0.0");
		System.out.println("Your Output    :"+s24.getScore());

		if (a21 && a22 && a23 && a24 && a25 && a26 && a27) {
			System.out.println("PASSED");
		}
		else {
			System.out.println("FAILED");
		}
	}
}