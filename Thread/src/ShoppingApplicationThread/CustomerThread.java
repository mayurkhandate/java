package ShoppingApplicationThread;

public class CustomerThread extends Thread{
	private Shop shop;
	
	public CustomerThread(Shop shop) {
		super();
		this.shop = shop;
	}


	public void run() {
		
		CustomerInfo customerInfo = new CustomerInfo();
		customerInfo.create();
	}
}
