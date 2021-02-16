package javaClassesObjects2;

public class MagicCalculator extends Calculator {
	public static void main(String args[]) {
		// finds the factorial
		int i;
		int fact = 1;
		int num = 5; // number to use to calculate

		for (i = 1; i <= num; i++) {
			fact = fact * i;
		}

		System.out.println("Factorial of " + num + " is " + fact);

		Calculator calculator = new Calculator();

		// calling the square method from the Calculator class
		int sqNum = calculator.square(num);
		int sqRt = (int) Math.sqrt(sqNum);
		System.out.println("Square root of " + sqNum + " is " + sqRt);

		// finds the sine, cosine, and tangent
		double degrees = 45.0;
		double radians = Math.toRadians(degrees); // convert degrees to radians

		// prints the sine, cosine, and tangent values
		System.out.println("sin(" + degrees + ") = " + Math.sin(radians));
		System.out.println("cos(" + degrees + ") = " + Math.cos(radians));
		System.out.println("tan(" + degrees + ") = " + Math.tan(radians));
	}
}
