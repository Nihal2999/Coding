package exceptionHandling;

public class Arithmetic {
	
	public static void main(String[] args) {
		
		try {
			int a = 10/0;
		}
		
		catch(ArithmeticException e) {
			
			System.out.println("can't divide by zero");
		}
	}
}