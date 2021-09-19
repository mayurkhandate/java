import java.util.*;

public class Bread {
	Scanner sc = new Scanner(System.in);
	String bread_menu[] = {"b1","b2","b3","b4"};
	int bread_rate[] = {12,14,16,18};
	int ch,i,j,quantity,order_price,total;
	int bread_total = 0,naan_total = 0;
	
	public int bread() {
		do {
			System.out.println("\n1.Bread \n2.Naan \n");
			ch = sc.nextInt();
			switch(ch) {
				case 1:
					System.out.println("\n--------------Breads-----------\n");
					System.out.println("\n 1.b1 \n 2.b2 \n");
					i = sc.nextInt();
					order_price = bread_rate[i-1];
					System.out.println("Enter how many quantity you want to order : ");
					quantity = sc.nextInt();
					bread_total = quantity * order_price;
				break;
				
				case 2:
					System.out.println("\n--------------Naans-----------\n");
					System.out.println("\n 1.n1 \n 2.n2 \n");
					j = sc.nextInt();
					order_price = bread_rate[j-1];
					System.out.println("Enter how many quantity you want to order : ");
					quantity = sc.nextInt();
					naan_total = quantity * order_price;
				break;
			}
		System.out.println("Enter 1 to continue : ");
		}while( 1 == sc.nextInt());
			System.out.println("Enter 1 to go to Main menu");
		
		return i;
	}
	

	
	public void display(int i, int quantity) {
		System.out.println(" " + bread_menu[i-1] + "\t" + " " + bread_rate[i-1] + "\t" + quantity);
	}
}
