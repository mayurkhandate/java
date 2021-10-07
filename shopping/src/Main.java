public class Main {
	
	public static void main(String[] args) {
		ShoppingInfo si = new ShoppingInfo();
		
		Customer cust[] = si.create();
		
		si.display(cust);
		
	}


}
