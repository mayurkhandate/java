package Syncronization;

public class Admin extends Thread{
	private Shoppping shopping;

	public Admin(Shoppping shopping) {
		super();
		this.shopping = shopping;
	}
	
//	synchronized method example only part of object syn
	public synchronized void run() {
		shopping.displayData("ADMIN");
	}
	
}
