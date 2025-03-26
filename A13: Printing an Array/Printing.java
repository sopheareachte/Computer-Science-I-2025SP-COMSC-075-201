/*
 * 
 * Sopheareach Te
 * March 26, 2025
 * Printing.java
 * 
 * Write three versions of a void method named printDoubleArray().
 * This will be an overloaded method.
 *
 * The first version takes one parameter: the array.
 * It prints the array with entries separated by commas, inside
 * square brackets.
 *
 * The second version takes two parameters: the array and the number of
 * items to print per line. It prints the array inside square brackets,
 * with entries separated by commas. The method prints the given number
 * of items on each line. The end of each line should not have a comma.
 *
 * The third version takes three parameters: the array, the number of
 * items to print per line, and the format string to use for each entry.
 * It does the same as the second version, except that each item is
 * printed using the format string.
 */


public class Printing {
	
	public static void printDoubleArray(double[] data) {
		
		System.out.print("[");
		
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]);
			
			if (i + 1 < data.length) {
				System.out.print(", ");
			}
		}
		
		System.out.println("]");
	}
	
	public static void printDoubleArray(double[] data, int len) {
		
		System.out.print("[");
		
		for (int i = 1; i <= data.length; i++) {
			System.out.print(data[i-1]);
			
			if (i % len == 0 && i != data.length) {
				System.out.printf("%n ");
			} else if (i < data.length) {
				System.out.print(", ");
			}
		}
		
		System.out.println("]");
	}
	
	public static void printDoubleArray(double[] data, int len, 
										String format) {
		
		System.out.print("[");
		
		for (int i = 1; i <= data.length; i++) {
			System.out.printf(""+format, data[i-1]);
			
			if (i % len == 0 && i != data.length) {
				System.out.printf("%n ");
			} else if (i < data.length) {
				System.out.print(", ");
			}
		}
		
		System.out.println("]");
	}
	
	public static void main (String[] args) {
		double[] testData = {1.0, 3.2578, 4.88, 113.3874, 20.4013,
		-18.12, 5.55721, -87.492};
		
		printDoubleArray(testData);
		System.out.println("---------------");
		
		printDoubleArray(testData, 4);
		System.out.println("---------------");
		
		printDoubleArray(testData, 5);
		System.out.println("---------------");
		
		printDoubleArray(testData, 4, "%6.2f");
	}
}

