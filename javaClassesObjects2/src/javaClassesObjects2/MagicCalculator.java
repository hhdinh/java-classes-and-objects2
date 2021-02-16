package javaClassesObjects2;

import java.util.Scanner;

public class MagicCalculator extends Calculator {
	public static void main(String args[]) {
		Calculator calculator = new Calculator();
		Scanner scanner = new Scanner(System.in);

		// calling the add method from Calculator class
		System.out.print("Enter 2 numbers to add: ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();

		System.out.println("The sum is " + calculator.add(num1, num2) + "\n");

		// calling the subtract method from Calculator class
		System.out.print("Enter 2 numbers to subtract: ");
		int num3 = scanner.nextInt();
		int num4 = scanner.nextInt();

		System.out.println("The difference is " + calculator.subtract(num3, num4) + "\n");

		// calling the multiply method from Calculator class
		System.out.print("Enter 2 numbers to multiply: ");
		int num5 = scanner.nextInt();
		int num6 = scanner.nextInt();

		System.out.println("The product is " + calculator.multiply(num5, num6) + "\n");

		// calling the divide method from Calculator class
		System.out.print("Enter 2 numbers to divide: ");
		int num7 = scanner.nextInt();
		int num8 = scanner.nextInt();

		System.out.println("The quotient is " + calculator.divide(num7, num8) + "\n");

		// finds the factorial
		System.out.print("Enter a number to factorial: ");
		int num = scanner.nextInt();
		int i;
		int fact = 1;

		for (i = 1; i <= num; i++) {
			fact = fact * i;
		}

		System.out.println("Factorial of " + num + " is " + fact + "\n");

		// calling the square method from the Calculator class
		System.out.print("Enter a number to square: ");
		int sqNum = scanner.nextInt();
		System.out.println("Square of " + sqNum + " is " + calculator.square(sqNum) + "\n");

		// getting the square root
		System.out.print("Enter a number to square root: ");
		int sqRt = scanner.nextInt();
		System.out.println("Square root of " + sqRt + " is " + Math.sqrt(sqRt) + "\n");

		// finds the sine, cosine, and tangent
		System.out.print("Enter an angle in degrees: ");

		double degrees = scanner.nextInt();

		// convert degrees to radians
		double radians = Math.toRadians(degrees);

		// prints the sine, cosine, and tangent values
		System.out.println("sin(" + degrees + ") = " + Math.sin(radians));
		System.out.println("cos(" + degrees + ") = " + Math.cos(radians));
		System.out.println("tan(" + degrees + ") = " + Math.tan(radians));

		scanner.close();
	}
}
