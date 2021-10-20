
public class SportCar extends Car{
	String airBallonType = "2 Air";
	@Override
	public void drive(int speed,int noOfGear) {
		System.out.println("Sports car");
		System.out.println("Speed : " + speed + "\n" + "No of Gear : " + noOfGear);
	}
	
	@Override
	public void display(){
		System.out.println("Type : " + airBallonType);
	}
}
