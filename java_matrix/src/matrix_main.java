import java.util.*;

public class matrix_main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		MatrixCalculation m = new MatrixCalculation();
		int[][] r1 = null;
		int[][] r2 = null;
		int[][] r3 = null;
		int[][] r4 = null;
		int r5;
		int ch;
		do {
			System.out.println("\n 1.Create Matrix \n 2.Display Matrix \n 3.Addition of Matrix \n 4.Multiplication of Matrix \n 5.Transpose \n");
			ch = sc.nextInt();
			
			switch(ch) {
			case 1:
				System.out.println("\n\n-----------Matrix 1-------------\n\n");
				r1 = m.create();
				
				System.out.println("\n\n-----------Matrix 2-------------\n\n");
				r2 = m.create();

				break;
				
			case 2:
				System.out.println("\n\n-----------Matrix 1-------------\n\n");
				m.display(r1);
				
				System.out.println("\n\n-----------Matrix 2-------------\n\n");
				m.display(r2);
				
				break;
				
			case 3:
				System.out.println("\n\n-----------Addition of Matrix -------------\n\n");
					r3 = m.addition(r1,r2);
					m.display(r3);
				break;
				
			case 4:
				System.out.println("\n\n-----------Multiplication of Matrix -------------\n\n");
				r4 = m.multiplication(r1,r2);
				m.display(r4);
				break;
				
			case 5:
				System.out.println("\n\n-----------Matrix Before Transpose-------------\n\n");
				m.display(r1);
				
				System.out.println("\n\n-----------Transpose of Matrix -------------\n\n");
				r5 = m.transpose(r1);
				break;
				
			default:
				System.out.println("INVALID OPTION");
				break;
			}
			
			System.out.println("Enter 1 to continue : ");
			ch = sc.nextInt();
		}while(1 == ch);
			System.out.println("-----------------------Thankyou-------------------");
		
	}
}
