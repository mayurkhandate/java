
public class Rectangle_abstract_approach extends Shape_different_approach{
	private int length;
	private int breadth;

	public  Rectangle_abstract_approach(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}


	@Override
	public void find_area_abstract(){
		
		int area = length * breadth;
		System.out.println("Rectangle Area : " + area);
		
	}
}
