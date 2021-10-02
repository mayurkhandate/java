import java.util.*;

public class AccountInfo {
	Scanner sc = new Scanner(System.in);
	
	public Account[] createAccount() {
		System.out.println("Enter how many account you want to create : ");
		int n = sc.nextInt();
		
		Account arr[] = new Account[n];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("Enter Account Number for : " + (i+1));
			int account_number = sc.nextInt();
			
			System.out.println("Enter Account Type : "+ (i+1));
			String account_type = sc.next();
			
			System.out.println("Enter Account Balance : "+ (i+1));
			double account_balance = sc.nextDouble();
			
			arr[i] = new Account(account_number,account_type,account_balance);
		}
		
		return arr;
	}
	
	public void displayAccount(Account[] arr) {
		System.out.println("\n\n-----------------Account Details---------------\n\n");
		for(Account a : arr) {
			if(a!=null) {
				System.out.println("\n Account Number \t\t: " + a.getAccount_number());
				System.out.println("\n Account Type \t\t\t: " + a.getAccount_type());
				System.out.println("\n Account Balance \t\t: " + a.getAccount_balance());
			}
			
		}
	}
	
	
	public Account search(Account arr[], int account_number) {
		Account temp = null;
		
		for(Account a : arr) {
			if(a.getAccount_number() == account_number) {
				temp = a;
			}
		}
		return temp;
	}
	
	public Account deleteAccount(Account arr[],Account delete_temp2) {
		Account delete_temp = null;
		int i;
		for(i = 0; i < arr.length; i++){
			
		      if(arr[i] == delete_temp2){
		    	  
		    	  
		    	  break;
		      }
		    }
		
		while(i<arr.length-1)
		{
			arr[i] = arr[i+1];
			
			System.out.println(i);
			i++;
		}
		
		arr[i] = null;
		
		
		return delete_temp;
	}
	
	
	public Account sort(Account arr[]) {
		Account sort_temp = null;
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i].getAccount_balance() < arr[j].getAccount_balance()) {
					sort_temp = arr[j];
					arr[j] = arr[i];
					arr[i] = sort_temp;
					sort_temp = null;
				}
			}
		}
		return sort_temp;
	}
	
	
	public Account transaction(Account arr[],int account_number) {
		
		Account transaction_temp = search(arr,account_number);
		do {
			System.out.println("1.withdrawl \n 2.Deposit");
			int ch = sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter Amount you want to withdrwal : ");
				double withdrawl = sc.nextInt();
				double after_withdrawl = transaction_temp.getAccount_balance() - withdrawl;
				transaction_temp.setAccount_balance(after_withdrawl);
				System.out.println("Balance : " + transaction_temp.getAccount_balance());
				break;
				
			case 2:
				System.out.println("Enter Amount you want to Deposit : ");
				double deposit = sc.nextInt();
				double after_deposit = transaction_temp.getAccount_balance() + deposit;
				transaction_temp.setAccount_balance(after_deposit);
				System.out.println("Balance : " + transaction_temp.getAccount_balance());
				break;
				
			default:
				System.out.println("INVALID OPTION");
				break;
			}
		}while(sc.nextInt() == 1);
		
		return transaction_temp;
	}
}















