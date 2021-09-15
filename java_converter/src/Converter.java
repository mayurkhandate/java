import java.util.*;

public class Converter {
	String currency[] = {"Rupee","Dollar","Euro"};
	float rate[] = {1,74,91};
	
	Scanner sc = new Scanner(System.in);
	float amount,result;
	int i,j;
	
	public float create() {
		System.out.println("\n 1.Rupee \n 2.Dollar \n 3.Euro \n");
		System.out.println("Enter Currency from : ");
		i = sc.nextInt();
		
		System.out.println("Enter Currency to be : ");
		j = sc.nextInt();
		
		System.out.println("Enter Amount : ");
		amount = sc.nextInt();
		
		result = amount * rate[i-1]/rate[j-1];
		
		return result;
		
	}
	
	public void display(float result) {
		System.out.println(currency[i-1]+ " To " + currency[j-1] + " = " + result);
	}
}
