
public class Demo2 {
	

	public static void main(String[] args) {
		Demo1 d1 = new Demo1();
		Demo1 d2 = new Demo1();
		Demo1 d3 = new Demo1(10,20);
		
		
		d1.n1 =10;
		d1.n2 = 10;
		
		System.out.println("value of n1 = "+d1.n1); //10
		System.out.println("value of n2 = "+d1.n2); //10

		
		d2.n1 = 20;
		d2.n2 = 20;
		
		System.out.println("value of n1 = "+d2.n1); //20
		System.out.println("value of n2 = "+d2.n2); //20
		
		
		System.out.println("value of n1 = "+d1.n1); //10
		System.out.println("value of n2 = "+d1.n2);	//20
		
		Demo1.display();
		
		d1.show1();
		d2.show1();
		d3.show1();
	}

}
