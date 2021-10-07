/*
Write a program to find if there is a sub-array with sum equal to zero? 
Please print the start and end of the array index. Input array = [4, 2, -3, 1, 6]
Output will be: There is a sub-array with zero sum from index 1 to 3.
*/

import java.util.*;

public class SubArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,k;
		
		System.out.println("Enter no of elements you want in array : ");
		n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("Enter elements in array : ");
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i++){

	        for(int j = n - 1; j > i; j--){

	            int sum = 0;
	            k = i;

	            while (j >= k)
	            {
	                sum = sum + arr[k];
	                k++;
	            }
	            
	            if(sum == 0){
	               System.out.println("Sub array found between" + i + " and " + j);
	                break;
	            }
	        }
		}
	}

}
