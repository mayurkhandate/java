
public class Threading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserThread thread1 = new UserThread(10, 20);
		
		thread1.setName("Thread 1");
		thread1.start();
		System.out.println("Thank you...");
		
	}

}
