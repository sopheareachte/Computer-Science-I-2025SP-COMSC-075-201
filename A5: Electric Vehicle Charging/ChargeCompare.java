/*
 * Sopheareach Te
 * Feb 19, 2025
 * ChargeCompare.java
 * Prompt user for minute of charging
 * Display the price for charging for EV Dynamics and Elektracharge 
 * company
 * Display whether the price is the same or which company price is 
 * cheaper
 * 
 */

import java.util.Scanner;

public class ChargeCompare {
	
	//Calculate cost of charging based on the company price 
	//and minute limit 
	public static double calculateCost(int chargeMinute, int limitMinute, 
		int basePrice, int limitPrice){
		
		double cost = 0.0;
		
		if (chargeMinute > limitMinute) {
			//calculate the cost with premium price after it goes over
			//the minute limit
			cost = (limitMinute * basePrice) 
					+ ((chargeMinute - limitMinute) * limitPrice);
		} else {
			//Calculate the charging price based on charge minute
			cost = chargeMinute * basePrice;
		}
		
		//return the cost in dollar
		return cost / 100;
	}
	
	public static void main (String[] args) {
		//minute limit and prices for EV dynamics company
		final int EV_MIN_LIMIT = 15;
		final int EV_BASE_PRICE = 27;
		final int EV_LIMIT_PRICE = 30;
		
		//minute limit and prices for Elektracharge
		final int ELEKTRA_MIN_LIMIT = 20;
		final int ELEKTRA_BASE_PRICE = 25;
		final int ELEKTRA_LIMIT_PRICE = 35;
		
		//Create a Scanner object for input
		Scanner input = new Scanner(System.in);
		
		//Prompt user for minute of charging
		System.out.print("Enter number of minutes you want to charge" 
							+ "your vehicle: ");
		int chargeMinute = input.nextInt(); 
		
		//check if charging minute is negative
		if (chargeMinute < 0){
			System.out.println("You can not have negative minutes.");
		} else {
			//calculate the price of charging for EV dynamics company
			double costED = calculateCost(chargeMinute, EV_MIN_LIMIT, 
										EV_BASE_PRICE, EV_LIMIT_PRICE);
										
			//Display the cost with two decimal points format
			System.out.printf("Cost for EV Dynamics:   $%.2f%n", costED);
			
			//calculate the price of charging for Elektracharge company
			double costEC = calculateCost(chargeMinute, ELEKTRA_MIN_LIMIT,
								ELEKTRA_BASE_PRICE, ELEKTRA_LIMIT_PRICE);
								
			//Display the cost with two decimal points format
			System.out.printf("Cost for ElektraCharge: $%.2f%n", costEC);
			
			//Compare the price between EV dynamics and Elektracharge
			if (costED == costEC) {
				System.out.println("The price is the same.");
			} else if (costED > costEC){
				System.out.println("ElektraCharge is cheaper.");
			} else {
				System.out.println("EV Dynamics is cheaper.");
			}
		}
		
		//Close Scanner object
		input.close();
	}
}

