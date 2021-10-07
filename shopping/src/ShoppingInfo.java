import java.util.*;

public class ShoppingInfo {
	Scanner sc = new Scanner(System.in);
	
	public Customer[] create() {
		
		System.out.println("Enter how many customer you want to create : ");
		int n = sc.nextInt();
		
		Customer arr[] = new Customer[n];
		
		for(int i = 0; i < n; i++) {
	
			System.out.println("Enter customer " + (i + 1) + " details \n\n");
			
			System.out.println("Enter Product ID ");
			int product_id = sc.nextInt();
			
			System.out.println("Enter Product NAME ");
			String product_name = sc.next();
			
			System.out.println("Enter Product PRICE ");
			int product_price = sc.nextInt();
			
			System.out.println("Enter Product QUANTITY ");
			int product_quantity = sc.nextInt();
			
			Product pro = new Product(product_id,product_name,product_price,product_quantity);
			
			System.out.println("Enter Customer CITY ");
			String city = sc.next();
			
			System.out.println("Enter Customer STATE ");
			String state = sc.next();
			
			System.out.println("Enter Customer Country ");
			String country = sc.next();
			
			System.out.println("Enter Customer PINCODE ");
			int pincode = sc.nextInt();
			
			Address add = new Address(city,state,country,pincode);
			
			System.out.println("Enter Customer ID ");
			int customer_id = sc.nextInt();
			
			System.out.println("Enter Customer NAME ");
			String customer_name = sc.next();
			
			System.out.println("Enter Customer PHONE NO ");
			int customer_phone_no = sc.nextInt();
			
			

			arr[i] = new Customer(customer_id,customer_name,customer_phone_no, pro,add);
			
			System.out.println("\n\n-------------------------------------------------- \n\n");
		}
		return arr;
	}
	
	
	public static void display(Customer[] cust) {
		
		for(Customer c: cust ) {
			System.out.println("--------------Customer---------------");
			
			System.out.println("Customer ID : " + c.getCustomer_id());
			System.out.println("Customer Name : " + c.getCustomer_name());
			System.out.println("Customer Phone no : " + c.getCustomer_phone_no());
			
			System.out.println("--------------Product---------------");
			
			System.out.println("Product ID : "+ c.getPro().getProduct_id());
			System.out.println("Product Name : " + c.getPro().getProduct_name());
			System.out.println("Product Price : " + c.getPro().getProduct_price());
			System.out.println("Product Quantity : " + c.getPro().getProduct_quantity());
			
			System.out.println("--------------Address---------------");
			
			System.out.println("City : " + c.getAddr().getCity());
			System.out.println("State : " + c.getAddr().getState());
			System.out.println("Country : " + c.getAddr().getCountry());
			System.out.println("Pincode : " + c.getAddr().getPincode());
			
			System.out.println("\n\n----------------------------------------------------\n\n");
		}

	
	}
}
