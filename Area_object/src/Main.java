
public class Main {

	public static void main(String[] args) {
		Shape s = null;
		s = new Rectangle(10,20);
		float result =  s.find_area();
		s.display(result);
		
		s = new Circle(3);
		float result2 = s.find_area();
		s.display(result2);

	}

}
