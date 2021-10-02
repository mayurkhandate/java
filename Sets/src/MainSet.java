import java.util.Scanner;

public class MainSet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a3[] = null;
		
		int n1,n2,k=0;
		
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
		
	
		a3 = new int[n1];
		for(int i = 0; i < n1; i++) {
			a3[i] = a1[i];
		}
		
		
		for(int j = n1 + 1; k < n2; j++,k++) {
			a3[j] = a2[k];
		}
		
		for(int i = 0; i < a3.length; i++) {
			System.out.println("\t" + a3[i]);
		}

	}
}
