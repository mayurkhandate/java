import java.util.*;

public class Info{
	Scanner sc = new Scanner(System.in);
	
	
	public Employee[] create() {
		System.out.println("Enter how many Employee you want to create : ");
		int n = sc.nextInt();
		
		Employee arr[] = new Employee[n];
		
		int i = 0;
		int ch = 0;
		
		do {
			if(i < n) {
				System.out.println("1.Manager \n2.Developer\n");
				ch = sc.nextInt();
				
				System.out.println("Enter Employee ID : ");
				int employee_id = sc.nextInt();
				
				System.out.println("Enter Employee Name : ");
				String employee_name = sc.next();
				
    			System.out.println("Enter Employee Salary : ");
				int employee_salary = sc.nextInt();
				
				switch(ch) {
				case 1:
					System.out.println("Enter Manager Bonus : ");
					int bonus = sc.nextInt();
					arr[i] = new Manager(employee_id, employee_name, employee_salary, bonus);
					i++;
					break;
					
				case 2:
					System.out.println("Enter Developer Hours : ");
					int hours = sc.nextInt();
					arr[i] = new Developer(employee_id, employee_name, employee_salary, hours);
					i++;
					break;
				}
			}
			
			else {
				System.out.println("Array is full please exit with 0 : ");
			}
			System.out.println("Enter 1 to continue else 0 : ");
		}while(sc.nextInt() == 1);
			
		return arr;
	}
	
	
	
	public boolean validate(Employee[] employee_object,Employee a,int i) {
		boolean condition = true;
		for(int j = 0; j < employee_object.length; j++) {
			if(j == i) {
				continue;
			}
			if(a.equals(employee_object[j])) {
				condition = false;
				break;
			}
		}
		return condition;
	}
	
	
	
	public void display(Employee[] employee_reference) {
		for(Employee e: employee_reference) {
			System.out.println(e);
		}
	}
	
}
























