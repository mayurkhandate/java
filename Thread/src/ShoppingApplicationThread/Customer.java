package ShoppingApplicationThread;
import java.util.*;

public class Customer{
	private int customerId;
	private String customerName;
	private Product product;
	
	public Customer(int customerId, String customerName,Product product) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.product = product;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}

}
