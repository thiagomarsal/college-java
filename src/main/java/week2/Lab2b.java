/**
 * File: Lab2b.java
 * Description: 
 * instructor's Name: Jeff Light
 * 
 * @author: Farias, Thiago Marsal; Pena-Caicedo, Maria
 * @since: Jan 15, 2021
 */
package week2;

import java.util.Scanner;

public class Lab2b {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sqWidth = 0;
		int recWidth = 0;
		int recHeight = 0;
		int sqArea = 0;
		int recArea = 0;

		System.out.print("Please enter the width of the square: ");
		String square = in.nextLine();
		sqWidth = Integer.parseInt(square);
		
		System.out.print("Please enter width of the rectangle: ");
		String wRectangle = in.nextLine();
		recWidth = Integer.parseInt(wRectangle);
		
		System.out.print("Please enter height of the rectangle: ");
		String hRectangle = in.nextLine();
		recHeight = Integer.parseInt(hRectangle);
		
		sqArea = sqWidth * sqWidth;
		recArea = recWidth * recHeight;

		System.out.println("The area of a square with a width of " + sqWidth + " is " + sqArea + ".");
		System.out.println("The area of a rectangle with a width of " + recWidth + " is " + recArea + ".");
	}

}
