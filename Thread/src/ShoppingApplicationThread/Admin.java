package ShoppingApplicationThread;

public class Admin extends Thread{
	
	private Shop shop;
	
	public Admin(Shop shop) {
		super();
		this.shop = shop;
	}

	public void run() {
		Product[] product = shop.addProduct();
		shop.displayAllProduct(product);
	}
}
