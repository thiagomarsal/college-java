/**
 * File: Lab3c.java
 * Description:
 * instructor's Name: Jeff Light
 *
 * @author: Farias, Thiago Marsal
 * @since: Feb 1, 2021
 */
package week4;

import java.util.Scanner;

public class Lab4c {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String answer = "";
        boolean valid = false;

        do {
            while (!valid) {
                System.out.println("Do you like to code in Java?");
                answer = in.nextLine();
                if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("n")) {
                    valid = true;
                } else {
                    System.out.println("Error: Please answer with a 'Y' or 'N'.");
                }// end of if
            }// end of while

            if (answer.equalsIgnoreCase("y")) {
                System.out.println("That's great! I do too!");
            }// end of if YES

            if (answer.equalsIgnoreCase("n")) {
                System.out.println("That's ok. There are many other wonderful things in life to learn.");
            }// end of if NO
        } while (!valid);
    }// end of main
}// end of lab4c
