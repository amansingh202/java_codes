public class DailySalesTest {  
	public static void main(String[] args) {
		System.out.println("Test Case 1 - constructors, toString");
		//test default constructor
		DailySales d1a=new DailySales();
		System.out.println("EXPECTED RESULT:0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 ");
		System.out.println("YOUR RESULT    :"+d1a.toString());
		System.out.println("PASSED="+d1a.toString().equals("0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 "));
		//test nondefault constructor (ok argument)
		DailySales d1b=new DailySales(28);
		System.out.println("EXPECTED RESULT:0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 ");
		System.out.println("YOUR RESULT    :"+d1b.toString());
		System.out.println("PASSED="+d1b.toString().equals("0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 "));
		//test nondefault constructor (bad argument)
		DailySales d1c=new DailySales(-1);
		System.out.println("EXPECTED RESULT:0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 ");
		System.out.println("YOUR RESULT    :"+d1c.toString());
		System.out.println("PASSED="+d1c.toString().equals("0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 ")+"\n");

		System.out.println("Test Case 2 - addSales");
		boolean temp;
		//test addSales (good day and good sales count)
		DailySales d2=new DailySales();
		temp=d2.addSales(1,20);
		temp=d2.addSales(31,5);
		temp=d2.addSales(1,5);
		System.out.println("EXPECTED RESULT:25 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 5 ");
		System.out.println("YOUR RESULT    :"+d2.toString());
		System.out.println("PASSED="+d2.toString().equals("25 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 5 "));

		//test addSales (bad day and good sales count)
		temp=d2.addSales(32,20);
		temp=d2.addSales(-1,20);
		System.out.println("EXPECTED RESULT:25 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 5 ");
		System.out.println("YOUR RESULT    :"+d2.toString());
		System.out.println("PASSED="+d2.toString().equals("25 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 5 "));

		//test addSales (good day and bad sales count)
		temp=d2.addSales(2,-1);
		temp=d2.addSales(3,-1);
		System.out.println("EXPECTED RESULT:25 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 5 ");
		System.out.println("YOUR RESULT    :"+d2.toString());
		System.out.println("PASSED="+d2.toString().equals("25 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 5 "));

		//test addSales (bad day and bad sales count)
		temp=d2.addSales(-1,-1);
		temp=d2.addSales(33,-1);
		System.out.println("EXPECTED RESULT:25 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 5 ");
		System.out.println("YOUR RESULT    :"+d2.toString());
		System.out.println("PASSED="+d2.toString().equals("25 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 5 ")+"\n");


		System.out.println("Test Case 3 - maxDay");
		DailySales d3=new DailySales();
		//test maxDay (duplicate max)
		System.out.println("EXPECTED RESULT:1 ");
		System.out.println("YOUR RESULT    :"+d3.maxDay());
		System.out.println("PASSED="+(d3.maxDay()==1));
		
		temp=d3.addSales(1,5);
		//test maxDay (unique max)
		System.out.println("EXPECTED RESULT:1 ");
		System.out.println("YOUR RESULT    :"+d3.maxDay());
		System.out.println("PASSED="+(d3.maxDay()==1));		

		temp=d3.addSales(31,20);
		//test maxDay (unique max)
		System.out.println("EXPECTED RESULT:31 ");
		System.out.println("YOUR RESULT    :"+d3.maxDay());
		System.out.println("PASSED="+(d3.maxDay()==31));				

		temp=d3.addSales(1,15);
		//test maxDay (duplicate max)
		System.out.println("EXPECTED RESULT:1 ");
		System.out.println("YOUR RESULT    :"+d3.maxDay());
		System.out.println("PASSED="+(d3.maxDay()==1)+"\n");				


		System.out.println("Test Case 4 - daysBelowGoal");
		//test daysBelowGoal (all days below goal)
		DailySales d4=new DailySales();
		int [] e4=d4.daysBelowGoal();
		String out="";
		for (int i=0; i<e4.length; i++) {
			out=out+e4[i]+" ";
		}
		System.out.println("EXPECTED RESULT:1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 ");
		System.out.println("YOUR RESULT    :"+out);
		System.out.println("PASSED="+out.equals("1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 "));

		//test daysBelowGoal (one day below goal)
		temp=d4.addSales(1,100);
		temp=d4.addSales(2,100);
		temp=d4.addSales(3,100);
		temp=d4.addSales(4,100);
		temp=d4.addSales(5,100);
		temp=d4.addSales(6,100);
		temp=d4.addSales(7,100);
		temp=d4.addSales(8,100);
		temp=d4.addSales(9,100);
		temp=d4.addSales(10,100);
		temp=d4.addSales(11,100);
		temp=d4.addSales(12,100);
		temp=d4.addSales(13,100);
		temp=d4.addSales(14,100);
		temp=d4.addSales(15,100);
		temp=d4.addSales(17,100);
		temp=d4.addSales(18,100);
		temp=d4.addSales(19,100);
		temp=d4.addSales(20,100);
		temp=d4.addSales(21,100);
		temp=d4.addSales(22,100);
		temp=d4.addSales(23,100);
		temp=d4.addSales(24,100);
		temp=d4.addSales(25,100);
		temp=d4.addSales(26,100);
		temp=d4.addSales(27,100);
		temp=d4.addSales(28,100);
		temp=d4.addSales(29,100);
		temp=d4.addSales(30,100);
		temp=d4.addSales(31,100);
		e4=d4.daysBelowGoal();
		out="";
		for (int i=0; i<e4.length; i++) {
  			out=out+e4[i]+" ";
		}
		System.out.println("EXPECTED RESULT:16 ");
		System.out.println("YOUR RESULT    :"+out);
		System.out.println("PASSED="+out.equals("16 "));

		// test daysBelowGoal (no days below goal)
		temp=d4.addSales(16,100);
		e4=d4.daysBelowGoal();
		out="";
		for (int i=0; i<e4.length; i++) {
			out=out+e4[i]+" ";
		}
		System.out.println("EXPECTED RESULT:");
		System.out.println("YOUR RESULT    :"+out);
		System.out.println("PASSED="+out.equals(""));	
	}
}