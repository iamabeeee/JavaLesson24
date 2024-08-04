package day3;

import java.util.Scanner;

public class ActionItem {
	    public static void main(String[] args) {
	        // Create a Scanner object to read input
	        Scanner scanner = new Scanner(System.in);
	        
	        // Prompt the user for input
	        System.out.print("Enter a non-negative integer to calculate its factorial: ");
	        int number = scanner.nextInt();
	        
	        // Close the scanner
	        scanner.close();
	        
	        if (number < 0) {
	            System.out.println("Factorial is not defined for negative numbers.");
	        } else {
	            for (int i = 1; i <= number; i++) {
	            }
	            // Display the result
	       
	        }
	        
	    }
	}