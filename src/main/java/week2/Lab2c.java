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

public class Lab2c {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		System.out.println("This program will help you calculate an annual "
				+ "interest rate and then calculate the balance after 6 months");

		System.out.print("How much money would you like to deposit each month?");
		String answer1  = in.nextLine();

		//we need to turn the answer into int values
		double deposit = Double.parseDouble(answer1);
		//then we ask how much interest will it be

		System.out.print("How much annual interest will it have? ");
		String answer2 = in.nextLine();
		double apr =Double.parseDouble(answer2);

		double apr1 = apr/100/12;

		System.out.println(apr1);

		double month1 ;
		month1 = deposit *(1 + apr1);
		System.out.println("This is your balance after one month "+month1);

		//then we do the next month
		double month2 ;
		month2 = (deposit+ month1) *(1 + apr1);
		System.out.println("This is your balance after two months "+month2);

		double month3 ;
		month3 = (deposit+ month2)*(1 + apr1);
		System.out.println("This is your balance after three months "+month3);

		// then we do the fourth month
		double month4 ;
		month4 = (deposit+ month3) *(1 + apr1);
		System.out.println("This is your balance after four months "+ month4);

		// and the fifth
		double month5 ;
		month5 = (deposit+ month4) *(1+ apr1);
		System.out.println("This is your balance after three months "+ month5);

		// and the last month
		double month6 ;
		month6 = (deposit + month5) *(1+ apr1);

		System.out.println("This is your balance after six months: "+ month6);
		System.out.println(" ");
		System.out.println("Thank you for using the Monthly interest calculator! ");

/*		Scanner in = new Scanner(System.in);

		System.out.print("Please enter the amount to be deposited each month: ");
		String deposit = in.nextLine();
		double amountDeposit = Double.parseDouble(deposit);

		System.out.print("Please enter the annual interest rate percent: ");
		String rate = in.nextLine();
		double anualRate = Double.parseDouble(rate);
		anualRate = anualRate / 100 / 12;

		double balance = 0;
		balance = (amountDeposit + balance) * (1 + anualRate);
		balance = (amountDeposit + balance) * (1 + anualRate);
		balance = (amountDeposit + balance) * (1 + anualRate);
		balance = (amountDeposit + balance) * (1 + anualRate);
		balance = (amountDeposit + balance) * (1 + anualRate);
		balance = (amountDeposit + balance) * (1 + anualRate);

		System.out.println("The ending balance after 6 months is: " + balance);*/
	}
}