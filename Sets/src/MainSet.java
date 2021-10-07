import java.util.Scanner;

public class MainSet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a3[] = null;
		
		int n1,n2;
		
		System.out.println("Enter no of element you want in array 1 : ");
		n1 = sc.nextInt();
		int a1[] = new int[n1];
		System.out.println("Enter elements in array 1 : ");
		for(int i = 0; i < n1; i++) {
			a1[i] = sc.nextInt();
		}
		
		
		System.out.println("Enter no of element you want in array 2 : ");
		n2 = sc.nextInt();
		int a2[] = new int[n2];
		System.out.println("Enter elements in array 2 : ");
		for(int i = 0; i < n2; i++) {
			a2[i] = sc.nextInt();
		}
		
		a3 = new int[a1.length + a2.length];
		
		for(int i = 0; i < n1; i++) {
			a3[i] = a1[i];
			System.out.format("%d", a3[i]);
		}
		
		for(int i = 0,k = n1; i < n1; i++,k++) {
			boolean b = true;
			for(int j = 0; j < n2; j++) {
				if(a1[i] == a2[j]) {
					b = false;
					break;
				}
				
			}
			if(b==true) {
				a3[k] = a2[i];
			}
			
			
		}
		
		
		for(int i = 0; i < (a1.length + a2.length); i++) {
			System.out.print("\t" + a3[i]);
		}

	}
}
