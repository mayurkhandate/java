import java.util.Scanner;

public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "ab";
		String arr[] = new String[] {"a","abc","ab"};
		String s2 = new String("ab");
		
		for(int i = 0; i < arr.length; i++) {
			if(s == arr[i]) {
				System.out.println(i + "equals");
			}
		}
	}

}




/*


import java.util.*;

public class Info {
	Scanner sc = new Scanner(System.in);
	
	public Employee[] create() {
		
		System.out.println("Enter no of employee you want to create : ");
		int n = sc.nextInt();
		
		Employee arr[] = new Employee[n];
		
		int employee_id_arr[] = new int[n];
		int i = 0;

		do {
			System.out.println("1.Manager \n2.Developer \n");
			int ch = sc.nextInt();
			if(i < n) {
				System.out.println("Enter employee Details \n\n");
				
				System.out.println("Enter Employee ID : ");
				int employee_id = sc.nextInt();
				
				employee_id_arr[i] = employee_id;
				System.out.println(employee_id_arr[0]);
				System.out.println(employee_id);
				employee_id = validate(employee_id_arr,employee_id,i);
				
				employee_id_arr[i] = employee_id;

				
				System.out.println("Enter Employee Name : ");
				String employee_name = sc.next();
				
				System.out.println("Enter Employee Salary : ");
				int employee_salary = sc.nextInt();
				
				if(ch == 1) {
					System.out.println("Enter bonus : ");
					int bonus = sc.nextInt();
					Manager manager_object = new Manager(employee_id,employee_name,employee_salary,bonus);
					arr[i] = manager_object;
					i++;
			
				}
				else if(ch == 2){
					System.out.println("Enter No of hours : ");
					int hours = sc.nextInt();
					Developer developer_object = new Developer(employee_id,employee_name,employee_salary,hours);
					arr[i] = developer_object;
					i++;
				}
			}
			else {
				System.out.println("Array is full please exit with 0 : ");
			}
			
			System.out.println("Enter 1 to continue : ");
		}while(sc.nextInt() == 1);
		
		
		return arr; 
	}
	
	public int validate(int[] emp_object_ids,int employee_id,int i) {
		
		int id = employee_id;
		
		for(int a = 0; a < i; a++) {
//			by default equals methods checks the address so we have to override to check contains
//			if(emp_object.equals(emp_object)) {
//				condition = false;
//				System.out.println(condition);
//				break;
//			}
//			System.out.println(a);
			if(emp_object_ids[a] == employee_id) {
				id = next_validate();
				validate(emp_object_ids,id,i);
			}
			else {
				id = employee_id;
			}
			
		}
		
		return id;
	}
	
	
	
	public int next_validate() {
		System.out.println("please enter new id this id exists ");
		int id = sc.nextInt();
		return id;
	}
	
	
	public void display(Employee[] emp_obj) {
		for(Employee a: emp_obj) {
			System.out.println(a);
		}
		
	}
}

























/*
public static void display(Employee emp_obj,String profession) {
	
	System.out.println(emp_obj);
	

	System.out.println(profession + " " + emp_obj.getEmployee_id());
	System.out.println(profession + " " + emp_obj.getEmployee_name());
	System.out.println(profession + " " + emp_obj.getEmployee_salary());
	
	if(emp_obj instanceof Manager) {
		Manager m = (Manager)emp_obj;
		System.out.println(profession + "Bonus : " + m.getManager_bonus());
	}
	
	if(emp_obj instanceof Developer) {
		Developer d = (Developer)emp_obj;
		System.out.println(profession + "Hours : " + d.getHours());

	}

}
*/

