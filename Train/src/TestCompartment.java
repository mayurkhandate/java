import java.util.*;
public class TestCompartment {

	public static void main(String[] args) {
		Compartment[] c = new Compartment[10];
		int max = 5;
		int min = 1;
		int i = 0;
		
		while(i < 10) {
			int randomNumber = (int) (Math. random()*(max-min)) + min; 
			
			switch(randomNumber) {
			case 1:
				c[i] = new FirstClass();
				break;
				
			case 2:
				c[i] = new Ladies();
				break;
				
			case 3:
				c[i] = new General();
				break;
				
			case 4:
				c[i] = new Luggage();
				break;
			}
			i++;
		}
		display(c);

	}
		public static void display(Compartment[] i) {
			for(Compartment a: i) {
				if(a instanceof FirstClass) {
					a.notice();
				}
				else if(a instanceof Ladies) {
					a.notice();
				}
				else if(a instanceof Luggage) {
					a.notice();
				}
				
				else if(a instanceof General) {
					a.notice();
				}
			}
		}

}
