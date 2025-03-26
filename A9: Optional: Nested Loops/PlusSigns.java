/*
 * Sopheareach Te
 * March 17, 2025
 * PlusSigns.java
 * 
 * Prompt user for a number between 1-10 
 * Display an inverted "triangle of plus signs" row based on the number
 * 
 */

import java.util.Scanner;

public class PlusSigns {
	
	// Takes Scanner input. Reads in a integer. Keeps reading
    // integers until the user enters a number between 1 and 10. Return
    // the number
	public static int getNumber(Scanner input) {
		System.out.print("Enter a number between 1-10: ");
		int num = input.nextInt();
		
		while(num < 1 || num > 10) {
			System.out.println("Input is invalid.");
			System.out.print("Enter a number between 1-10: ");
			num = input.nextInt();
		}
		
		return num;
	}
	
	public static void main (String[] args) {
		
		//Create Scanner object for input
		Scanner input = new Scanner(System.in);
		
		//Prompt user for input between 1 to 10 
		int num = getNumber(input);
		
		//loop to create an inverted triangle based on the user input
		for(int row = 0; row < num; row++){
			System.out.println();
			for(int space = 0; space < row; space++){
				System.out.print(" ");
			}
			for(int sign = row * 2 + 1; sign < num * 2; sign++){
				System.out.print("+");
			}
			
		}
		
		//Close Scanner object
		input.close();
	}
}

