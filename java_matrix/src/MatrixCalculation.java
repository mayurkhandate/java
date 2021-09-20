import java.util.*;

public class MatrixCalculation {
	Scanner sc = new Scanner(System.in);
	int c=0,r=0;
	boolean flag = true;
	int matrix[][] = null;
	
	
//	create matrix
	
	public int[][] create() {
		
		System.out.println("Enter how many rows you want in matrix: ");
		r = sc.nextInt();
		
		matrix = new int[r][];
		
		for(int i = 0; i < matrix.length; i++) {
			System.out.println("Enter no of columns you want in row " + (i+1));
			c = sc.nextInt();
			matrix[i]=new int[c];
		}
		
		System.out.println("Enter elements in matrix : ");
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		return matrix;
	}
	
	
//	matrix addition half wrong
	public int[][] addition(int matrix1[][],int matrix2[][]){
		
		if(matrix1.length == matrix2.length) {
			
			for(int i = 0; i < matrix1.length ; i++) {
				if(matrix1[i].length != matrix2[i].length) {
					flag = false;
					break;
				}
				
			}
			System.out.println("Enter same no of columns for both matrix \n");
		}
		else {
			System.out.println("Enter same no of rows for both matrix \n");
		}
		
		
		if(flag) {
			for(int i = 0; i < matrix1.length; i++) {
				for(int j = 0; j < matrix1[i].length; j++) {
					matrix[i][j] = matrix1[i][j] + matrix2[i][j];
				}
			}
		}
		
		return matrix;
	}
	
	
//	matrix multiplication half wrong
public int[][] multiplication(int matrix1[][],int matrix2[][]){
		
		if(matrix1.length == matrix2.length) {
			
			for(int i = 0; i < matrix1.length ; i++) {
				if(matrix1[i].length != matrix2[i].length) {
					flag = false;
					break;
				}
				
			}
			System.out.println("Enter same no of col for both matrix \n");
		}
		else {
			System.out.println("Enter same no of rows for both matrix \n");
		}
		
		
		if(flag) {
			for(int i = 0; i < matrix1.length; i++) {
				for(int j = 0; j < matrix1[i].length; j++) {
					matrix[i][j] = matrix1[i][j] * matrix2[i][j];
				}
			}
		}
		
		return matrix;
	}
	

//Transpose 
public int transpose(int matrix1[][]){
	for(int i = 0; i < matrix1.length; i++) {
		for(int j = 0; j < matrix1[i].length; j++) {
			System.out.print("\t" + matrix1[j][i]);
		}
		System.out.println("\n");
	}
	return 0;
}
	
	
//	display matrix 
	
	public void display(int matrix[][]) {

		for(int i = 0; i < matrix.length;i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				System.out.print("\t" + matrix[i][j]);
			}
			System.out.println("\n");
		}
	}
	
	
}
