package SingleThread_TwoClasses;

public class ThreadMain {

	public static void main(String[] args) {
		ArithmeticThread arithmeticThread = new ArithmeticThread(10, 20);
		AreaThread areaThread = new AreaThread();
		InfoThread infoThread1 = new InfoThread(arithmeticThread,areaThread);
		InfoThread infoThread2 = new InfoThread(arithmeticThread,areaThread);

		try {
			int i = 0;
			
			
			infoThread1.start();
			infoThread1.join();
			i++;
			System.out.println("Thread 1 : " + i);
			
			infoThread2.join();
			infoThread2.start();
			i++;
			System.out.println("Thread 2 : " + i);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}




