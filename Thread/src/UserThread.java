public class UserThread extends Thread{
	
	private int n1;
	private int n2;
	
	public UserThread(int n1,int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	
	public void run() {
		addition();
	}
	
	public void addition() {
		int ans = n1 + n2;
		System.out.println("Addition : " + ans);
	}
}



