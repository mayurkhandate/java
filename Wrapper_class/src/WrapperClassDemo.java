
public class WrapperClassDemo {

	public static void main(String[] args) {
		int n1 = 10;
		
//		Boxing primtive to object
		Integer iboj = new Integer(n1);
		
//		Unboxing object to primitive
		int x = iboj.intValue();
		
//		-------------------------------
		
//		java 5
		
		int y = 10;
		
		Integer iobj2 = y;	 //AUTO BOXING
		
		int z = iobj2; //unboxing
		
		System.out.println(iobj2.toBinaryString(y));
		System.out.println(iobj2.toHexString(y));
		
		
		
	}

}
