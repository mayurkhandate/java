package Syncronization;

public class Shoppping {
	private String string;
	
	public void displayData(String string) {
		
		System.out.println(string + " Screen");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
