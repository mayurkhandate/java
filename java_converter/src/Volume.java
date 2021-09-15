import java.util.*;

public class Volume {
	Scanner sc = new Scanner(System.in);
	float result;
	int ch;
	public float create() {
		System.out.println("\n 1.Volume of Cyclinder \n 2.Volume of Cube");
		System.out.println("Enter your choice : ");
		ch = sc.nextInt();
		switch(ch) {
			case 1:
				System.out.println("Enter radius and height of a cyclinder : ");
				int r = sc.nextInt();
				int h = sc.nextInt();
				result = 3.14f * r * r * h;
			break;
			
			case 2:
				System.out.println("Enter Edge of a cube : ");
				int a = sc.nextInt();
				result = a * a * a;
			break;
		}
		return result;
	}
	
	public void display(float result) {
		System.out.println("Volume = " + result);
	}
}
