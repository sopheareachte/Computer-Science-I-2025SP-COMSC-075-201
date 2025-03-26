/*
 * Sopheareach Te
 * March 10, 2025
 * Statistics.java
 * 
 * Repeatly prompt user for item price until user input -1 to stop
 * Calculate the average price and display it with 2 decimal point format
 * Calculate the standard deviation and display it with 2 decimal 
 * point format
 * If there is no item, then alert user about it
 * If there is only one item, then calculate only average price
 */

import java.util.Scanner;

public class Statistics {
	
	public static void main (String[] args) {
		
		//Create scanner object
		Scanner input = new Scanner(System.in);
		
		//Initialize variables for price and to track of number of item, 
		//sum of price and sum of square price
		double price = 0.0;
		int n = 0;
		double sum = 0.0;
		double sumSquare = 0.0;
		
		System.out.print("Enter first price, or -1 to quit: $");
		price = input.nextDouble();
		
		//Continue prompting user for more price inputs
		//until the input equals to negative one 
		while (price != -1) {
						
			//Calculate sum to keep track number of item, price and
			//square price
			sum += price;
			sumSquare += Math.pow(price, 2);
			n++;
			
			//Prompt user for input
			System.out.print("Enter next price, or -1 to quit: $");
			price = input.nextDouble();
			
		}
		
		
		//Display number of items
		System.out.printf("Number of items: %d%n", n);
		
		//Check if there is no item then alert user
		if (n == 0) {
			System.out.println("No data entered. Cannot calculate "
								+ "statistics.");
		} else {
			//Calculate the average price and display the result
			//in 2 decimal point format
			double average = sum / n;
			System.out.printf("Average price is $%,.2f%n", average);
			
			if (n == 1) {
				//If there is only one item, then standard deviation
				//can't be calculated
				System.out.println("Cannot calculate standard deviation " 
									+ "for one item.");
			} else {
				//Calculate standard deviation
				double numerator = n * sumSquare - Math.pow(sum, 2);
				double denominator = n * (n - 1);
				double deviation = Math.pow((numerator / denominator), 0.5);
				
				//Display standard deviation and format it in 2 decimal
				//point
				System.out.printf("Standard deviation of prices is " 
									+ "$%,.2f%n", deviation);
			}
		}
		
		//Close scanner object
		input.close();
	}
}

