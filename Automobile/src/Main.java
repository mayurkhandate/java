import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Automobile[] a = new Automobile[10];
		int i = 0;
		do {	
			System.out.println("1.CAR \n2.BIKE\n");
			
			switch(sc.nextInt()) {
			case 1:
				do {
					System.out.println("1.BMW \n2.Jaguar\n");
					switch(sc.nextInt()) {
					case 1:
						a[i] = new BMW("BMW","SEIRES 5","MATE BLACK",80000);
						i++;
						break;
						
					case 2:
						a[i] = new Jaguar("JAGUAR","SERIES F5","WHITE",90000);
						i++;
						break;
					}
					System.out.println("Enter 1 to continue or 0 to Exit");
				}while(sc.nextInt() == 1);
					System.out.println("----------------------ENTER 1 TO GO MAIN MENU---------------------");
					
				break;
				
			case 2:
				do {
					System.out.println("1.KTM \n2.BULLET\n");
					switch(sc.nextInt()) {
					case 1:
						a[i] = new KTM("KTM","RC 500","ORANGE",53000,150);
						i++;
						break;
						
					case 2:
						a[i] = new BULLET("BULET","CLASSIC 350","BLACK",120000,450);
						i++;
						break;
					}
					System.out.println("Enter 1 to continue or 0 to Exit");
				}while(sc.nextInt() == 1);
					System.out.println("---------------------Enter 1 TO GO MAIN MENU-----------------------");
				break;
			}
			
		}while(sc.nextInt() == 1);
			System.out.println("---------------------Thank you---------------");
		

		display(a,i);
	}
	
	public static void display(Automobile[] a,int i) {
		int j = 0;
			for(Automobile e : a) {
				if(j < i) {
					System.out.println("Brand : " + e.getBrand());
					System.out.println("Model : " + e.getModel());
					System.out.println("Color : " + e.getColor());
					System.out.println("Price : " + e.getPrice());
					if(e instanceof Bike) {
						Bike b = (Bike)e;
						System.out.println("NO OF CC : " + b.getCC());
					}
					j++;
					System.out.println("\n\n");
				}
				else {
					break;
				}
			}
			System.err.println("\n\n-------------VISIT AGAIN------------------\n\n");
		}

}
