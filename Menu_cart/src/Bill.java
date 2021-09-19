import java.util.*;

public class Bill {
	Scanner sc = new Scanner(System.in);
	Starter s = new Starter();
	Bread b = new Bread();
	int r,r1,total=0;
	int ch = 0;
	
	public int show_menu() {
		do {
			System.out.println("\n 1.Starter \n 2.Bread \n");
			ch = sc.nextInt();
			
			switch(ch) {
			case 1:
				System.out.println("\n-----------------Starter-----------------\n");
				r = s.starter();
				
			break;
				
				
			case 2:
				System.out.println("\n-----------------Bread-----------------\n");
				r1 = b.bread();
			break;
			
			
			case 4:
				System.out.println("\n--------------------Bill-----------------------\n");
				
			break;
				
			default:
				System.out.println("INVALID OPTION");
			break;
			}
		}while(1 == sc.nextInt());
		
		return r;
	}
	
	
	
	public void display(int r){
		s.display(r,s.quantity);
		b.display(r1,b.quantity);	
	}
	
	public int caluclate_bill() {
		 total= s.non_veg_starter_total+s.veg_starter_total+b.bread_total+b.naan_total;
		return total;
	}
	
	public void display_bill(int total) {
		System.out.println("Total  bill is:"+total);
	}
}
