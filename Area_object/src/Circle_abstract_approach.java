
public class Circle_abstract_approach implements Shape_different_approach {
	private float r;

	public Circle_abstract_approach(float r) {
		super();
		this.r = r;
	}
	
	
	@Override
	public void find_area_abstract(){
		float area = 3.14f * r * r;
		System.out.println("Rectangle Area : " + area);
	}
}
