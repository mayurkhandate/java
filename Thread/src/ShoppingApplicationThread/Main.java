package ShoppingApplicationThread;

public class Main {

	public static void main(String[] args) {

		Shop shop = new Shop();
		
		Admin admin = new Admin(shop);
		admin.start();
		
		CustomerThread customerThread = new CustomerThread(shop);
		customerThread.start();
		
		new UserInterfaceInfo().showFirstScreen();

	}

}
