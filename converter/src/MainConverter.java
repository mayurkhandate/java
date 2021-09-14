import java.util.*;


public class MainConverter {
	public static void main(String args[]) {
		
		Converter c = new Converter();
		
		float amount;
		int ch;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("--------------------Converter----------------");
		do {
			System.out.println("\n 1.Rupee to Dollar \n 2.Dollar to Rupee");
			System.out.println("Enter your choice : ");
			ch = sc.nextInt();
			switch(ch) {
			case 1: 
				System.out.println("Enter your amount : ");
				amount = sc.nextFloat();
				c.rupeeToDollar(amount);
			break;
			
			case 2: 
				System.out.println("Enter your amount : ");
				amount = sc.nextFloat();
				c.dollarToRupee(amount);
			break;
		
			default:
				System.out.println("INVALID OPTION");
			break;
			}
		System.out.println("Enter 1 to continue : ");
		ch = sc.nextInt();
			
		}while(ch == 1);
			System.out.println("------------------Thank you--------------");
	}
}
