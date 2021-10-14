
public class Rectangle extends Shape{
	private int length;
	private int breadth;

	public  Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}





	@Override
	public float find_area(){
		
		int area = length * breadth;
		
		return area;
	}
}
