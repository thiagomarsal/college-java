/*
Class: Lab-6a
Name: Francis Rimoli and Thiago Marsal
Date: 9-Feb-2021
Description: largestNumber()
Instructor Name: Jeff Light
*/

package week6;

import java.util.Scanner;

public class Lab6a {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //using Scanner to get user's input
        String userInput;
        int firstNumber = 0, secondNumber = 0, thirdNumber = 0, largestNumberResult = 0;
        boolean exitGame, validInt, validAnswer;

        // Game Primary Loop: Stay in the loop while the user wishes to play
        exitGame = false;
        do {
            System.out.println("\nThis program will ask the user for three numbers and determine which of the three is the largest.\n\n");

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

            // Numeric Input Validation loop: Stay in the loop until user enters a valid Integer
            validInt = false;
            do {
                System.out.print("Please enter the third number: ");
                userInput = in.nextLine();

                try {
                    thirdNumber = Integer.parseInt(userInput);
                    validInt = true;
                } catch (Exception e) {
                    System.out.println("Invalid Response: Please enter a whole number.\n");
                }
            } while (!validInt);

            // Display the largest number among of the 3 provided by user
            System.out.println("\nThe largest of the three numbers is: " + largestNumber(firstNumber, secondNumber, thirdNumber));

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

    // Method that find the largest number of 3 passed by user
    public static int largestNumber(int num1, int num2, int num3) {
        int maxNumber = 0;
        if (num1 > num2) {
            if (num1 > num3) {
                maxNumber = num1;
            } else {
                maxNumber = num3;
            }
        } else if (num2 > num3) {
            maxNumber = num2;
        } else {
            maxNumber = num3;
        }
        return maxNumber;
    }

}
