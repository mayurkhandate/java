import java.util.*;

public class MainConverter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Converter c = new Converter();
		
		do {
			
			float r = c.create();
			c.display(r);
			System.out.println("Enter 1 to continue : ");
		
		}while( 1 == sc.nextInt());
		
	}
}
