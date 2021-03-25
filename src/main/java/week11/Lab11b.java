/*
Class: Lab-10d
Name: Francis Rimoli and Thiago Marsal
Date: 19-Mar-2021
Description: A Simple Switch Statement
Instructor Name: Jeff Light
*/

package week11;

import java.util.Scanner;

public class Lab11b {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = "";
        do {
            System.out.print("This program will show the name of an apostle based on the order they were called with President Nelson as #1\n" +
                    "Enter a number between 1 and 15 to display the corresponding apostle (or press Enter to quit): ");
            input = in.nextLine();

            switch (input) {
                case "1": {
                    System.out.println("\nNumber 1 is: Russell M Nelson\n");
                    break;
                }
                case "2": {
                    System.out.println("\nNumber 2 is: Dallin H. Oaks\n");
                    break;
                }
                case "3": {
                    System.out.println("\nNumber 3 is: M. Russell Ballard\n");
                    break;
                }
                case "4": {
                    System.out.println("\nNumber 4 is: Jeffrey R. Holland\n");
                    break;
                }
                case "5": {
                    System.out.println("\nNumber 5 is: Henry B. Eyring\n");
                    break;
                }
                case "6": {
                    System.out.println("\nNumber 6 is: Dieter F. Uchtdorf\n");
                    break;
                }
                case "7": {
                    System.out.println("\nNumber 7 is: David A. Bednar\n");
                    break;
                }
                case "8": {
                    System.out.println("\nNumber 8 is: Quentin L. Cook\n");
                    break;
                }
                case "9": {
                    System.out.println("\nNumber 9 is: D. Todd Christofferson\n");
                    break;
                }
                case "10": {
                    System.out.println("\nNumber 10 is: Neil L. Andersen\n");
                    break;
                }
                case "11": {
                    System.out.println("\nNumber 11 is: Ronald A. Rasband\n");
                    break;
                }
                case "12": {
                    System.out.println("\nNumber 12 is: Gary E. Stevenson\n");
                    break;
                }
                case "13": {
                    System.out.println("\nNumber 13 is: Dale G. Renlund\n");
                    break;
                }
                case "14": {
                    System.out.println("\nNumber 14 is: Gerrit W. Gong\n");
                    break;
                }
                case "15": {
                    System.out.println("\nNumber 15 is: Ulisses Soares\n");
                    break;
                }
                default: {
                    if (input.contentEquals("")) {
                    	System.out.println("\nGood bye.\n");
                    } else {
                    	System.out.println("\nThat's not a valid choice. Try again.\n");
                    }
                }
            }
        } while (!input.equals(""));
    }
}
