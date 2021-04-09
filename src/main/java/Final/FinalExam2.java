/*
 * Program: Final Exam 2
 * Name: Thiago Farias
 * Date: 4/9/2020
 * Instructor: Jeff Light
 * Description: Arrays and Functions
 */
package Final;

import java.util.ArrayList;
import java.util.Scanner;

public class FinalExam2 {

	public static void main(String[] args) {
		var in = new Scanner(System.in); // using Scanner to get user's input
		var list = new ArrayList<Integer>();
		var keepAdding = true;
		var sum = 0;

		do {
			System.out.print("Please enter a number (or just hit enter to finish): ");
			var inputText = in.nextLine();

			if (inputText.equals("")) {
				keepAdding = false;
				sum = addNumbers(list);
			} else {
				var number = Integer.parseInt(inputText);
				list.add(number);
			}
		} while (keepAdding);

		// return the largest number in the list
		int largestNumber = largestNumber(list);

		System.out.printf("The sum of the list of numbers is: %d. \n", sum);
		System.out.printf("The largest number in the list is: %d. \n", largestNumber);
	}// end of main()

	private static int addNumbers(ArrayList<Integer> list) {
		var total = 0;

		// iterates the list and sum values
		for (var value : list) {
			total += value;
		}

		// return total
		return total;
	}

	// Method that find the largest number of 3 passed by user
	public static int largestNumber(ArrayList<Integer> list) {
		var largestNumber = list.get(0);

		// iterates the list
		for (var value : list) {
			// check if next value is gt last one
			if (value > largestNumber) {
				largestNumber = value;
			}
		}

		// return grater value
		return largestNumber;
	}

}// end of class FinalExam2
