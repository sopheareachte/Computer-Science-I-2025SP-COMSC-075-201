/*
 * Sopheareach Te
 * March 19, 2025
 * Splitter.java
 * 
 * Prompt user for a string and a delimeter
 * Split the string based on the occurance of the delimeter
 * Display the result
 * 
 */

import java.util.Scanner;

public class Splitter {
	
	public static void main (String[] args) {
		
		//Create Scanner object for input
		Scanner input = new Scanner(System.in);	

		//Prompt user for a string
		System.out.print("Enter a string: ");
		String sentence = input.nextLine();
		
		//Prompt user for a delimeter
		System.out.print("Enter a delimeter: ");
		String delimeter = input.nextLine();
		
		int len = sentence.length();
		int deLen = delimeter.length();
		
		//loop through the string
		for(int i = 0; i < len; i++) {
			
			char c = sentence.charAt(i);
			
			if(len - i > deLen) {
				//compare part of the string based on the delimeter length
				if(!sentence.substring(i, i + deLen).equals(delimeter)) {
					System.out.print(c);
				} else {
					//skip the delimeter part of the string
					i = i + len - 1;
					System.out.printf("%n");
				}
			} else {
				//print the rest of string
				System.out.print(c);
			}
		}

		//Close scanner object
		input.close();
	}
}

