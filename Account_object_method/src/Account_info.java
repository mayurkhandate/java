import java.util.*;

public class Account_info {
	public Account create() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account no : ");
		int account_no = sc.nextInt();
		
		System.out.println("Enter Customer Name : ");
		String customer_name = sc.next();
		
		System.out.println("Enter account Balance : ");
		double account_balance = sc.nextDouble();
		
		Account a = new Account(account_no,customer_name,account_balance);
		
		if(a.equals(a)) {
			System.out.println("objects are equal .");
		}
		
		return a;
	}
	
	
	
	public void display(Account a_return) {
		System.out.println(a_return);
	}
	
}
