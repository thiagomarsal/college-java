/*
Class: Lab-7b
Name: Francis Rimoli and Thiago Marsal
Date: 18-Feb-2021
Description: Pythagorean Theorem
Instructor Name: Jeff Light
*/
package week7;

import java.util.Scanner;

public class Lab7i {
    public static void main(String[] args) {
        //Play the game until the user says they don't want to play again.
        String playAgain = "Y";
        while (playAgain.equalsIgnoreCase("Y")) {
            //Get an integer from the user
            int intNum = getValidInt("Please enter a whole number: ", "Invalid response. Only whole numbers are acceptable.");
            System.out.printf("The whole number your entered was: %d.\n", intNum);
            System.out.println("Now we will test your whole number in a math equation...");
            System.out.printf("Adding 10 to your whole number would be: 10 + %d = %d.\n", intNum, intNum + 10);
            System.out.println();

            //Get a floating-point from the user
            double doubleNum = getValidDouble("Please enter a decimal-point number: ", "Invalid response. Only decimal-point numbers are acceptable.");
            System.out.printf("The float your entered was: %f.\n", doubleNum);
            System.out.println("Now we will test your floating-point number in a math equation...");
            System.out.printf("Adding 10 to your float would be: 10 + %f = %f.\n", doubleNum, doubleNum + 10);
            System.out.println();

            //Get a 'Y' or 'N' from the user
            playAgain = getValidYN("Would you like to play again? (Y/N): ", "Invalid response. Please answer with a 'Y' or 'N'");
            System.out.println();
        }// end of while (playAgain.equalsIgnoreCase("y"))
    }// end of Main()

    private static String getValidYN(String question, String warning) {
        Scanner in = new Scanner(System.in);
        boolean validAnswer = false;
        String userInput = "";

        do {
            System.out.print(question);
            userInput = in.nextLine();

            if (userInput.equalsIgnoreCase("Y") || userInput.equalsIgnoreCase("N"))
                validAnswer = true;
            else
                System.out.println(warning);
        }
        while (!validAnswer);

        return userInput;
    }

    private static double getValidDouble(String question, String warning) {
        Scanner in = new Scanner(System.in);
        boolean valid = false;
        double value = 0;

        do {
            System.out.print(question);
            String userInput = in.nextLine();

            try {
                value = Double.parseDouble(userInput);
                valid = true;
            } catch (Exception e) {
                System.out.println(warning);
            }
        } while (!valid);

        return value;
    }

    private static int getValidInt(String question, String warning) {
        Scanner in = new Scanner(System.in);
        boolean valid = false;
        int value = 0;

        do {
            System.out.print(question);
            String userInput = in.nextLine();

            try {
                value = Integer.parseInt(userInput);
                valid = true;
            } catch (Exception e) {
                System.out.println(warning);
            }
        } while (!valid);

        return value;
    }
}