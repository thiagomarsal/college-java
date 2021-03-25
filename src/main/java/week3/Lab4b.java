/**
 * File: Lab4b.java
 * Description:
 * instructor's Name: Jeff Light
 *
 * @author: Farias, Thiago Marsal
 * @since: Jan 26, 2021
 */
package week3;

import java.util.Scanner;

public class Lab4b {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input = " ";
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        boolean valid = false;

        do {
            System.out.print("Print enter a number? ");
            input = in.nextLine();

            try {
                num1 = Integer.parseInt(input);
                valid = true;
            } catch (Exception e) {
                System.out.print("Error: Please enter a whole number. \n");
            }

        } while (!valid);

        num2 = num1 + 1000;
        num3 = num1 * 2;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
    }

}
