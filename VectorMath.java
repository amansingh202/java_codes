public class VectorMath {
	public static void main(String[] args) {
		int [] v1 = { 1, 3, 5};
		int [] v2 = { -1, -3, -5};
		int [] v3 = { 1, 2, 3, 4};
		int [] v4 = { 1, 1, 1, 1};
		System.out.println(vectorToString(v1)+"+"+vectorToString(v2)+"="+vectorToString(add(v1, v2)));
		System.out.println(vectorToString(v1)+"+"+vectorToString(v3)+"="+vectorToString(add(v1, v3)));
		System.out.println(vectorToString(v2)+"+"+vectorToString(v3)+"="+vectorToString(add(v2, v3)));		
		System.out.println(vectorToString(v3)+"+"+vectorToString(v4)+"="+vectorToString(add(v3, v4)));
		System.out.println(vectorToString(v1)+"."+vectorToString(v2)+"="+dotProduct(v1, v2));
		System.out.println(vectorToString(v1)+"."+vectorToString(v3)+"="+dotProduct(v1, v3));
		System.out.println(vectorToString(v2)+"."+vectorToString(v3)+"="+dotProduct(v2, v3));		
		System.out.println(vectorToString(v3)+"."+vectorToString(v4)+"="+dotProduct(v3, v4));
	}

	// write your three public static methods here
   
}