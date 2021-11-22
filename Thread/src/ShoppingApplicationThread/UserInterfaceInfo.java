package ShoppingApplicationThread;
import java.util.*;

public class UserInterfaceInfo implements UserInterface{
	Scanner sc = new Scanner(System.in);
	
	
	CustomerInfo customerInfo = new CustomerInfo();
	Shop shop = new Shop();
	
	Customer[] customer = null;
	
	Product[] product = null;

	@Override
	public void showFirstScreen() {
		System.out.println("1.Customer \n2.Admin \n");
		switch(sc.nextInt()) {
		case 1:
			showCustomerScreen();
			break;
			
		case 2:
			showAdminScreen();
			break;
		
		default:
			System.out.println("INVALID CHOICE...");
		}
		
	}

	@Override
	public void showCustomerScreen() {
		showAllProductScreen();
		
	}

	@Override
	public void showAdminScreen() {
		System.out.println("1.Add Product \n2.Display All Product \n3.Purchase \n");
		
		switch(sc.nextInt()) {
		case 1:
			showAddProductScreen();
			break;
		
		case 2:
			showAllProductScreen();
			break;
		
		case 3:
			showPurchaseScreen();
			break;
			
		default:
			System.out.println("INVAILD CHOICE...");
			break;
		}
		showFirstScreen();
	}

	@Override
	public void showAllProductScreen() {
		shop.displayAllProduct(product);
	}

	@Override
	public void showAddProductScreen() {
		product = shop.addProduct();
		showAdminScreen();
	}

	@Override
	public void showPurchaseScreen() {
		shop.purchase(customer, product);
		showFirstScreen();
	}

}
