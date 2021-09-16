import java.util.*;

public class Menu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch,r;
		
		Food f = new Food();
		Main_course m = new Main_course();
		Bread b = new Bread();
		
		do {
			System.out.println("1.Starter \n 2.Main course \n 3.Breads \n");
			ch = sc.nextInt();
			
			switch(ch) {
			case 1:
				System.out.println("\n-----------------Starter-----------------\n");
				r = f.starter();
//				f.display(r);
			break;
				
				
			case 2:
				System.out.println("\n-----------------Main Course-----------------\n");
				r = m.main_course();
//				m.display(r);
			break;
			
			case 3:
				System.out.println("\n-----------------Main Course-----------------\n");
				r = b.bread();
//				b.display(r);
			break;
			
			case 4:
				System.out.println("\n--------------------Bill-----------------------\n");
				
			break;
				
			default:
				System.out.println("INVALID OPTION");
			break;
			}
		}while(1 == sc.nextInt());
	}
}
