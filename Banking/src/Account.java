
public class Account {
	private int account_number;
	private String account_type;
	private double account_balance;
	
	public Account(int account_number, String account_type, double account_balance) {
		this.account_number = account_number;
		this.account_type = account_type;
		this.account_balance = account_balance;
	}
	
	public int getAccount_number() {
		return account_number;
	}
	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}
	public String getAccount_type() {
		return account_type;
	}
	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}
	public double getAccount_balance() {
		return account_balance;
	}
	public void setAccount_balance(double account_balance) {
		this.account_balance = account_balance;
	}
	
}
