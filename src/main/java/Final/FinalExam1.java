/*
 * Program: Final Exam 1
 * Name: Thiago Farias
 * Date: 4/9/2020
 * Instructor: Jeff Light
 * Description: Strings
 */
package Final;

import java.util.Scanner;

public class FinalExam1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); // using Scanner to get user's input

		// Initial variables
		String name, ward;
		int numberMales, numberFemales;

		// reading value from user
		System.out.print("Please enter your name: ");
		name = in.nextLine();

		// reading value from user
		System.out.print("Please enter the name of your Ward: ");
		ward = in.nextLine();

		// reading value from user
		numberMales = getValidInt("Please enter the approximate number of adult males in the ward: ",
				"Invalid response. Please enter a whole number.");

		// reading value from user
		numberFemales = getValidInt("Please enter the approximate number of adult females in the ward: ",
				"Invalid response. Please enter a whole number.");

		System.out.printf("There are %d adult members in %s's %s ward.", numberMales + numberFemales, name, ward);
	}// end of main()

	private static int getValidInt(String question, String warning) {
		var in = new Scanner(System.in); // using Scanner to get user's input
		var valid = false;
		var value = 0;

		do {
			// reading value from user
			System.out.print(question);
			var userInput = in.nextLine();

			// Validating value if is whole number
			try {
				value = Integer.parseInt(userInput);
				valid = true;
			} catch (Exception e) {
				// printing error message
				System.out.println(warning);
			}
		} while (!valid);

		return value;
	}

}// end of class FinalExam1
