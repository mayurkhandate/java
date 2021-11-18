import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Flyable[] f = new Flyable[10];
		int i = 0;
		int ch = 0;
		do {
			System.out.println("1.CHOPER \n2.JET");
			switch(ch) {
			case 1:
				f[i] = new Choper(500, 10, "ROLL ROCYE");
				i++;
				break;
			
			case 2:
				f[i] = new Jet(600, 10, "MAHINDRA AND MAHINDRA");
				i++;
				break;
			}
			System.out.println("Enter 1 to contine else 0 ");
		}while(sc.nextInt() == 1);
		display(f,i);
	}
	
	public static void display(Flyable[] f,int i) {
		int j = 0;
		for(Flyable a : f) {
			if(j < i) {
				if(a instanceof Choper)
				System.out.println("CHOPER : \n");
				System.out.println("TOP SPEED : " + a.topSpeed() + "\t" + "START SPEED : " + a.startSpeed() + "\t" + "ENIGNE : " + a.engine());
			}
			else if(a instanceof Jet){
				System.out.println("JET : \n");
				System.out.println("TOP SPEED : " + a.topSpeed() + "\t" + "START SPEED : " + a.startSpeed() + "\t" + "ENIGNE : " + a.engine());

			}
			else {
				break;
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
}
