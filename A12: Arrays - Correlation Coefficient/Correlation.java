/*
 * 
 * Sopheareach Te
 * March 26, 2025
 * Correlation.java
 * 
 * Given two equal-length arrays of double, compute and
 * print the Pearson correlation coefficient of the arrays.
 * This is a measure of the linear relationship between the arrays.
 * 
 */

import java.util.Scanner;

public class Correlation {
	
	/*
	* getDeviations() takes an array of double and
	* returns a new array of double with the original data's
	* deviations from the mean.
	*/
	public static double[] getDeviations(double[] data) {
		double total = 0.0;
		
		for (int i = 0; i < data.length; i++) {
			total += data[i];
		}
		
		double mean = total / data.length;
		double[] result = new double[data.length];
		
		for (int i = 0; i < data.length; i++) {
			result[i] = data[i] - mean;
		}
		
		return result;
		
	}
	
	/*
	* sumOfSquares() takes an array of double and returns the
	* sum of the squared elements.
	*/
	public static double sumOfSquares(double[] data) {
		double total = 0.0;
		
		for (int i = 0; i < data.length; i++) {
			total += data[i] * data[i];
		}
		
		return total;
	}
	
	/*
	* getCorrelation() takes two arrays of double
	* as its parameters and returns the correlation
	* coefficient.
	*/
	public static double getCorrelation(double[] x, double[] y) {
		double[] xDeviations = getDeviations(x);
		double[] yDeviations = getDeviations(y);
		
		double numerator = 0.0;
		
		for (int i = 0; i < xDeviations.length; i++) {
			numerator += xDeviations[i] * yDeviations[i];
		}
		
		double xSumOfSquares = sumOfSquares(xDeviations);
		double ySumOfSquares = sumOfSquares(yDeviations);
		
		double denominator = Math.pow(xSumOfSquares, 0.5) * Math.pow(ySumOfSquares, 0.5);
		
		double r = numerator / denominator;
		
		return r;
	}
	
	// readArray() takes a Scanner and a number
	// of items as its parameters and returns an array of double
	public static double[] readArray(Scanner input, int num) {
		
		double[] arr = new double[num];
		
		for (int i = 0; i < num; i++) {
			arr[i] = input.nextDouble();
		}
		
		return arr;
	}
	
	public static void main (String[] args) {
		
		//Create Scanner object for input
		Scanner input = new Scanner(System.in);
		
		// prompt for and read the number of items
		System.out.print("Enter number of elements in each array: ");
		int nItems = input.nextInt();
		
		// prompt for and read the number for first array
		System.out.printf("Enter the %d elements in the first array: ", 
							nItems);
		double[] x = readArray(input, nItems);
		
		// prompt for and read the number for second array
		System.out.printf("Enter the %d elements in the second array: ", 
							nItems);
		double[] y = readArray(input, nItems);
		
		//Call getCorrelation to calculate correlation coefficient
		double correlation = getCorrelation(x, y);
		
		//print correlation coefficient with 3 digits format
		System.out.printf("The correlation coefficient is %.3f.%n", correlation);
		
		//Close Scanner object
		input.close();
		
	}
}

