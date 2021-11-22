package Syncronization;

public class Customer extends Thread{
	private Shoppping shopping;

	public Customer(Shoppping shopping) {
		super();
		this.shopping = shopping;
	}
	
	public void run() {
		
//		synchronized block example whole object syn
		synchronized (shopping) {
			shopping.displayData("CUSTOMER");
		}
		
	}
	
	
}
