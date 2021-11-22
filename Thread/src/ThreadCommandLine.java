
public class ThreadCommandLine extends Thread{

	String[] arr;
	
	int sum = 0;
	
	public ThreadCommandLine(String arr[]) {
		this.arr = arr;
	}
	
	public void run() {
		calculation();
	}
	
	public void calculation() {
		for(int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
			sum = sum + Integer.parseInt(arr[i]);
			
		}
		System.out.println("sum of " +  sum);
	}

}
