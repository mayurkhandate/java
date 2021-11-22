package ShoppingApplicationThread;
import java.util.*;

public class CustomerInfo {
	Scanner sc = new Scanner(System.in);
	
	public Customer[] create() {
		System.out.println("Enter no of customer you want to create?");
		int no = sc.nextInt();
		
		Customer[] customer = new Customer[no];
		
		for(int i = 0; i < no; i++) {
			System.out.println("Enter customer ID : ");
			int customerId = sc.nextInt();
			
			System.out.println("Enter customer NAME : ");
			String customerName = sc.next();
			
			System.out.println("Enter product ID : ");
			int productId = sc.nextInt();
			
			System.out.println("Enter product NAME : ");
			String productName = sc.next();
			
			System.out.println("Enter product PRICE : ");
			double productPrice = sc.nextDouble();
			
			Product product = new Product(productId,productName,productPrice);
			
			
			customer[i] = new Customer(customerId,customerName,product);
	
		}
		return customer;
	}
	
}
