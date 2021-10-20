
public class Main {

	public static void main(String[] args) {
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		String operator = args[2];
		
		if(operator.equals("+")) {
			System.out.println( n1 + n2);
		}
		
		else if(operator.equals("-")) {
			System.out.println( n1 - n2);
		}
		
		else if(operator.equals("*")) {
			System.out.println( n1 * n2);
		}
		
		else if(operator.equals("/")) {
			System.out.println( n1 / n2);
		}
		else {
			System.out.println("Please Enter proper operator");
		}

	}

}
