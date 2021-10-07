import java.util.*;

public class AccountInfo{
	Scanner sc = new Scanner(System.in);
	
	public Account[] createAccount() {
		
		System.out.println("Enter how many account you want to create : ");
		int n = sc.nextInt();
		
		Account arr[] = new Account[n];
		
		for(int i = 0; i < arr.length; i++) {
			
			System.out.println("Enter Customer Name : ");
			String name = sc.next();
			
			System.out.println("Enter Customer Phone no : ");
			double phone_no = sc.nextDouble();
			
			System.out.println("Enter Customer Gender : ");
			String gender = sc.next();
			
			System.out.println("Enter Customer Country : ");
			String country = sc.next();
			
			System.out.println("Enter Customer State : ");
			String state = sc.next();
			
			System.out.println("Enter Customer City : ");
			String city = sc.next();
			
			System.out.println("Enter Customer Pincode : ");
			int pincode = sc.nextInt();
			
			System.out.println("Enter Customer Street : ");
			String street = sc.next();
			
			Address address = new Address(country,state,city,pincode,street);
			
			Customer customer = new Customer(name,phone_no,gender,address);
			
			System.out.println("Enter Account Number : ");
			int account_number = sc.nextInt();
			
			System.out.println("Enter Account Type : ");
			String account_type = sc.next();
			
			System.out.println("Enter Account Balance : ");
			double account_balance = sc.nextDouble();
			
			
			arr[i] = new Account(account_number,account_type,account_balance,customer);
				
		}
		
		return arr;
	}
	
	public void displayAccount(Account[] arr) {
		for(Account a : arr) {
			if(a!=null) {
				System.out.println("\n\t---------------------------------------------------------------------------------------------------\t\t\n");
				System.out.println("\t\t\t\t\t\t STATE BANK OF INDIA \t\t\t");
				System.out.println("\n\t---------------------------------------------------------------------------------------------------\t\t\n");
				
				
				System.out.println("\n\t Account Type \t\t: " + a.getAccount_type() + "\t\t\t\t\t Date of Issue : 25/09/2020");
				System.out.println("\n\t Account Number \t: " + a.getAccount_number() + "\t\t\t\t\t\t KONDHWA PUNE");
				
				
				System.out.println("\n\t Name \t\t\t: " + a.getCustomer().getName());
				
				System.out.println("\n\t Address \t\t: " + a.getCustomer().getAddress().getStreet() +","+ a.getCustomer().getAddress().getCity()+ "," + a.getCustomer().getAddress().getState() + ","+ a.getCustomer().getAddress().getPincode() + "," + a.getCustomer().getAddress().getCountry());			
				
				System.out.println("\n\t Phone \t\t\t: " + a.getCustomer().getPhone_no() + "\t\t\t\t\t Phone no : 245423");
				
				System.out.println("\n\t Gender \t\t: " + a.getCustomer().getGender() + "\t\t\t\t\t\t Email : sbi@gmail.com.in");
				
				System.out.println("\n\t Account Balance \t: " + a.getAccount_balance() + "\t\t\t\t\t\t Branch Code : 331");
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
	
	
	public int transaction(Account arr[],int account_number,Transactions t1[],int i) {
		
		Account transaction_temp = search(arr,account_number);
		
		if(transaction_temp == null) {
			return 0;
		}
		
		Transactions t = new Transactions();
		do {
			System.out.println("1.withdrawl \n2.Deposit");
			int ch = sc.nextInt();
			switch(ch) {
			case 1:
					t.withdrwal(transaction_temp);
					t1[i] = new Transactions(t.getAccount_no(),t.getTransaction_amount(),t.getTransaction_type());
					i++;
				break;
				
			case 2:
				t.deposit(transaction_temp);
				t1[i] = new Transactions(t.getAccount_no(),t.getTransaction_amount(),t.getTransaction_type());
				i++;
				break;
				
			default:
				System.out.println("INVALID OPTION");
				break;
			}
		System.out.println("\n\n Enter 1 to continue....\n");
		}while(sc.nextInt() == 1);
		
		return i;
	}
	
	
	public void transaction_display(Account arr[],int account_number,Transactions t[],int n) {
		System.out.println("\n\n------------------------------Transactions-------------------------------\n\n");
		for(int i = 0; i < n;i++) {
			if(t[i].getAccount_no() == account_number) {
			System.out.println(" Account No : " + t[i].getAccount_no() + " Amount " + t[i].getTransaction_amount() + " Type " + t[i].getTransaction_type());
			System.out.println("\n");
			}	
		}
	}
}















