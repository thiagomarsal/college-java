/*
Class: Lab-6c
Name: Francis Rimoli and Thiago Marsal
Date: 14-Feb-2021
Description: isBetween()
Instructor Name: Jeff Light
*/

package week6;

import java.util.Scanner; //import class to get user's input

public class Lab6c {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); //using Scanner to get user's input
		String userInput;
		int lowNumber = 0, testedNumber = 0, highNumber = 0;
		boolean exitGame, validInt, validAnswer;
		
		System.out.println("\nThis program will ask the user for 3 numbers and determine if the second number lies between the first and the third.");

		// Game Primary Loop: Stay in the loop while the user wishes to play	
		exitGame = false;
		do {
			// Numeric Input Validation loop: Stay in the loop until user enters a valid Integer 
			validInt = false;
			do {
            	System.out.print("\nPlease enter the low number: ");
            	userInput = in.nextLine();

                try {
                    lowNumber = Integer.parseInt(userInput);
                    validInt = true;
                } catch (Exception e) {
                    System.out.println("Invalid Response: Please enter a whole number.\n");
                }
            } while (!validInt);

			// Numeric Input Validation loop: Stay in the loop until user enters a valid Integer 
			validInt = false;
			do {
            	System.out.print("Please enter the number to be tested (the between number): ");
            	userInput = in.nextLine();

                try {
                    testedNumber = Integer.parseInt(userInput);
                    validInt = true;
                } catch (Exception e) {
                    System.out.println("Invalid Response: Please enter a whole number.\n");
                }
            } while (!validInt);
		
			// Numeric Input Validation loop: Stay in the loop until user enters a valid Integer 
			validInt = false;
			do {
            	System.out.print("Please enter the high number: ");
            	userInput = in.nextLine();

                try {
                    highNumber = Integer.parseInt(userInput);
                    validInt = true;
                } catch (Exception e) {
                    System.out.println("Invalid Response: Please enter a whole number.\n");
                }
            } while (!validInt);

			// Check if the number entered by the user to be tested is between low number and high number entered
			if (isBetween(lowNumber, testedNumber, highNumber))
				System.out.println("\n" + testedNumber + " lies between the numbers " + lowNumber + " and " + highNumber + ".");
			else
				System.out.println("\n" + testedNumber + " DOES NOT lie between the numbers " + lowNumber + " and " + highNumber + ".");
			
			// Non-Numeric Input Validation loop: Stay in the loop until user enters a valid "Y" or "N"						
    		validAnswer = false;
    		do {
				System.out.print("\nWould you like to play again? (Y/N): ");
				userInput = in.nextLine();
				if (userInput.equalsIgnoreCase("Y") || userInput.equalsIgnoreCase("N"))
					validAnswer = true;
				else
					System.out.println("Invalid Response: Please answer with a 'Y' or 'N'.");
			}
			while (!validAnswer);
			
			// Check if user want to play again or not
    		if (userInput.equalsIgnoreCase("N"))
    			exitGame = true;
    					
		} while (!exitGame);			

	}
	
    // Method check if the second argument is between the first and the second arguments
	public static boolean isBetween(int num1, int num2, int num3) {
		if ((num2 > num1) && (num2 < num3))
			return true;
		else
			return false;
	}

}
