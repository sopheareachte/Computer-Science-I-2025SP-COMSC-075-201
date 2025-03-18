/*
 * Sopheareach Te
 * Feb 19, 2025
 * Shipping.java
 * Prompt user for weight of the package
 * Display the shipping cost based on the weight of the package
 * When weight input is equal or less than zero 
 * then display the message "weight must be greater than zero"
 * When weight input is more than twenty five 
 * then display the message "Cannot ship - maximum weight is 25 pounds."
 * 
 */

import java.util.Scanner;

public class Shipping {
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter weight of package in pounds: ");
		double weight = input.nextDouble();
		
		double cost = 0.0;
		
		if (weight <= 0) {
			System.out.println("Weight must be greater than zero.");
		} else if (weight <= 25) {
			//set the cost based on the weight
			if (weight <= 2) {
				cost = 3.5;
			} else if (weight <= 8) {
				cost = 5.7;
			} else if (weight <= 17) {
				cost = 9.5;
			} else if (weight <= 25) {
				cost = 12.35;
			}
			System.out.printf("Cost: $%.2f%n", cost);
		} else {
			System.out.println("Cannot ship - maximum weight is 25 pounds.");
		}
		
		input.close();
	}
}
//algebra
//405+30(x-15)=500+35(x-20)
//405 + 30x - 450 = 500 + 35x - 700
//30x - 45 = 35x -200
//5x = 155
//x = 31 when price is the same 
//if less than 31 then Elektra charge is cheaper
//if more than 31 then EV dynamics charge is cheaper
