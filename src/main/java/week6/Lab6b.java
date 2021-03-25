/*
Class: Lab-6b
Name: Francis Rimoli and Thiago Marsal
Date: 10-Feb-2021
Description: power()
Instructor Name: Jeff Light
*/

package week6;

import java.util.Scanner;

public class Lab6b {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //using Scanner to get user's input
        String userInput;
        int firstNumber = 0, secondNumber = 0;
        boolean exitGame, validInt, validAnswer;

        // Game Primary Loop: Stay in the loop while the user wishes to play
        exitGame = false;
        do {
            System.out.println("\nThis program will ask the user for 2 numbers and raise the first number to the power of the second.\n");

            // Numeric Input Validation loop: Stay in the loop until user enters a valid Integer
            validInt = false;
            do {
                System.out.print("Please enter the first number: ");
                userInput = in.nextLine();

                try {
                    firstNumber = Integer.parseInt(userInput);
                    validInt = true;
                } catch (Exception e) {
                    System.out.println("Invalid Response: Please enter a whole number.\n");
                }
            } while (!validInt);

            // Numeric Input Validation loop: Stay in the loop until user enters a valid Integer
            validInt = false;
            do {
                System.out.print("Please enter the second number: ");
                userInput = in.nextLine();

                try {
                    secondNumber = Integer.parseInt(userInput);
                    validInt = true;
                } catch (Exception e) {
                    System.out.println("Invalid Response: Please enter a whole number.\n");
                }
            } while (!validInt);

            // Display the number1 raised by power of number 2
            System.out.println(firstNumber + " raised to the power of " + secondNumber + " is: " + power(firstNumber, secondNumber) + ".");

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

    // Method that raise number1 by power of number 2
    public static int power(int num1, int num2) {
        int powerNumber = 1;
        for (int i = 0; i < num2; i++)
            powerNumber = powerNumber * num1;
        return powerNumber;
    }

}
