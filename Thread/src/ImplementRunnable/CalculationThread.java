package ImplementRunnable;

import java.util.Scanner;

public class CalculationThread implements Runnable{
Scanner sc = new Scanner(System.in);
	
	private Calculation cal;

	public CalculationThread(Calculation cal) {
		super();
		this.cal = cal;
	}
	
	public void run() {
		do {
			System.out.println("1.Add \n2.Sub \n3.Mul \n");
			System.out.println("Enter your choice : ");
			switch(sc.nextInt()) {
			case 1:
				System.out.println("Addition = " + cal.getAdd());
				break;
				
			case 2:
				System.out.println("Substraction = " + cal.getSub());
				break;
				
			case 3:
				System.out.println("Multiplication = " + cal.getMult());
				break;
			default:
				System.out.println("INVALID CHIOCE.... ");
			}
		System.out.println("Enter 1 to continue.....");
		}while(sc.nextInt() == 1);
	}
}
