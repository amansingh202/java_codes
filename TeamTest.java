public class TeamTest {  
	public static void main(String[] args) {
		System.out.println("Test Case 1a - default constructor");
		Team a = new Team();
		Team b = new Team();
		System.out.println("Team A:"+a.getName());
		System.out.println("Team B:"+b.getName());
		System.out.println("PASSED="+!a.getName().equals(b.getName())+"\n");

		System.out.println("Test Case 1b - non-default constructor");
		Team c = new Team(1,1,"cubs");
		Team d = new Team(2,2,"cubs");
		System.out.println("Team C:"+c.getName());
		System.out.println("Team D:"+d.getName());
		System.out.println("PASSED="+!c.getName().equals(d.getName())+"\n");
	}
}