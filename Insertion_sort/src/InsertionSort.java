import java.util.*;


public class InsertionSort {
	Scanner sc = new Scanner(System.in);
	int a[] = null;
	int current,n;
	
	public int[] createArray() {
		System.out.println("Enter no of elements you want to enter in array : ");
		n = sc.nextInt();
		
		a = new int[n];
		
		System.out.println("Enter elements in array : ");
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			current = a[i];
			int j = i-1;
			while(j >= 0 && a[j] > current) {
				a[j+1] = a[j];
				j--;
			}
			a[j + 1] = current;
		}
		
		return a;
	}
	
	public void display(int a[]) {
		for(int i = 0; i < n; i++) {
			System.out.print("Sorted Array = " + " " + a[i]);
		}
	}
}
