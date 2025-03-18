/*
 * Sopheareach Te
 * Feb 24, 2025
 * Triangle.java
 * Prompt user for lengths of three sides of a triangle
 * compute the perimeter of the triangle if the input is valid
 * Display the perimeter with 1 decimal point format
 */

import java.util.Scanner;

public class Triangle {
	
	// Takes Scanner input. Reads in a double. Keeps reading
    // doubles until the user enters a postive entry. Return
    // the number
	public static double getLength(Scanner input) {
		System.out.print("Enter the length of a side of the triangle: ");
		double length = input.nextDouble();
		
		// Continue entering numbers until the number is positive
		while (length <= 0) {
			System.out.print("The length must be positive. Try again: ");
			length = input.nextDouble();
		}
		
		return length;
	}
	
	//Take the length of three sides of the triangle. Return True 
	//if triangle is valid by comparing sum of two sides to the 
	//remaining side. Otherwise, return False
	public static boolean isValidTriangle(double side1, double side2, 
											double side3) {
			//Compare sum of two sides to the remaining side
			boolean condition1 = (side3 + side2) > side1; 
			boolean condition2 = (side1 + side3) > side2;
			boolean condition3 = (side1 + side2) > side3;
			
			//Check all conditions to see if triangle is valid 
			boolean validTriangle = condition1 && condition2 && condition3;
			
			return validTriangle;
	}
	
	public static void main (String[] args) {
		
		//Create a Scanner object for input
		Scanner input = new Scanner(System.in);
		
		//Prompt user for length of the three sides of the triangle
		double side1 = getLength(input);
		double side2 = getLength(input);
		double side3 = getLength(input);
		
		//Check to see triangle is valid
		if (isValidTriangle(side1, side2, side3)) {
			//Calculate the perimeter of the triangle
			double perimeter = side1 + side2 + side3;
			
			//Display the perimeter of the triangle with 1 decimal point
			System.out.printf("The perimeter of the triangle is %.1f.%n",
								perimeter);
		} else {
			System.out.println("Those sides do not specify a valid" 
								+ " triangle.");
		}
		
		//Close Scanner object
		input.close();
	}
}

