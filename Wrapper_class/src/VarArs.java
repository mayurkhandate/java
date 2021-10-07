
 class Demo {

	public static void greater(int ...x) {
		int sum =0;
		System.out.println("Length of given in is : " + x.length);
		for(int i:x) {
			System.out.println(sum += i);
		}
		
	}
 }
	
	public class VarArs{
		public static void main(String args[]) {
			Demo d = new Demo();
			
			d.greater(10,20);
			d.greater(10,20,30);
			d.greater(10,20,30,40);
			d.greater(10,20,30,40,50);
		}
	}