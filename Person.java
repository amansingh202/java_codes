public class Person {
	private int ID, arriveTime, floor, elevatorGoTime, leaveTime;
	private static int personCount=1;
	public Person(int a, int f) {
		ID=personCount;
		personCount++;
		setArriveTime(a);
		setFloor(f);
	}
	/* accessor methods */
	int getID() { return ID; }
	int getArriveTime() { return arriveTime; }
	int getFloor()   { return floor; }
	int getElevatorGoTime()  { return elevatorGoTime; }
	int getLeaveTime()  { return leaveTime; }

	public void setArriveTime(int a) {
		arriveTime = a;
		if (arriveTime<=0)
			System.err.println(toString()+ " Invalid Arrival Time");
	}
          
	public void setFloor(int f) {
		floor=f;
		if (floor<=0) 
			System.err.println(toString()+ " Invalid Floor");
	}
         
	public void setElevatorGoTime(int e) {
		elevatorGoTime = e; 
		if (elevatorGoTime<=0 || elevatorGoTime<arriveTime) 
			System.err.println(toString()+ " Invalid Elevator Go Time");
	}
          
	public void setLeaveTime(int l) {
		leaveTime = l;
		if (leaveTime<=0 || leaveTime<elevatorGoTime) 
			System.err.println(toString()+ " Invalid Leave Time");
	}

	public String toString( ) {
		return "ID=" + ID + " Arrive=" + arriveTime + " Floor=" + floor +
            " Go=" + elevatorGoTime + " Leave=" + leaveTime;
	}
}