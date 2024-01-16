	public class StudentAnswerSheet {
	private String name;
	private char [] answers;

	private static final char BLANK='?';
	private static final String DEFAULT_NAME="Noname";
	private static final double CORRECT_POINTS=1., BLANK_POINTS=0., WRONG_POINTS=-.25;

	private static char [] key;

	public static void setKey(char [] answerKey) {
		if (answerKey==null || answerKey.length==0) {
			key=new char[] {'?'};
		}
		else {
			key=new char[answerKey.length];
			for (int i=0;i<answerKey.length;i++) {
				key[i]=answerKey[i];
			}			
		}
	}

	public StudentAnswerSheet  (String n, char [] a) {
		if (n==null) {
			name=DEFAULT_NAME;
		}
		else {
			name=n;
		}			
		
		if (a!=null && a.length>0) {
			answers=new char[a.length];
			for (int i=0;i<a.length;i++) {
				answers[i]=a[i];
			}
		}
		else {
			answers = new char[] {'?'};
		}
	}

    public String getName() { return name; }
                  
    public double getScore ()  {   
		double total=0;
		if (key!=null && key.length == answers.length) {
			for (int i=0;i<key.length;i++) {
				if (answers[i]==BLANK) {
					total+=BLANK_POINTS;
				}
				else if (answers[i]==key[i]) {
					total+=CORRECT_POINTS;
				}
				else {
					total+=WRONG_POINTS;
				}
			}
		}
		else {
			total=Double.NEGATIVE_INFINITY;
		}
		return total;
	}

	public String toString () {
		String temp = name;
		for (int i=0; i<answers.length;i++) {
			temp = temp + ' ' + answers[i];
		}
		return temp;
	}
}