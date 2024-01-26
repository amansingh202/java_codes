public class OrderRepeatedOrderTest {  
	public static void main(String[] args) {
		System.out.println("Test Case 1 - Order constructor (args OK), toString()");
		//order constructor all args OK
		System.out.print("order constructor all args OK testing ");
		Date temp = new Date(10,13,2007);
		Order o1 = new Order("HAL Industries","A2",temp,10);
		boolean a1=o1.toString().equals("O=1 C=HAL Industries P=A2 D=10/13/2007 A=10");
		if (a1) System.out.println("PASSED");
		else System.out.println("FAILED "+ o1);

		System.out.println("Test Case 2 - Order constructor (args NOT OK)");
		//order constructor - customerID null
		System.out.print("order constructor - customerID null testing ");
		Order o2 = new Order(null,"A2",temp,10);
		boolean a2=o2.toString().equals("O=2 C=DefaultCustomerID P=A2 D=10/13/2007 A=10");
		if (a2) System.out.println("PASSED");
		else System.out.println("FAILED "+ o2);

		//order constructor - productID null
		System.out.print("order constructor - productID null ");
		Order o3 = new Order("HAL Industries",null,temp,10);
		boolean a3=o3.toString().equals("O=3 C=HAL Industries P=DefaultProductID D=10/13/2007 A=10");
		if (a3) System.out.println("PASSED");
		else System.out.println("FAILED "+ o3);

		//order constructor - orderDate null
		System.out.print("order constructor - orderDate null testing ");
		Order o4 = new Order("HAL Industries","A2",null,10);
		boolean a4=o4.toString().equals("O=4 C=HAL Industries P=A2 D=1/1/2000 A=10");
		if (a4) System.out.println("PASSED");
		else System.out.println("FAILED "+ o4);

		//order constructor - amount <0
		System.out.print("order constructor - amount <0 testing ");
		Order o5 = new Order("HAL Industries","A2",temp,-1);
		boolean a5=o5.toString().equals("O=5 C=HAL Industries P=A2 D=10/13/2007 A=0");
		if (a5) System.out.println("PASSED");
		else System.out.println("FAILED "+ o5);

		System.out.println("Test Case 3 - OrderDate deep copy");
		//check setOrderDate does deep copy
		System.out.print("check setOrderDate does deep copy testing ");
		Date temp1 = new Date(10,13,2020);
		o1.setOrderDate(temp1);
		temp1.setDate(11, 13, 2020);
		boolean a6=o1.toString().equals("O=1 C=HAL Industries P=A2 D=10/13/2020 A=10");
		if (a6) System.out.println("PASSED");
		else System.out.println("FAILED "+ o1);

		//check getOrderDate does deep copy
		System.out.print("check getOrderDate does deep copy testing ");
		Date temp2 = o2.getOrderDate();
		temp2.setDate(1, 1, 2020);
		boolean a7=o2.toString().equals("O=2 C=DefaultCustomerID P=A2 D=10/13/2007 A=10");
		if (a7) System.out.println("PASSED");
		else System.out.println("FAILED "+ o2);

		System.out.println("Test Case 4 - RepeatedOrder constructor (args OK), toString()");
		//repeated order constructor all args OK
		System.out.print("repeated order constructor all args OK testing ");
		Date t = new Date(3,21,2017);
		Date t1= new Date(10,21,2017);
		RepeatedOrder r1 = new RepeatedOrder("HAL Industries","A2",t,10,10,t1);
		boolean ar1=r1.toString().equals("O=1 C=HAL Industries P=A2 D=3/21/2017 A=10 Period=10 E=10/21/2017");
		if (ar1) System.out.println("PASSED");
		else System.out.println("FAILED "+ r1);

		System.out.println("Test Case 5 - RepeatedOrder constructor (args NOT OK)");
		//repeated order constructor - period <0
		System.out.print("repeated order constructor - period <0 testing ");
		RepeatedOrder r2 = new RepeatedOrder("HAL Industries","A2",t,10,-1,t1);
		boolean ar2=r2.toString().equals("O=2 C=HAL Industries P=A2 D=3/21/2017 A=10 Period=0 E=10/21/2017");
		if (ar2) System.out.println("PASSED");
		else System.out.println("FAILED "+ r2);

		//repeated order constructor - endDate null
		System.out.print("repeated order constructor - endDate null testing ");
		epeatedOrder r3 = new RepeatedOrder("HAL Industries","A2",t,10,10,null);
		boolean ar3=r3.toString().equals("O=3 C=HAL Industries P=A2 D=3/21/2017 A=10 Period=10 E=3/21/2017");
		if (ar3) System.out.println("PASSED");
		else System.out.println("FAILED "+ r3);
		System.out.println("Test Case 6 - RepeatedOrder EndDate deep copy");
		//check setEndDate(does deep copy
		System.out.print("check setEndDate(does deep copy testing ");
		Date t2 = new Date(5,15,2020);
		r1.setEndDate(t2);
		t2.setDate(11, 13, 2020);
		boolean ar4=r1.toString().equals("O=1 C=HAL Industries P=A2 D=3/21/2017 A=10 Period=10 E=5/15/2020");
		if (ar4) System.out.println("PASSED");
		else System.out.println("FAILED "+ r1);

		//check getEndDate does deep copy
		System.out.print("check getEndDate(does deep copy testing ");
		Date t3 = r2.getOrderDate();
		t3.setDate(1, 1, 2020);
		boolean ar5=r2.toString().equals("O=2 C=HAL Industries P=A2 D=3/21/2017 A=10 Period=0 E=10/21/2017");
		if (ar5) System.out.println("PASSED");
		else System.out.println("FAILED "+ r2);
	}
}