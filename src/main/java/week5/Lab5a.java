/**
 * File: Lab5a.java
 * Description: Hello World!
 * instructor's Name: Jeff Light
 *
 * @author: Farias, Thiago Marsal, Francis, Rimoli
 * @since: Feb 4, 2021
 */
package week5;

import java.util.Scanner;

public class Lab5a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String answer = "";
        int startingNumber = 0;
        int endingNumber = 0;
        int testNumber = 0;
        boolean playAgain = false;

        System.out.println("In this program, we will display a series of numbers divisible by an integer specified by the user.\n" +
                "You will ask the user for the starting number, the ending number and the integer to be considered.");

        do {
            boolean valid = false;
            do {
                System.out.print("Enter the starting number: ");
                answer = in.nextLine();

                try {
                    startingNumber = Integer.parseInt(answer);
                    valid = true;
                } catch (Exception e) {
                    System.out.print("Error: Please enter a whole number. \n");
                }

            } while (!valid);

            valid = false;
            do {
                System.out.print("Enter the ending number: ");
                answer = in.nextLine();

                try {
                    endingNumber = Integer.parseInt(answer);
                    valid = true;
                } catch (Exception e) {
                    System.out.print("Error: Please enter a whole number. \n");
                }

            } while (!valid);

            valid = false;
            do {
                System.out.print("Enter the test number: ");
                answer = in.nextLine();

                try {
                    testNumber = Integer.parseInt(answer);
                    valid = true;
                } catch (Exception e) {
                    System.out.print("Error: Please enter a whole number. \n");
                }

            } while (!valid);

            System.out.println("Here are the numbers between " + startingNumber + " and " + endingNumber + " that are divisible by " + testNumber + ":");
            for (int i = startingNumber; i <= endingNumber; i++) {
                if (i % testNumber == 0) {
                    System.out.println(i);
                }
            }

            valid = false;
            do {
                System.out.println("Would you like to play again?");
                answer = in.nextLine();
                if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("n")) {
                    valid = true;
                    playAgain = answer.equalsIgnoreCase("y");
                } else {
                    System.out.println("Error: Please answer with a 'Y' or 'N'.");
                }
            } while (!valid);
        } while (playAgain);
    }
}