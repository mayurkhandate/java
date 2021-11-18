
public class Jet extends FlyableVariables implements Flyable{

	public Jet(int topSpeed, int startSpeed, String engine) {
		super(topSpeed, startSpeed, engine);
		this.topSpeed = topSpeed;
		this.startSpeed = startSpeed;
		this.engine = engine;
	}

	@Override
	public int topSpeed() {
		
		return topSpeed;
	}

	@Override
	public int startSpeed() {
		
		return startSpeed;
	}

	@Override
	public String engine() {
		
		return engine;
	}
	
}
