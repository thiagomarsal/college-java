/*
Class: Lab-8b
Name: Francis Rimoli and Thiago Marsal
Date: 1-Mar-2021
Description: Passing an ArrayList to dups()
Instructor Name: Jeff Light
*/

package week8;

import java.util.ArrayList;
import java.util.Collections;  // to use sort
import java.util.Scanner;

public class Lab8b {
    public static void main(String[] args) {
        //Play the game until the user says they don't want to play again.
        String playAgain = "Y";
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> dupsNumbers = new ArrayList<Integer>(); // list with duplicate numbers
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
                        System.out.println("Invalid response. Please enter a valid whole number.\n");
                    }
                }
            } while (keepAdding);

            // return the sum all elements in the list
            int total = sumValues(list);
            System.out.printf("There are %d items in the ArrayList.\n", list.size());
            System.out.printf("The sum total of numbers in the ArrayList is %d.\n", total);

            // Search for duplicate items in an ArrayList
            dupsNumbers = dups(list);

            // display a list with duplicate items
            System.out.printf("The following numbers were duplicated in the ArrayList: %S.\n", dupsNumbers);

            //Get a 'Y' or 'N' from the user
            playAgain = getValidYN("Do you wish to play again? (Y/N): ", "Invalid response. Please answer with a 'Y' or 'N'\n");
            System.out.println();
        }// end of while (playAgain.equalsIgnoreCase("y"))
    }// end of Main()

    private static ArrayList<Integer> dups(ArrayList<Integer> list) {
        ArrayList<Integer> dupsList = new ArrayList<Integer>();
        int numCompare = 0;

        Collections.sort(list); // sort list

        for (int i : list) {
            if (numCompare == i) {
                if (!dupsList.contains(i)) {
                    dupsList.add(i);
                }
            }
            else {
                numCompare = i;
            }
        }

        return dupsList;

    }

    private static int sumValues(ArrayList<Integer> list) {
        int total = 0;

        System.out.printf("%-12s %-12s %n", "Array Index", "Item");
        for (int i = 0; i< list.size(); i++) {
            // display each index and element value from the list
            System.out.printf("%-12d %-12d\n", i, list.get(i));

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
