import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Instrument[] i = new Instrument[10];
		int j = 0;
		do {
			System.out.println("1.Piano \n2.Flute \n3.Guitar");
			int ch = sc.nextInt();
			
			switch(ch) {
			case 1:
				i[j] = new Piano();
				j++;
				break;
				
			case 2:
				i[j] = new Flute();
				j++;
				break;
				
			case 3:
				i[j] = new Guitar();
				j++;
				break;
				
			default:
				System.out.println("INVALID OPTION");
				break;
			}
			
			System.out.println("Enter 1 to continue  or 0 to exit : ");
		}while(sc.nextInt() == 1);
		
		display(i);
	
 	}
	
	public static void display(Instrument[] i) {
		for(Instrument a: i) {
			if(a instanceof Piano) {
				a.hobby();
			}
			else if(a instanceof Flute) {
				a.hobby();
			}
			else if(a instanceof Guitar) {
				a.hobby();
			}
		}
	}
}
