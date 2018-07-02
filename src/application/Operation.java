package application;

public class Operation {
	public double add(double num1, double num2) {
		return num1 + num2;
	}
	
	public double subtract(double num1, double num2) {
		return num1 - num2;
	}
	
	public double multiply(double num1, double num2) {
		return num1 * num2;
	}
	
	public double divide(double num1, double num2) {
		if(num2 == 0)
			throw new ArithmeticException("CANNOT DIVIDE BY 0 (Denominator = 0)");
		else
			return num1 / num2;
	}
}

