package ThreadMethods;

public class Demo extends Thread{

	private String str;

	public Demo(String str) {
		super();
		this.str = str;
	}
	
	public void run() {
		for(int i =0; i < 5; i++) {
			System.out.println(str + " : " + i);
		}
	}
}
