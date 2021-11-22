
public class CalculationThradMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation cal = new Calculation(10, 20);
		CalculationThread cThread = new CalculationThread(cal);
		cThread.start();
	}

}
