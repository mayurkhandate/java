import java.util.*;

public class Transactions {
	Scanner sc = new Scanner(System.in);

	
	private int account_no;
	private double transaction_amount;
	private String transaction_type;

	public Transactions() {
		
	}
	
	public Transactions(int account_no, double transaction_amount, String transaction_type) {
		this.account_no = account_no;
		this.transaction_amount = transaction_amount;
		this.transaction_type = transaction_type;
	}


	public int getAccount_no() {
		return account_no;
	}

	public void setAccount_no(int account_no) {
		this.account_no = account_no;
	}

	public double getTransaction_amount() {
		return transaction_amount;
	}

	public void setTransaction_amount(double transaction_amount) {
		this.transaction_amount = transaction_amount;
	}

	public String getTransaction_type() {
		return transaction_type;
	}

	public void setTransaction_type(String transaction_type) {
		this.transaction_type = transaction_type;
	}
	
	public void withdrwal(Account transaction_temp){
		System.out.println("Enter Amount you want to withdrwal : ");
		double withdrawl = sc.nextInt();
		double after_withdrawl = transaction_temp.getAccount_balance() - withdrawl;
		this.setTransaction_amount(withdrawl);
		this.setAccount_no(transaction_temp.getAccount_number());
		this.setTransaction_type("WITHDRAWL");
		transaction_temp.setAccount_balance(after_withdrawl);
		System.out.println("Balance : " + transaction_temp.getAccount_balance());
	}
	
	public void deposit(Account transaction_temp) {
		System.out.println("Enter Amount you want to Deposit : ");
		double deposit = sc.nextInt();
		double after_deposit = transaction_temp.getAccount_balance() + deposit;
		this.setTransaction_amount(deposit);
		this.setAccount_no(transaction_temp.getAccount_number());
		
		this.setTransaction_type("Deposit");
		transaction_temp.setAccount_balance(after_deposit);
		System.out.println("Balance : " + transaction_temp.getAccount_balance());
	}
	
}
