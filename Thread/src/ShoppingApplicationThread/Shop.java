package ShoppingApplicationThread;
import java.util.*;

public class Shop {
	Scanner sc = new Scanner(System.in);
	
	public void purchase(Customer[] customer,Product[] product) {
		System.out.println("-----------------------CUSTOMER DETAILS--------------------------\n");
		for(int i = 0; i < customer.length; i++) {
			System.out.println("CUSTOMER ID : " + customer[i].getCustomerId());
			System.out.println("CUSTOMER NAME : " + customer[i].getCustomerName());
			System.out.println("PRODUCT ID : " + product[i].getProductId());
			System.out.println("PRODUCT ID : " + product[i].getProductName());
			System.out.println("PRODUCT ID : " + product[i].getProductPrice());
		}
	}
	
	public Product[] addProduct() {

		System.out.println("Enter no of products you want to add : ");
		int no = sc.nextInt();
		
		Product[] product = new Product[no];
		
		for(int i = 0; i < product.length; i++) {
			System.out.println("Enter product ID : ");
			int productId = sc.nextInt();
			
			System.out.println("Enter product NAME : ");
			String productName = sc.next();
			
			System.out.println("Enter product PRICE : ");
			double productPrice = sc.nextDouble();
			
			product[i] = new Product(productId,productName,productPrice);
			
		}
		return product;
	}
	
	public void displayAllProduct(Product[] product) {
		System.out.println("-------------------------ALL Products---------------------------\n ");
		
		for(int i = 0; i < product.length; i++) {
			System.out.println("Product ID : " + product[i].getProductId());
			System.out.println("Product Name : " + product[i].getProductName());
			System.out.println("Product Price : " + product[i].getProductPrice() + "\n");
		}
	}
	
	
}

