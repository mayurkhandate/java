
public class Jaguar extends Car implements Automobile{

	
	public Jaguar(String brand, String model, String color, double price) {
		super(brand, model, color, price);
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.price = price;
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

}
