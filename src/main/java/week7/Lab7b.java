/*
Class: Lab-7b
Name: Francis Rimoli and Thiago Marsal
Date: 18-Feb-2021
Description: Pythagorean Theorem
Instructor Name: Jeff Light
*/
package week7;

import java.util.Scanner;

public class Lab7b {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // using Scanner to get user's input
        boolean exitGame = false;

        do {
            System.out.println("\nThis program will use the Pythagorean Theorem to calculate the length of one side of a right triangle given the other two sides.\n" +
                    "The program will ask the user which side they wish to calculate and the lengths of the other two sides.\n" +
                    "Assume that the three sides are called a, b, and c where c is the hypotenuse (the side opposite the right angle)\n");

            String side = getSide(in, "Which side of the triangle do you wish to calculate?", "Invalid response: Please enter either a, b, or c.");

            if (side.equalsIgnoreCase("a"))
                calculateSideA(in);
            else if (side.equalsIgnoreCase("b"))
                calculateSideB(in);
            else if (side.equalsIgnoreCase("c"))
                calculateSideC(in);

            exitGame = isPlayAgain(in, "Would you like to play again? (Y/N):", "Invalid Response: Please answer with a 'Y' or 'N'.");
        } while (exitGame);
    }

    public static void calculateSideA(Scanner in) {
        double valueB = getSideLength(in, "Please enter the length of side b:", "Invalid response. Please enter a number.");
        double valueC = getSideLength(in, "Please enter the length of side c:", "Invalid response. Please enter a number.");

        double valueA = Math.sqrt(Math.pow(valueC, 2) - Math.pow(valueB, 2));

        System.out.printf("A right triangle with sides '%s' = %.2f and '%s' (hypotenuse) = %.2f, has a side '%s' which has a length of: %.2f\n",
                "b", valueB, "c", valueC, "a", valueA);
    }

    public static void calculateSideB(Scanner in) {
        double valueA = getSideLength(in, "Please enter the length of side a:", "Invalid response. Please enter a number.");
        double valueC = getSideLength(in, "Please enter the length of side c:", "Invalid response. Please enter a number.");

        double valueB = Math.sqrt(Math.pow(valueC, 2) - Math.pow(valueA, 2));

        System.out.printf("A right triangle with sides '%s' = %.2f and '%s' (hypotenuse) = %.2f, has a side '%s' which has a length of: %.2f\n",
                "a", valueA, "c", valueC, "b", valueB);
    }

    public static void calculateSideC(Scanner in) {
        double valueA = getSideLength(in, "Please enter the length of side a:", "Invalid response. Please enter a number.");
        double valueB = getSideLength(in, "Please enter the length of side b:", "Invalid response. Please enter a number.");

        double valueC = Math.sqrt(Math.pow(valueA, 2) + Math.pow(valueB, 2));

        System.out.printf("A right triangle with sides '%s' = %.2f and '%s' (hypotenuse) = %.2f, has a side '%s' which has a length of: %.2f\n",
                "a", valueA, "b", valueB, "c", valueC);
    }

    public static double getSideLength(Scanner in, String question, String errorMessage) {
        boolean valid = false;
        double value = 0;

        do {
            System.out.print(question);
            String userInput = in.nextLine();

            try {
                value = Double.parseDouble(userInput);
                valid = true;
            } catch (Exception e) {
                System.out.println(errorMessage);
            }
        } while (!valid);

        return value;
    }

    public static String getSide(Scanner in, String question, String errorMessage) {
        boolean validAnswer = false;
        String userInput = "";

        do {
            userInput = getString(in, question);
            if (userInput.equalsIgnoreCase("a") || userInput.equalsIgnoreCase("b") || userInput.equalsIgnoreCase("c"))
                validAnswer = true;
            else
                System.out.println(errorMessage);
        }
        while (!validAnswer);

        return userInput;
    }

    public static String getString(Scanner in, String question) {
        System.out.print(question);
        String answer = in.nextLine();
        return answer;
    }

    public static boolean isPlayAgain(Scanner in, String question, String errorMessage) {
        boolean validAnswer = false;
        String userInput = "";

        do {
            userInput = getString(in, question);
            if (userInput.equalsIgnoreCase("Y") || userInput.equalsIgnoreCase("N"))
                validAnswer = true;
            else
                System.out.println(errorMessage);
        }
        while (!validAnswer);

        // Check if user want to play again or not
        if (userInput.equalsIgnoreCase("Y"))
            return true;
        else
            return false;
    }
}