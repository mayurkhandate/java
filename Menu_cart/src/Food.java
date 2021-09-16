import java.util.*;

public class Food {
	Scanner sc = new Scanner(System.in);
	String starter_menu[] = {"Pasta","Manchurian","Chicken Burger","Shwarma"};
	int starter_rate[] = {2,4,6,8};
	int ch,i,j,quantity,order_price,total;
	int veg_starter_total,non_veg_starter_total;
	
	public int starter() {
		do {
			System.out.println("\n1.Veg \n2.Non Veg \n");
			ch = sc.nextInt();
			switch(ch) {
				case 1:
					System.out.println("\n--------------Veg Starter Menu-----------\n");
					System.out.println("\n 1.Pasta \n 2.Manchurain \n");
					i = sc.nextInt();
					order_price = starter_rate[i];
					System.out.println("Enter how many quantity you want to order : ");
					quantity = sc.nextInt();
					veg_starter_total = quantity * order_price;
				break;
				
				case 2:
					System.out.println("\n--------------Non veg Starter Menu-----------\n");
					System.out.println("\n 1.Chicken Burger \n 2.Shwarma \n");
					j = sc.nextInt();
					order_price = starter_rate[j];
					System.out.println("Enter how many quantity you want to order : ");
					quantity = sc.nextInt();
					non_veg_starter_total = quantity * order_price;
				break;
			}
		System.out.println("Enter 1 to continue : ");
		}while( 1 == sc.nextInt());
		
		total = veg_starter_total + non_veg_starter_total;
		return total;
	}
	

	
//	public void display(int total) {
//		System.out.println("Total bill : " + total);
//	}
}
