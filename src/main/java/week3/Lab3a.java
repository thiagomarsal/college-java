/**
 * File: Lab3a.java
 * Description: 
 * instructor's Name: Jeff Light
 * 
 * @author: Farias, Thiago Marsal, Leonel Acosta
 * @since: Jan 19, 2021
 */
package week3;

import java.util.Scanner;

public class Lab3a {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("What is your chest size: ");
		String size = in.nextLine();
		int chestSize = Integer.parseInt(size);

		if (chestSize < 38) {
			System.out.println("Size: S");
		} else if (chestSize >= 38 && chestSize < 40) {
			System.out.println("Size: M");
		} else if (chestSize >= 40 && chestSize < 43) {
			System.out.println("Size: L");
		} else if (chestSize >= 43 && chestSize < 46) {
			System.out.println("Size: XL");
		} else if (chestSize > 46) {
			System.out.println("Size: XXL");
		}
	}
}