
public class KTM extends Car implements Bike{
	private int noOfCC;
	public KTM(String brand, String model, String color, double price,int noOfCC) {
		super(brand, model, color, price);
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.noOfCC = noOfCC;
	}

	@Override
	public String getBrand() {
		
		return brand;
	}

	@Override
	public String getModel() {
		
		return model;
	}

	@Override
	public String getColor() {
		
		return color;
	}

	@Override
	public double getPrice() {
		
		return price;
	}

	@Override
	public int getCC() {
		
		return noOfCC;
	}
}

