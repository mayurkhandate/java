package Syncronization;

public class Main {

	public static void main(String[] args) {
		Shoppping shopping = new Shoppping();
		Customer customer = new Customer(shopping);
		Admin admin = new Admin(shopping);
		
		customer.start();
		admin.start();

	}

}
