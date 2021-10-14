import java.util.*;

public class Main {

//	half wrong code
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Info info_object = new Info();
		
		Employee[] emp_object = info_object.create();
		
		boolean emp_validate = true;
//		info_object.display(emp_object);
		for(int i = 0; i < emp_object.length; i++) {
			
		   emp_validate = info_object.validate(emp_object,emp_object[i],i);
		   if(!emp_validate) {
			   break;
		   }

		}
		
		if(emp_validate) {
			info_object.display(emp_object);
		}
		else {
			System.out.println("Employee exists please enter new Employee ID : ");
		}
	}
	
}
