package SingleThread_TwoClasses;
import java.util.*;

public class InfoThread extends Thread{
	private ArithmeticThread arithmeticThread;
	private AreaThread areaThread;
	
	Scanner sc = new Scanner(System.in);
	
	public InfoThread(ArithmeticThread arithmeticThread, AreaThread areaThread) {
		super();
		this.arithmeticThread = arithmeticThread;
		this.areaThread = areaThread;
	}
	
	
	
	public void run() {
		do {
			System.out.println("1.Add \n2.Sub \n3.Mul \n4.Rectangle \n5.Trianagle \n6.Circle");
			System.out.println("Enter your choice : ");
			switch(sc.nextInt()) {
			case 1:
				System.out.println("Addition = " + arithmeticThread.getAdd());
				break;
				
			case 2:
				System.out.println("Substraction = " + arithmeticThread.getSub());
				break;
				
			case 3:
				System.out.println("Multiplication = " + arithmeticThread.getMul());
				break;
				
			case 4:
				System.out.println("Area of rectangle = " + areaThread.getRectangle());
				break;
				
			case 5:
				System.out.println("Area of Triangle = " + areaThread.getTriangle());
				break;
				
			case 6:
				System.out.println("Area of Circle = " + areaThread.getCircle());
				break;
			default:
				System.out.println("INVALID CHIOCE.... ");
			}
		System.out.println("Enter 1 to continue.....");
		}while(sc.nextInt() == 1);
	}
	
}
