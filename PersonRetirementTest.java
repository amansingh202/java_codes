public class PersonRetirementTest {  
	public static void main(String[] args) {
		System.out.println("Test Case 1 - default constructor, getID, getBirthYear, getStartYear, toString");
		PersonRetirement employee1 = new PersonRetirement();
		System.out.println("EXPECTED RESULT:A0001920");
		System.out.println("YOUR RESULT    :"+employee1.getID());
		System.out.println("EXPECTED RESULT:1900");
		System.out.println("YOUR RESULT    :"+employee1.getBirthYear());
		System.out.println("EXPECTED RESULT:1920");
		System.out.println("YOUR RESULT    :"+employee1.getStartYear());
		System.out.println("PASSED="+(employee1.toString().equals("ID:A0001920 BirthYear:1900"))+"\n");
	
/*	
		System.out.println("Test Case 2 - non-default constructor, getID, getBirthYear, getStartYear, toString");
		PersonRetirement employee2 = new PersonRetirement("A1232017", 2000);
		System.out.println("EXPECTED RESULT:A1232017");
		System.out.println("YOUR RESULT    :"+employee2.getID());
		System.out.println("EXPECTED RESULT:2000");
		System.out.println("YOUR RESULT    :"+employee2.getBirthYear());
		System.out.println("EXPECTED RESULT:2017");
		System.out.println("YOUR RESULT    :"+employee2.getStartYear());
		System.out.println("PASSED="+(employee2.toString().equals("ID:A1232017 BirthYear:2000"))+"\n");
*/
/*
		System.out.println("Test Case 3 - default constructor, yearsToRetirement");
		PersonRetirement employee3 = new PersonRetirement();
		System.out.println("EXPECTED RESULT:-68.5");
		System.out.println("YOUR RESULT    :"+employee3.yearsToRetirement());
		System.out.println("PASSED="+(employee3.yearsToRetirement()==-68.5)+"\n");
*/
/*
		System.out.println("Test Case 4 - young employee, yearsToRetirement");
		PersonRetirement employee4 = new PersonRetirement("A1232017", 2000);
		System.out.println("EXPECTED RESULT:30.0");
		System.out.println("YOUR RESULT    :"+employee4.yearsToRetirement());
		System.out.println("PASSED="+(employee4.yearsToRetirement()==30)+"\n");
*/
/*
		System.out.println("Test Case 5 - just retired, yearsToRetirement");
		PersonRetirement employee5= new PersonRetirement("A1111990", 1966);
		System.out.println("EXPECTED RESULT:-0.5");
		System.out.println("YOUR RESULT    :"+employee5.yearsToRetirement());
		System.out.println("PASSED="+(employee5.yearsToRetirement()==-.5)+"\n");
*/
/*
		System.out.println("Test Case 6 - retiring this year, yearsToRetirement");
		PersonRetirement employee6= new PersonRetirement("A1111990", 1967);
		System.out.println("EXPECTED RESULT:0.0");
		System.out.println("YOUR RESULT    :"+employee6.yearsToRetirement());
		System.out.println("PASSED="+(employee6.yearsToRetirement()==0)+"\n");
*/
	}
}