/*
 * Sopheareach Te
 * March 24, 2025
 * ArrayReverse.java
 * 
 * Initialize four different arrays
 * Empty array, one element array, even number element array and
 * odd number element array
 * Create method reverseInPlace to take an integer array. reverse the 
 * value of the array
 * Create method reverseAndDisplay to take an integer array. 
 * Print the original array value, call reverseInPlace to reverse value,
 * Then print the reversed array
 * 
 */

import java.util.Arrays;

public class ArrayReverse {
	
	//Take an integer array. reverses the order of the items in the 
	//array–in place 
	public static void reverseInPlace(int[] numArray) {
		int j = numArray.length - 1;
		for (int i = 0; i < j; i++) {
			//store value of the array from the right side temporary
			int temp = numArray[i];
			
			//Assign value of the array from the left to the array from 
			//the right side
			numArray[i] = numArray[j];
			
			//Assign the temporary stored value of the array from the 
			//right side to the left side
			numArray[j] = temp;
			
			//decrease value of the length of the array to swap the next
			//array value
			j--;
		}
	}
	
	//Take an integer array. print the original array, 
	//call reverseInPlace to reverse value, print the reversed array
	public static void reverseAndDisplay(int[] numArray){
		System.out.println("  before: " + Arrays.toString(numArray));
		reverseInPlace(numArray);
		System.out.println("  after:  " + Arrays.toString(numArray));
		System.out.println();
	}
	
	public static void main (String[] args) {
		//Initialize an empty array with no elements, reverse the array
		//Display the reversed array
		int[] arr1 ={};
		System.out.println("Empty array");
		reverseAndDisplay(arr1);
		
		//Initialize an array with one element, reverse the array
		//Display the reversed array
		int[] arr2 = {15};
		System.out.println("One-element array");
		reverseAndDisplay(arr2);
		
		//Initialize an array with even number of elements 
		//reverse the array and display the reversed array
		int[] arr3 = {10, 66, 47, 11, 505, 217};
		System.out.println("Even # of elements array");
		reverseAndDisplay(arr3);
		
		//Initialize an array with odd number of elements
		//reverse the array and display the reversed array
		int[] arr4 = {10, 2, 4, 7, 11};
		System.out.println("Odd # of elements array");
		reverseAndDisplay(arr4);
	}
}

