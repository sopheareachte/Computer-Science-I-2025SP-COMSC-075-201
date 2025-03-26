/*
 * Sopheareach Te
 * March 17, 2025
 * Frequencies.java
 * 
 * Repeatly prompt user for a sentence
 * Check how many vowels, consonants, digits and "other" character
 * Display the number of vowels, consonants, digits and others
 * if user press enter, stop prompting and display total number of
 * vowels, consonants, digits and others
 * 
 */

import java.util.Scanner;

public class Frequencies { 
	
	//Take in number of vowel, consonant, digit and other
	//Display the number of vowels, consonants, digits and other
	public static void displayCounts(int vowel, int consonant, int digit,
									int other) {
		
		System.out.printf("Vowels:    %4d%n", vowel);
		System.out.printf("Consonants:%4d%n", consonant);
		System.out.printf("Digits:    %4d%n", digit);
		System.out.printf("Others:    %4d%n%n", other);									
	
	}
	
	public static void main (String[] args) {
		
		//Create scanner object for input
		Scanner input = new Scanner(System.in);
		
		//constant for checking vowels, consonants and digits
		final String VOWEL = "aeiouy";
		final String CONSONANT = "bcdfghjklmnpqrstvwxz";
		String sentence = "";
		
		//Initialize variables for total counts
		int totalVowel = 0;
		int totalConsonant = 0;
		int totalDigit = 0;
		int totalOther = 0;
		
		do {
			//Initialize variables for per-sentence-count
			int vowel = 0;
			int consonant = 0;
			int digit = 0;
			int other = 0;
		
			//Prompt user for a sentence
			System.out.print("Input a sentence (press just ENTER to quit): ");
			sentence = input.nextLine();	
			
			if (!sentence.isEmpty()) {
							
				//loop through the whole sentence to check each character 
				//in the sentence is a vowel or consonant or digit or other
				for (int i = 0; i < sentence.length(); i++) {
					
					char c = Character.toLowerCase(sentence.charAt(i));
					
					if (VOWEL.indexOf(c) >= 0) {
						vowel++;
					} else if (CONSONANT.indexOf(c) >= 0) {
						consonant++;
					} else if (Character.isDigit(c)) {
						digit++;
					} else {
						other++;
					}
				}
				
				//Display the number of vowels, consonants, digits and other
				displayCounts(vowel, consonant, digit, other);
				
				//Keep track of total vowels, consonants, digits and others
				//for all user inputs
				totalVowel += vowel;
				totalConsonant += consonant;
				totalDigit += digit;
				totalOther += other;
				
			}
		} while (!sentence.isEmpty());
		
		//Display the total vowels, consonants, digits and others
		//for all user inputs
		System.out.println("----------");
		System.out.println("Totals");
		displayCounts(totalVowel, totalConsonant, totalDigit, totalOther);
				
		//Close scanner object				
		input.close();
	}
}

