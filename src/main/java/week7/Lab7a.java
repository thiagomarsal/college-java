/*
Class: Lab-7a
Name: Francis Rimoli and Thiago Marsal
Date: 18-Feb-2021
Description: checkEligibility()
Instructor Name: Jeff Light
*/

package week7;

import java.util.Scanner; // import class to get user's input
import java.time.LocalDate; // import the LocalDate class

public class Lab7a {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // using Scanner to get user's input
        String userInput, name;
        int year = 0;
        boolean exitGame, validInt, validAnswer;

        System.out.print("\nThis program will ask the user to enter a name and a birth year for a potential student.");
        System.out.print("\nThe program will then determine what type of school, if any, the potential student is eligible to attend.\n");

        // Game Primary Loop: Stay in the loop while the user wishes to play
        exitGame = false;
        do {
            System.out.print("\nPlease enter the name of a potential student: ");
            name = in.nextLine();

            // Numeric Input Validation loop: Stay in the loop until user enters a valid Integer
            validInt = false;
            do {
                System.out.print("Please enter the year the potential student was born: ");
                userInput = in.nextLine();

                try {
                    year = Integer.parseInt(userInput);
                    validInt = true;
                } catch (Exception e) {
                    System.out.println("Invalid Response: Please enter a whole number for the birth year.\n");
                }
            } while (!validInt);

            // Display the potential student's type of school eligible to attend
            System.out.printf("%s is %d years old. %s %s", name, calculateAge(year), name, checkEligibility(name, year));

            // Non-Numeric Input Validation loop: Stay in the loop until user enters a valid "Y" or "N"
            validAnswer = false;
            do {
                System.out.print("\n\nWould you like to play again? (Y/N): ");
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

    // Method determine which type of school the student is eligible to attend
    public static String checkEligibility(String name, int year) {
        String userEligibility = "";
        int userAge = calculateAge(year); // get the user's age

        if (userAge <= 4)
            userEligibility = "is too young to attend school";
        else if (userAge <= 11)
            userEligibility = "may attend Elementary School";
        else if (userAge <= 14)
            userEligibility = "may attend Jr. High School";
        else if (userAge <= 17)
            userEligibility = "may attend High School";
        else
            userEligibility = "may attend College";

        return userEligibility;
    }

    // Method get the age of the person
    public static int calculateAge(int year) {
        LocalDate rightNow = LocalDate.now(); // variable to get and store the current date and time
        int thisYear = rightNow.getYear(); // variable with current year
        return thisYear - year; // return the difference between the current year and the student's birth year
    }
}