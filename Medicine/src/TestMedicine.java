import java.util.*;

public class TestMedicine {
	public static void main(String[] args) {
		Medicine[] m = new Medicine[10];
		
		int min = 1;
		int max = 4;
		int i = 0;
		while(i < 10) {
			int randomNumber = (int) (Math.random() * (max - min)) + min;
			switch(randomNumber) {
			case 1:
				m[i] = new Tablet();
				break;
				
			case 2:
				m[i] = new Syrup();
				break;
				
			case 3:
				m[i] = new Ointment();
				break;
				
			default:
				System.out.println("NOT IN ARRAY");
				break;
			
			}
			i++;
		}
		display(m);
	}
	
	public static void display(Medicine[] m) {
		for(Medicine a : m) {
			if(a instanceof Tablet) {
				a.displaLabel();
			}
			else if(a instanceof Syrup) {
				a.displaLabel();
			}
			else if(a instanceof Ointment) {
				a.displaLabel();
			}
		}
	}
}
