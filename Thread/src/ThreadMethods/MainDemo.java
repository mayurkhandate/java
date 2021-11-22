package ThreadMethods;

public class MainDemo {

	public static void main(String[] args) {

		Demo thread1 = new Demo("java");
		Demo thread2 = new Demo("Python");
		
		System.out.println(thread1.isAlive());
		System.out.println(thread2.isAlive());
		
		thread1.setName("Thread 1");
		thread1.setName("Thread 2");

		thread1.start();
		thread2.start();
		
		System.out.println(thread1.isAlive());
		System.out.println(thread2.isAlive());
		
		for(int i = 0; i < 5; i++) {
			System.out.println("MAIN : " + i);
			try {
				thread1.join();
				thread2.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
