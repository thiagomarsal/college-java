/*
Class: Lab-8a
Name: Francis Rimoli and Thiago Marsal
Date: 23-Feb-2021
Description: Passing an ArrayList to sumValues()
Instructor Name: Jeff Light
*/
package week8;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab8a {
    public static void main(String[] args) {
        //Play the game until the user says they don't want to play again.
        String playAgain = "Y";
        Scanner in = new Scanner(System.in);
        while (playAgain.equalsIgnoreCase("Y")) {
            System.out.println("\nThis program will ask the user to enter a series of numbers.\n" +
                    "The user may enter as many numbers as they wish, hitting the enter key with no data when they wish to stop.\n" +
                    "The program will then display the array of numbers and the sum total of those numbers.\n");

            ArrayList<Integer> list = new ArrayList<Integer>();
            boolean keepAdding = true;
            do {
                System.out.print("Please enter a number (or just hit enter to finish): ");
                String inputText = in.nextLine();

                if (inputText.equals("")) {
                    keepAdding = false;
                } else {
                    try {
                        int number = Integer.parseInt(inputText);
                        list.add(number);
                    } catch (Exception e) {
                        System.out.println("Invalid response. Please enter a valid whole number.");
                    }
                }
            } while (keepAdding);

            // return the sum all elements in the list
            int total = sumValues(list);
            System.out.printf("There are %d items in the ArrayList.\n", list.size());
            System.out.printf("The sum total of numbers in the ArrayList is %d..\n", total);

            //Get a 'Y' or 'N' from the user
            playAgain = getValidYN("Would you like to play again? (Y/N): ", "Invalid response. Please answer with a 'Y' or 'N'");
            System.out.println();
        }// end of while (playAgain.equalsIgnoreCase("y"))
    }// end of Main()

    private static int sumValues(ArrayList<Integer> list) {
        int total = 0;

        System.out.println("Array Index      Item");
        for (int i = 0; i< list.size(); i++) {
            // display each index and element value from the list
            System.out.printf("%d \t\t\t\t %d\n", i, list.get(i));

            //sum all elements on the list
            total+= list.get(i);
        }

        return total;
    }

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
}