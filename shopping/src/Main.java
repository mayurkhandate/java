public class Main {
	
	public static void main(String[] args) {
		Product pro = new Product(12,"shoes",20,2);
		Address add = new Address("Nagpur","Maharashtra","India",440022);
		Customer cust = new Customer(21,"Mayur",8699, pro,add);
		
		display(cust);
		
	}
	
	public static void display(Customer cust) {
		
		System.out.println("--------------Customer---------------");
		
		System.out.println("Customer ID : " + cust.getCustomer_id());
		System.out.println("Customer Name : " + cust.getCustomer_name());
		System.out.println("Customer Phone no : " + cust.getCustomer_phone_no());
		
		System.out.println("--------------Product---------------");
		
		System.out.println("Product ID : "+ cust.getPro().getProduct_id());
		System.out.println("Product Name : " + cust.getPro().getProduct_name());
		System.out.println("Product Price : " + cust.getPro().getProduct_price());
		System.out.println("Product Quantity : " + cust.getPro().getProduct_quantity());
		
		System.out.println("--------------Address---------------");
		
		System.out.println("City : " + cust.getAddr().getCity());
		System.out.println("State : " + cust.getAddr().getState());
		System.out.println("Country : " + cust.getAddr().getCountry());
		System.out.println("Pincode : " + cust.getAddr().getPincode());
		
	
	}


}
