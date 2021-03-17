package Gruver.Heather.Chapter7.Java.Project;

public class SimpleMath {
	
	 double divide(double numerator, double denominator) throws ArithmeticException {
		if(denominator == 0) {
			throw new ArithmeticException("Cannot divide by 0");
		}
		
		double result = numerator / denominator;
		return result;
	}
	 
	 double multiply(double number1, double number2) {
	 
	 double result = number1 * number2;
	 return result;
		}
}
