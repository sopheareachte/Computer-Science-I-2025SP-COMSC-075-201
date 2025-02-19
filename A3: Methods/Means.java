/*
 * Sopheareach Te
 * Feb 05, 2025
 * Means.java
 * Prompt user for three numbers
 * Calculate Arithmetic Mean and print it
 * Calculate Geometric Mean and print it
 * Calculate Harmonic Mean and print it
 * 
 */

import java.util.Scanner;

public class Means {
	//Calculate arithmetic mean of three numbers
	public static double getArithmeticMean(double num1, double num2, 
											double num3) {

		return (num1 + num2 + num3) / 3;
	}
	
	//Calculate geometric mean of three numbers
	public static double getGeometricMean(double num1, double num2, 
											double num3) {
			
		return Math.pow(num1 * num2 * num3, 1.0 / 3.0);
	}
	
	//Calculate the reciprocal of a number
	public static double getReciprocal(double x) {
		return 1.0 / x;
	}
	
	//Calculate harmonic mean of three numbers
	public static double getHarmonicMean(double num1, double num2, 
										double num3) {
			
		double reciprocal1 = getReciprocal(num1);
		double reciprocal2 = getReciprocal(num2);
		double reciprocal3 = getReciprocal(num3);
		
		double arithmeticMean = getArithmeticMean(reciprocal1,
								reciprocal2, reciprocal3);
		 		
		return getReciprocal(arithmeticMean);
	}
	
	public static void main (String[] args) {
		//prompt user for three numbers for calculations
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first number: ");
		double num1 = input.nextDouble();
		System.out.print("Enter second number: ");
		double num2 = input.nextDouble();
		System.out.print("Enter third number: ");
		double num3 = input.nextDouble();
		
		//call arithmeticMean to do calculation and print it
		System.out.printf("Arithmetic mean: %.2f%n", 
				getArithmeticMean(num1, num2, num3));
				
		//call geometricMean to do calculation and print it		
		System.out.printf("Geometric mean:  %.2f%n", 
				getGeometricMean(num1, num2, num3));
				
		//call harmonicMean to do calculation and print it
		System.out.printf("Harmonic mean:   %.2f%n", 
				getHarmonicMean(num1, num2, num3));

		input.close();
	}
}
