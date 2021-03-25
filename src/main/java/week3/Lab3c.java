/**
 * File: Lab3c.java
 * Description:
 * instructor's Name: Jeff Light
 *
 * @author: Farias, Thiago Marsal
 * @since: Jan 21, 2021
 */
package week3;

import java.util.Scanner;

public class Lab3c {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter the member's age: ");
        String ageText = in.nextLine();
        int age = Integer.parseInt(ageText);

        if (age < 1) {
            System.out.println("The member is a Babe in Arms.");
        }
        if (age >= 1 && age < 3) {
            System.out.println("The member should be in Nursery.");
        }
        if (age >= 3 && age < 12) {
            System.out.println("The member should attend Primary.");
        }
        if (age >= 12) {
			System.out.print("Please enter the member's gender: ");
			String gender = in.nextLine();

			if (age >= 12 && age < 18) {
				if (gender.equalsIgnoreCase("m")) {
					System.out.println("The member should attend Young Men's");
				}
				if (gender.equalsIgnoreCase("f")) {
					System.out.println("The member should attend Young Women's.");
				}
			}

			if (age >= 18) {
				if (gender.equalsIgnoreCase("m")) {
					System.out.println("The member should attend Priesthood.");
				}
				if (gender.equalsIgnoreCase("f")) {
					System.out.println("The member should attend Relief Society.");
				}
			}
		}
    }
}