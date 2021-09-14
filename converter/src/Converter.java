public class Converter{
	float result;
	public void rupeeToDollar(float amount) {
		result = amount / 74;
		System.out.println("Rupee = " + amount + "\n" + "Dollar = " + result);
	}
	
	public void dollarToRupee(float amount) {
		result = amount * 74;
		System.out.println("Rupee = " + amount + "\n" + "Dollar = " + result);
	}
}