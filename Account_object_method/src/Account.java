
public class Account {
	private int account_no;
	private String customer_name;
	private double account_balance;
	
	public Account(int account_no, String customer_name, double account_balance) {
		this.account_no = account_no;
		this.customer_name = customer_name;
		this.account_balance = account_balance;
	}

	public int getAccount_no() {
		return account_no;
	}

	public void setAccount_no(int account_no) {
		this.account_no = account_no;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public double getAccount_balance() {
		return account_balance;
	}

	public void setAccount_balance(double account_balance) {
		this.account_balance = account_balance;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Account No : " + getAccount_no() + "\n " + "Account Name : " + getCustomer_name() + "\n" + "Account Balance : " + getAccount_balance();
	}
	
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Hurray !!! Memory Released .......");
	}
	
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
		Account a = (Account)obj;
		
		if(a.getAccount_no() == this.getAccount_no()) {
			return true;
		}
		return false;
	}
	
	
}
