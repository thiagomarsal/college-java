/**
 * File: Lab3b.java
 * Description: 
 * instructor's Name: Jeff Light
 * 
 * @author: Farias, Thiago Marsal
 * @since: Jan 21, 2021
 */
package week3;

import java.util.Scanner;

public class Lab3b {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Please enter a person's height in inches: ");
		String height = in.nextLine();
		double inches = Double.parseDouble(height);

		System.out.print("Please enter a person's wheight in pounds: ");
		String wheight = in.nextLine();
		double pounds = Double.parseDouble(wheight);

		double kg = 0.45359237 * pounds;
		double m = 0.0254 * inches;
		double bmi = kg / (m * m);

		String interpretation = null;

		if (bmi < 18.5) {
			interpretation = "Underweight";
		} else if (bmi >= 18.5 && bmi <= 24.9) {
			interpretation = "Normal";

		} else if (bmi >= 25.0 && bmi <= 29.9) {
			interpretation = "Normal";
		} else {
			interpretation = "Obese";
		}

		System.out.println("The person's BMI is: " + bmi + ". The person has a BMI classification of: " + interpretation);
	}

}
