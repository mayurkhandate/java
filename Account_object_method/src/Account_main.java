import java.util.*;

public class Account_main {
	
	public static void main(String[] args) {
		Account_info ai = new Account_info();
		
		Account a_return = ai.create();
		
		ai.display(a_return);

		a_return = null;
		System.out.println("Leaving main next command of garbage collector ");
		System.gc();
		
	}
	
	

}
