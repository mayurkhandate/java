
public class Customer {
	private String name;
	private double phone_no;
	private String gender;
	private Address address;
	
	public Customer(String name, double phone_no, String gender,Address address) {
		this.name = name;
		this.phone_no = phone_no;
		this.gender = gender;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(double phone_no) {
		this.phone_no = phone_no;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	 
	
}
