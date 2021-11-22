package OnlineExamThread;
import java.util.*;

public class Info extends Thread{
	Scanner sc = new Scanner(System.in);
	
	TestThread t = new TestThread();
	
	public void run() {

	do {
		System.out.println("1.questions \n2.Check Marks \n");
		switch(sc.nextInt()) {
		case 1:
			t.questions();
			break;
		case 2:
			int marks = t.check();
			System.out.println("Marks = " + marks + "\n");
			break;
		default:
			System.out.println("INVALID OPTION...");
			break;
		}
		System.out.println("Enter 1 to continue...\n");
	}while(sc.nextInt() == 1);
	}
}
