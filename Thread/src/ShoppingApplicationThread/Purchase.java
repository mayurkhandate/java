package ShoppingApplicationThread;

public class Purchase {
	private Customer customer;
	private Product product;
	
	public Purchase(Customer customer, Product product) {
		super();
		this.customer = customer;
		this.product = product;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	
	
}
