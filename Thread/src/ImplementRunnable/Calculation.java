package ImplementRunnable;

public class Calculation {
private int n1,n2;
	
	public Calculation(int n1, int n2) {
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
	
	public int getMult() {
		return n1 * n2;
	}
}
