
public class Circle extends Shape{
	private float r;

	public  Circle(float r) {
		super();
		this.r = r;
	}
	
	
	@Override
	public float find_area(){
		float area = 3.14f * r * r;

		return area;
	}
	
	
}
