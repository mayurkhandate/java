
public class Developer extends Employee{
	private int hours;

	public Developer(int employee_id, String employee_name, int employee_salary, int hours) {
		super(employee_id, employee_name, employee_salary);
		this.hours = hours;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}
	
	
	
	public boolean equals(Object obj) {
//		downgrade manager class to use 
		
		Developer d = (Developer)obj;
		
		if(this.getEmployee_id() == d.getEmployee_id()) {
			
			return true;
		}
		
		return false;
		
	}
	
	
	@Override
	public String toString() {
		return getEmployee_id() + "\t" + getEmployee_name() + "\t" + getEmployee_salary() + "\t" + getHours();
	}

}
