
public class Abstract_main {

	public static void main(String[] args) {
		 Shape_different_approach[] sda = new Shape_different_approach[5];
		 sda[0] = new Rectangle_abstract_approach(10, 20);
		 sda[1] = new Circle_abstract_approach(2);
		 sda[2] = new Rectangle_abstract_approach(20, 30);
		 sda[3] = new Circle_abstract_approach(2);
		 sda[4] = new Rectangle_abstract_approach(5, 40);
		 
		 display(sda);
	}
	
	public static void display(Shape_different_approach[] arr) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] instanceof Circle_abstract_approach) {
				System.out.println("Circle Area : ");
				arr[i].find_area_abstract();
			}
			
			else if(arr[i] instanceof Rectangle_abstract_approach) {
				System.out.println("Rectangle Area : ");
				arr[i].find_area_abstract();
			}
		}
	}

}
