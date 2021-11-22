package SingleThread_TwoClasses;

public class ArithmeticThread {
	private int n1,n2;
	
	public ArithmeticThread(int n1, int n2) {
		super();
		this.n1 = n1;
		this.n2 = n2;
	}

	public int getAdd() {
		return n1 + n2;
	}
	
	public int getSub() {
		return n1 - n2;
	}
	
	public int getMul() {
		return n1 * n2;
	}
}
