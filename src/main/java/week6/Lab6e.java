/*
Class: Lab-6e
Name: Francis Rimoli and Thiago Marsal
Date: 15-Feb-2021
Description: isBetween()
Instructor Name: Jeff Light
*/

package week6;

import java.util.Scanner;

public class Lab6e {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //using Scanner to get user's input
        String userInput;
        boolean exitGame, validAnswer;

        System.out.println("\nThis program will ask the user to enter something and then print out a reversed version of the user's input.");

        // Game Primary Loop: Stay in the loop while the user wishes to play
        exitGame = false;
        do {
            System.out.print("\nPlease enter something: ");
            userInput = in.nextLine();

            // Print the reverse for-loop
            System.out.println(reverseWithForLoop(userInput));

            // Print the reverse while-loop
            System.out.println(reverseWithWhileLoop(userInput));

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

    // method to return a reverse text from the input
    public static String reverseWithForLoop(String userInput) {
        String result = "Using the for loop: The reverse of '" + userInput + "' is: ";

        for (int i = userInput.length() - 1; i >= 0; i--) {
            result += userInput.charAt(i);
        }

        return result;
    }

    // method to return a reverse text from the input
    public static String reverseWithWhileLoop(String userInput) {
        String result = "Using the while loop: The reverse of '" + userInput + "' is: ";
        int index = userInput.length() - 1;

        while (index >= 0) {
            result += userInput.charAt(index);
            index--;
        }

        return result;
    }
}