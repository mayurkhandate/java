/*
Rotate a given array by a given number. When array is rotated once, the last element of the array becomes 
the first element of the array. Input array = [6, 7, 3, 5, 9, 2, 0, 1] Rotate by = 3 times; 
Output = [2, 0, 1, 6, 7, 3, 5, 9]. Write a program for the above rotation by 3.
 */
import java.util.*;

public class Iteration {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,k;
		
		System.out.println("Enter size of array : ");
		n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("Enter element in array : ");
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter no of iterations you want : ");
		k = sc.nextInt();
		
			for(int i = 0; i < n; i++,k--){
				if(k > 0) {
					for(int j = n-1; j > 0; j--){
			        	
			            int temp = arr[j-1];
			            arr[j-1] = arr[j];
			            arr[j] = temp;
			        }
			        
			        for(int p = 0; p < n; p++){
			        	
			        	System.out.print("\t" + arr[p]);
			        }
			        System.out.println("\n");
				}
		        
			}
	}

}
	
	
