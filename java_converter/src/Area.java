import java.util.*;

public class Area {
	float result;
	Scanner sc = new Scanner(System.in);
	
	public float create() {
		System.out.println("\n 1.Circle \n 2.Triangle");
		System.out.println("Enter your choice : " + sc.nextInt());
		switch(1) {
			case 1:
				System.out.println("Enter Radius of a circle : ");
				int r = sc.nextInt();
				result = 3.14f * r * r;
			break;
			
			case 2:
				System.out.println("Enter base and height of a Triangle");
				int b = sc.nextInt();
				int h = sc.nextInt();
				result = 0.5f * b * h;
			break;
		}
		return	result;
	}
	
	public void display(float result) {
		System.out.println("Result = " + result);
	}
}
