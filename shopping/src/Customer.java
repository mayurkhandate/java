public class Customer {
	private int customer_id;
	private String customer_name;
	private int customer_phone_no;
	private Product pro;
	private Address addr;
	
	public Customer(int customer_id, String customer_name, int customer_phone_no, Product pro, Address addr) {
		this.customer_id = customer_id;
		this.customer_name = customer_name;
		this.customer_phone_no = customer_phone_no;
		this.pro = pro;
		this.addr = addr;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public int getCustomer_phone_no() {
		return customer_phone_no;
	}
	public void setCustomer_phone_no(int customer_phone_no) {
		this.customer_phone_no = customer_phone_no;
	}
	public Product getPro() {
		return pro;
	}
	public void setPro(Product pro) {
		this.pro = pro;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	
}
