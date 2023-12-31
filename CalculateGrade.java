import java.util.Scanner;

public class CalculateGrade
{
	public static void main(String[] args)
	{
		int quiz1, quiz2, midterm, finalExam, labGrades;
		double grade;		

		Scanner input = new Scanner(System.in);
		System.out.print("Enter Quiz1 Grade: ");
		quiz1 = input.nextInt();

		System.out.print("Enter Quiz2 Grade: ");
		quiz2 = input.nextInt();

		System.out.print("Enter Midterm Grade: ");
		midterm = input.nextInt();

		System.out.print("Enter Final Exam Grade: ");
		finalExam = input.nextInt();

		System.out.print("Enter Lab Grades Grade: ");
		labGrades = input.nextInt();

		grade = 0.1*quiz1+0.15*quiz2+0.25*midterm+0.3*finalExam+0.2*labGrades;
		System.out.println("Grade: " + grade);
	}
}
