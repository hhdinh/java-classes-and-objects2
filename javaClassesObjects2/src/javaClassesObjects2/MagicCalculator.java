package javaClassesObjects2;

import java.util.Scanner;

public class MagicCalculator extends Calculator {
	public static void main(String args[]) {
		Calculator calculator = new Calculator();
		Scanner scanner = new Scanner(System.in);

		// finds the factorial
		System.out.print("Enter a number: ");
		int num = scanner.nextInt();
		int i;
		int fact = 1;

		for (i = 1; i <= num; i++) {
			fact = fact * i;
		}

		System.out.println("Factorial of " + num + " is " + fact);

		// calling the square method from the Calculator class
		int sqNum = calculator.square(num);
		int sqRt = (int) Math.sqrt(sqNum);
		System.out.println("Square root of " + sqNum + " is " + sqRt + "\n");

		// finds the sine, cosine, and tangent
		System.out.print("Enter angle in degrees: ");

		double degrees = scanner.nextInt();
		double radians = Math.toRadians(degrees); // convert degrees to radians

		scanner.close();

		// prints the sine, cosine, and tangent values
		System.out.println("sin(" + degrees + ") = " + Math.sin(radians));
		System.out.println("cos(" + degrees + ") = " + Math.cos(radians));
		System.out.println("tan(" + degrees + ") = " + Math.tan(radians));
	}
}
