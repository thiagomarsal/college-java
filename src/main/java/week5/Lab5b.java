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

public class Lab5b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String answer = "";
        boolean valid = false;
        boolean playAgain = false;
        double amountDeposit = 0;
        double anualRate = 0;
        int months = 0;

        System.out.println("This program will ask the user for a monthly deposit, an annual interest rate and the number of months the user plans on saving.\n" +
                "It will then show the monthly balance over the period of planned savings.");

        do {
            valid = false;
            do {
                System.out.print("Please enter the amount to be deposited each month: ");
                answer = in.nextLine();

                try {
                    amountDeposit = Double.parseDouble(answer);
                    valid = true;
                } catch (Exception e) {
                    System.out.print("Error: Please enter a whole number. \n");
                }
            } while (!valid);

            valid = false;
            do {
                System.out.print("Please enter the annual interest rate: ");
                answer = in.nextLine();

                try {
                    anualRate = Double.parseDouble(answer);
                    valid = true;
                } catch (Exception e) {
                    System.out.print("Error: Please enter a whole number. \n");
                }
            } while (!valid);

            valid = false;
            do {
                System.out.print("Please enter the number of months you plan to save: ");
                answer = in.nextLine();

                try {
                    months = Integer.parseInt(answer);
                    valid = true;
                } catch (Exception e) {
                    System.out.print("Error: Please enter a whole number. \n");
                }
            } while (!valid);

            anualRate = anualRate / 100 / 12;
            double balance = 0;

            System.out.println("The following table shows the balance of the account for each month of the designated savings period.");
            System.out.printf("%s %18s %n", "Month", "Balance");
            for (int i = 1; i <= months; i++) {
                balance = (amountDeposit + balance) * (1 + anualRate);
                System.out.printf("Month %-10d $%,.2f %n", i, balance);
            }

            valid = false;
            do {
                System.out.println("Would you like to make another calculation? (Y/N):");
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
