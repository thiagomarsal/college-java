/**
 * File: Lab2c.java
 * Description: 
 * instructor's Name: Jeff Light
 * 
 * @author: Farias, Thiago Marsal; Pena-Caicedo, Maria
 * @since: Jan 14, 2021
 */
package week2;

import java.util.Scanner;

public class Lab2c_loop {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int months = 6;

		System.out.print("Please enter the amount to be deposited each month: ");
		String deposit = in.nextLine();
		double amountDeposit = Double.parseDouble(deposit);

		System.out.print("Please enter the annual interest rate percent: ");
		String rate = in.nextLine();
		double anualRate = Double.parseDouble(rate);
		anualRate = anualRate / 100 / 12;

		double balance = 0;
		for (int i = 0; i < months; i++) {
			balance = (amountDeposit + balance) * (1 + anualRate);
			System.out.println("Your balance at month: " + i + " is: " + balance);
		}

		System.out.println("The ending balance after " + months + " months is: " + balance);
	}
}