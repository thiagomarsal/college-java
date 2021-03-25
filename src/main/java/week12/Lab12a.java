/*
Class: Lab-12a
Name: Francis Rimoli and Thiago Marsal
Date: 24-Mar-2021
Description: Shopping List - Part 3 - Saving a Shopping List to Persistent Storage
Instructor Name: Jeff Light
*/
package week12;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lab12a {

    /**
     * main() method displays a menu to the user and asks them to select a command.
     * The method will continue to display the menu to the user until they wish to quit by selecting 'Exit' from the menu.
     * The method also creates a new, empty shoppingList of type ArrayList<String>
     * Based on the user input, the appropriate method will be called to perform actions on the shoppingList.
     * Calls: getChoice(), addItems(), deleteItems(), showItems(), sortItems().
     */
    public static void main(String[] args) {
        //Initialize variables
        Scanner sIn = new Scanner(System.in);                        //Input Scanner for String
        ArrayList<String> shoppingList = new ArrayList<String>();    //ArrayList for shoppingList
        String choice;                                                //Holds user input of type String
        boolean done = false;                                        //Keeps program running until user wants to quit

        // Keep running the program until the user quits
        do {
            //Print out the menu to the console
            System.out.println();
            System.out.println("1. Add Items");
            System.out.println("2. Delete Items");
            System.out.println("3. Show Items");
            System.out.println("4. Sort Items");
            System.out.println("5. Save List");
            System.out.println("6. Exit");
            System.out.print("Please enter a command: ");
            choice = sIn.nextLine();

            //Call the appropriate method for the choice selected.
            switch (choice) {
                case "1":    //Add items to the Shopping List
                    System.out.println(addItems(sIn, shoppingList) + " items have been added to your Shopping List.");
                    break;
                case "2":    //Delete items from the Shopping List
                    System.out.println(deleteItems(sIn, shoppingList) + " items have been deleted from your Shopping List.");
                    break;
                case "3":    //Show the items in the Shopping List
                    showItems(shoppingList);
                    break;
                case "4":    //Sort the items in the Shopping List
                    sortItems(shoppingList);
                    break;
                case "5":    //Save List
                    saveList(sIn, shoppingList, "Shopping List.txt");
                    break;
                case "6":    //Exit the program
                    System.out.println("\nGoodbye");
                    done = true;
                    break;
                default:    //Handles all input that is not between 1-5
                    System.out.println("Invalid response.  Please enter a choice from the menu (1-5).");
            } //End of switch (choice)
        } while (!done);  //Keep running the program until the user quits
    }//end of main()


    //////////////////////////////////////////////
    // STUDENTS, FILL IN THE METHOD STUBS BELOW://
    //  addItems()								//
    //	deleteItems()							//
    //	showItems()								//
    //	sortItems()								//
    //////////////////////////////////////////////

    /**
     * addItems() method asks the user to enter an item to be stored in the shoppingList and then adds the item to the shoppingList ArrayList.
     * The user may enter as many items as they want, hitting ENTER to stop entering items and return to main().
     * Each time the user enters an item into the list, a message will be displayed showing the item entered in the following format:
     * '<item>' has been added to the Shopping List.  [Example:  'Eggs' has been added to the Shopping List.]
     * Returns the number of items added to the shoppingList
     */
    public static int addItems(Scanner sIn, ArrayList<String> shoppingList) {
        int itemsAdded = 0, index;
        String input = "", inputLeft = "", inputRight = "", inputTrimmed = "";
        Boolean validItem;

        do {
            validItem = false;
            do {
                System.out.print("Add an item to the list (or just hit 'ENTER' when done) <item>:<amount>: ");
                input = sIn.nextLine();

                index = input.indexOf(':');
                if ((index != -1) || (input.equals(""))) {
                    validItem = true;
                } else {
                    System.out.println("Invalid Entry. No ':' found. Entry must be in the form '<item>:<amount>'");
                }

            } while (!validItem);

            if (!input.equals("")) {
                itemsAdded++;
                inputLeft = input.substring(0, index);
                inputRight = input.substring(index + 1);
                inputTrimmed = inputLeft.trim() + ":" + inputRight.trim();
                shoppingList.add(inputTrimmed);
                System.out.printf("'%s' has been added to the Shopping List.%n", inputTrimmed);
            }
        } while (!input.equals(""));

        return itemsAdded;
    }//end of method addItems(ArrayList<String>)


    /**
     * deleteItems() method asks the user to enter an item to be deleted from the shoppingList and then deletes the item from the shoppingList ArrayList.
     * The user may delete as many items as they want, hitting ENTER to stop deleting items and return to main().
     * Each time the user deletes an item from the list, a message will be displayed showing the item deleted in the following format:
     * '<item>' has been deleted to the Shopping List.  [Example:  'Peaches' has been deleted to the Shopping List.]
     * If the user tries to delete an item not in the list, a message will be displayed indicating the error and showItems() will be called.
     * Returns the number of items deleted from the shoppingList
     */
    public static int deleteItems(Scanner sIn, ArrayList<String> shoppingList) {
        int itemsRemoved = 0;
        String input = "";

        do {
            System.out.print("Delete an item from the list (or just hit 'ENTER' when done): ");
            input = sIn.nextLine();
            if (!input.equals("")) {
                if (shoppingList.contains(input)) {
                    itemsRemoved++;
                    shoppingList.remove(input);
                    System.out.printf("'%s' has been deleted to the Shopping List.%n", input);
                } else {
                    System.out.printf("Invalid response! '%s' is NOT an item in the list..%n", input);
                    showItems(shoppingList);
                }
            }
        } while (!input.equals(""));

        return itemsRemoved;
    }//end of method deleteItems(ArrayList<String>)


    /**
     * showItems() method simply displays the contents of the shoppingList ArrayList in it's simplest form:
     * Example output:
     * <p>
     * The Shopping List contains the following items:
     * [item-1, item-2, item-n]
     */
    public static void showItems(ArrayList<String> shoppingList) {
        String itemName = "", itemAmount = "";
        int separator;

        System.out.println("\n---------------------");
        System.out.println("    Shopping List");
        System.out.println("---------------------");

        for (String i : shoppingList) {

            separator = i.indexOf(':');
            itemName = i.substring(0, separator);
            itemAmount = i.substring(separator + 1);
            System.out.printf("%-15s %4s %n", itemName, itemAmount);
        }
        System.out.println("---------------------");

    }//end of method showItems(ArrayList<String>)


    /**
     * sortItems() method sorts the items in the shoppingList ArrayList, then calls showItems() to display the sorted list.
     * Example output:
     * The Shopping List has been sorted.
     * <p>
     * The Shopping List contains the following items:
     * [item-1, item-2, item-n]
     */
    public static void sortItems(ArrayList<String> shoppingList) {
        System.out.println("The Shopping List has been sorted.");
        Collections.sort(shoppingList);
        showItems(shoppingList);
    }//end of method sortItems(ArrayList<String>)

    /**
     * Saving a Shopping List to Persistent Storage
     * <p>
     * The Shopping List contains the following items:
     * [item-1, item-2, item-n]
     */
    private static void saveList(Scanner sIn, ArrayList<String> shoppingList, String fileName) {
        boolean validItem = false;
        String input;

        do {
            System.out.printf("Are you sure you wish to overwrite the '%s' file with your current list? ", fileName);
            input = sIn.nextLine();

            if ("Y".equalsIgnoreCase(input) || "N".equalsIgnoreCase(input)) {
                validItem = true;
            } else {
                System.out.println("Invalid response. Please enter 'Y' or 'N'");
            }
        } while (!validItem);

        if ("Y".equalsIgnoreCase(input)) {
            try {
                PrintWriter printWriter = new PrintWriter(fileName);
                printWriter.println(shoppingList);
                printWriter.flush();
                printWriter.close();
                System.out.printf("Shopping List saved to file: %s", fileName);
            } catch (FileNotFoundException e) {
                System.out.printf("Error while writing the file: '%s'. %s\n", fileName, e.getMessage());
            }
        } else {
            System.out.println("Shopping List not saved.");
        }
    }
}//end of class Lab12a