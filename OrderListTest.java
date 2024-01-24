public class OrderListTest {  
	public static void main(String[] args) {
		System.out.println("Test Case 1 – addOrder");
		OrderList list = new OrderList();
		Date temp1 = new Date(10,22,2003);
		Date temp2 = new Date(12,8,2003);
		RepeatedOrder r1 = new RepeatedOrder("Orange Inc.","C2",temp1,7,30,temp2);
		Date temp3 = new Date(1,24,2004);
		Date temp4 = new Date(2,5,2004);
		RepeatedOrder r2 = new RepeatedOrder("Orange Inc.","C2",temp3,1,30,temp4);
		Date temp5 = new Date(10,10,2002);
		Date temp6 = new Date(10,30,2002);
		RepeatedOrder r3 = new RepeatedOrder("Orange Inc.","A1",temp5,8,30,temp6);
		Date temp7= new Date(10,13,2007);
		Order o1 = new Order("HAL Industries","A2",temp7,10);
		Date temp8= new Date(3,23,2003);
		Order o2 = new Order("HAL Industries","A1",temp8,8);
		Date temp9= new Date(3,16,2007);
		Order o3 = new Order("Orange Inc.","C3",temp9,8);
		Date temp10= new Date(5,17,2006);
		Order o4 = new Order("HAL Industries","C3",temp10,1);
		list.addOrder(r1);
		list.addOrder(r2);
		list.addOrder(r3);
		list.addOrder(o1);
		list.addOrder(o2);
		list.addOrder(o3);
		list.addOrder(o4);
		
		System.out.print("add 3 repeated orders and 4 orders testing ");
		boolean a1=list.toString().equals("O=1 C=Orange Inc. P=C2 D=10/22/2003 A=7 Period=30 E=12/8/2003\nO=2 C=Orange Inc. P=C2 D=1/24/2004 A=1 Period=30 E=2/5/2004\nO=3 C=Orange Inc. P=A1 D=10/10/2002 A=8 Period=30 E=10/30/2002\nO=4 C=HAL Industries P=A2 D=10/13/2007 A=10\nO=5 C=HAL Industries P=A1 D=3/23/2003 A=8\nO=6 C=Orange Inc. P=C3 D=3/16/2007 A=8\nO=7 C=HAL Industries P=C3 D=5/17/2006 A=1\n");
		if (a1) System.out.println("PASSED");
		else System.out.println("FAILED "+ list);

		System.out.println("Test Case 2 – getCustomerOrders");
		System.out.print("getCustomerOrders testing ");
		boolean a2=list.getCustomerOrders("Orange Inc.").equals("O=1 C=Orange Inc. P=C2 D=10/22/2003 A=7 Period=30 E=12/8/2003\nO=2 C=Orange Inc. P=C2 D=1/24/2004 A=1 Period=30 E=2/5/2004\nO=3 C=Orange Inc. P=A1 D=10/10/2002 A=8 Period=30 E=10/30/2002\nO=6 C=Orange Inc. P=C3 D=3/16/2007 A=8\n");
		if (a2) System.out.println("PASSED");
		else System.out.println("FAILED "+ list.getCustomerOrders("Orange Inc."));

		System.out.println("Test Case 3 – deleteOrder");
		list.deleteOrder(3);
		System.out.print("deleteOrder testing ");
		boolean a3=list.getCustomerOrders("Orange Inc.").equals("O=1 C=Orange Inc. P=C2 D=10/22/2003 A=7 Period=30 E=12/8/2003\nO=2 C=Orange Inc. P=C2 D=1/24/2004 A=1 Period=30 E=2/5/2004\nO=6 C=Orange Inc. P=C3 D=3/16/2007 A=8\n");
		if (a3) System.out.println("PASSED");
		else System.out.println("FAILED "+ list.getCustomerOrders("Orange Inc."));

		System.out.println("Test Case 4 - verify deep copy of orders when added to orderList");
		OrderList list1 = new OrderList();
		Date temp11 = new Date(10,22,2003);
		Date temp12 = new Date(12,8,2003);
		RepeatedOrder r11 = new RepeatedOrder("Orange Inc.","C2",temp11,7,30,temp12);
		Date temp17= new Date(10,13,2007);
		Order o11 = new Order("HAL Industries","A2",temp17,10);
		list1.addOrder(r11);
		list1.addOrder(o11);
		// verify deep copy of orders when added to orderList
		r11.setPeriod(20);
		o11.setAmount(100);
		System.out.print("verify deep copy of orders when added to orderList testing ");
		boolean a4=list1.toString().equals("O=1 C=Orange Inc. P=C2 D=10/22/2003 A=7 Period=30 E=12/8/2003\nO=2 C=HAL Industries P=A2 D=10/13/2007 A=10\n");
		if (a4) System.out.println("PASSED");
		else System.out.println("FAILED "+ list);
	}
}