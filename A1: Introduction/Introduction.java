/*
* Sopheareach Te
* Jan 29, 2025
* Assignment 1: Introduction to Java
* This program will print my full name
* Print short poem with author name
* Print my age in years
* Print my moderate intensity exercise heart rate 
* Print my magic number 
* 
*/
 
public class Introduction {
	public static void main(String[] args){
		//Print my full name
		System.out.println("My name is Sopheareach Te.");
		System.out.println();
		
		//Print my favorite poem
		System.out.println("Fond are my feelings, yet unfeeling I feign,");
		System.out.println("Before our wine-cups, we merry-make in vain.");
		System.out.println("So heartful, the candle, our parting it grieves,");
		System.out.println("And in tears it melts, till the sky lights" 
							+ " again.");
		
		//Print the poem's author name
		System.out.println("    --Anonymous");
		System.out.println();
		
		//Print my age
		System.out.println("I am 25 years old.");
		
		//Print my moderate intensity exercise heartrate
		System.out.println("My moderate intensity exercise heart rate is " 
						+ (220 - 25) * 0.60 + ".");
		
		//Print my magic number
		System.out.println("My magic number is " + 7 * 12345679 * 9 + ".");
	}
}
 