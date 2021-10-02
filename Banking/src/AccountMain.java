import java.util.*;

public class AccountMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		AccountInfo ainfo = new AccountInfo();
		
		Account arr[] = null;
		
		do {
			System.out.println("1.Create Account\n2.Display Account\n3.Search\n4.Delete\n5.Update\n6.Transaction\n7.Sort");
			int ch = sc.nextInt();
				
			switch(ch) {
			case 1:
				arr = ainfo.createAccount();
				break;
				
			case 2:
				ainfo.displayAccount(arr);
				break;
				
			case 3:
				System.out.println("Enter Account no you want to search : ");
				Account temp = ainfo.search(arr, sc.nextInt());
				
				if(temp != null) {
					System.out.println(temp.getAccount_number() + "\t" + temp.getAccount_type() +"\t"+ temp.getAccount_balance());
				}
				else {
					System.out.println("INVALID ACCOUNT NO");
				}
				
				break;
				
			case 4:
//				half right
				System.out.println("Enter Account no you want to delete : ");
				Account delete_temp = ainfo.search(arr, sc.nextInt());
				
				if(delete_temp != null) {
					ainfo.deleteAccount(arr, delete_temp);
					System.out.println("Account Deleted.....");
					
				}
				else {
					System.out.println("INVALID ACCOUNT NO");
				}
				break;
				
			case 5:
				
				
				break;
				
			case 6:
					System.out.println("Enter account no : ");
					Account transaction_temp = ainfo.transaction(arr,sc.nextInt());
					System.out.println("Transaction successfull..");
				break;
				
			case 7:
				Account sort_temp = ainfo.sort(arr);
				if(sort_temp == null) {
					System.out.println("Accounts sorted in descending order ( Balance )");
				}
				else {
					System.out.println("Accouts failed to sort");
				}
				break;
				
			default:
				System.out.println("INVALID OPTIONS");
				break;
			}System.out.println("Do you want to continue....Press 1");
			
		}while(sc.nextInt() == 1);
			System.out.println("--------------Thankyou-----------------");
	}

}
