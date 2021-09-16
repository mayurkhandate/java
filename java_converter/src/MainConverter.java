import java.util.*;

public class MainConverter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Converter c = new Converter();
		Area a = new Area();
		Volume v = new Volume();
		int ch;
		float r;
		
		do {
			System.out.println("\n 1.Currency converter \n 2.Area \n 3.Volume \n");
			System.out.println("Enter your choice");
			ch = sc.nextInt();
			switch(ch) {
				case 1:
					System.out.println("--------------CURRENCY CONVERTER-------------");
					r = c.create();
					c.display(r);
				break;
				
				case 2:
					System.out.println("--------------------AREA----------------");
					r = a.create();
					a.display(r);
				break;
				
				case 3:
					System.out.println("--------------------VOLUME----------------");
					r = v.create();
					v.display(r);
				break;
				
				default:
					System.out.println("INVALID OPTION");
				break;
			}
			
		System.out.println("Enter 1 to continue : ");
		}while( 1 == sc.nextInt());
		
	}
}
