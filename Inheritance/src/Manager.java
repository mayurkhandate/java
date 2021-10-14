
public class Manager extends Employee{
	private int manager_bonus;

	public Manager(int employee_id,String employee_name,int employee_salary,int manager_bonus) {
		super(employee_id,employee_name,employee_salary);
		this.manager_bonus = manager_bonus;
	}

	public int getManager_bonus() {
		return manager_bonus;
	}

	public void setManager_bonus(int manager_bonus) {
		this.manager_bonus = manager_bonus;
	}

	
	
	
	
//	by default equals methods checks the address so we have to override to check contains
	@Override
	public boolean equals(Object obj) {
//		downgrade manager class to use 
		
		Manager m = (Manager)obj;
		
		
		if(this.getEmployee_id() == m.getEmployee_id()) {
			
			return true;
		}
		
		return false;
		
	}
	
	
	
	@Override
	public String toString() {
		return getEmployee_id() + "\t" + getEmployee_name() + "\t" + getEmployee_salary() + "\t" + getManager_bonus();
	}
	
	
	
}

