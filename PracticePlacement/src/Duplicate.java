/*
 Write a program to print most duplicate characters in a string? 
 Input = "aaaaa aaaa aaaaaaaab bbbcddd deeeeee" 
 Output = Most duplicate character is 'a' and count is <<no. of times a occurs>>
 */

import java.util.*;

public class Duplicate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean b = true;
		int count = 1;
		char a = 0;
		
		System.out.println("Enter string : ");
		String s = sc.next();
		
		char arr[] = s.toCharArray();
		System.out.println("Enter string is : " + s);
		
		System.out.println("Duplicate char in string :");
		for(int i = 0; i < s.length(); i++) {
			for(int j = i + 1; j < s.length(); j++) {
				if(arr[i] == arr[j]) { 
					a = arr[j];
					count++;
					break;
				}
			}
			
		}
		

	}

}
