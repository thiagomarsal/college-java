/*
Class: Lab-13a
Name: Francis Rimoli and Thiago Marsal
Date: 30-Mar-2021
Description: Password Scanner
Instructor Name: Jeff Light
*/
package week13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Lab13a {

	public static void main(String[] args) {
		System.out.println("Beginning password analysis....");

		ArrayList<String> incorrectPassword = new ArrayList<String>(); // ArrayList for incorrectPassword
		ArrayList<String> correctPassword = new ArrayList<String>(); // ArrayList for correctPassword
		File file = null;
		Scanner fIn = null;
		String line;
		String inputFileName = "Pwd.txt";
		String validFileName = "validpwd.txt";
		String invalidFileName = "invalidpwd.txt";

		try {
			System.out.printf("Opening file '%s'.\n", inputFileName);
			file = new File(inputFileName);
			fIn = new Scanner(file);
			String invalidMsg = "%-15s \t Invalid Password! \t\t %s\n";

			while (fIn.hasNext()) {
				line = fIn.nextLine();
				if (line.length() < 8) {
					incorrectPassword.add(String.format(invalidMsg, line, "Must be at least 8 characters long."));
					continue;
				}
				if (!hasUpper(line)) {
					incorrectPassword
							.add(String.format(invalidMsg, line, "Must contain at least one UPPERCASE character."));
					continue;
				}
				if (!hasLower(line)) {
					incorrectPassword
							.add(String.format(invalidMsg, line, "Must contain at least one LOWERCASE character."));
					continue;
				}
				if (!hasNumber(line)) {
					incorrectPassword.add(String.format(invalidMsg, line, "Must contain at least one NUMBER."));
					continue;
				}
				if (!hasSpecial(line)) {
					incorrectPassword
							.add(String.format(invalidMsg, line, "Must contain at one of {'@','#','%','-','&','*'}"));
					continue;
				}

				correctPassword.add(String.format("%-15s \t Valid Password!\n", line));
			}

			fIn.close();
			System.out.println("Analysis complete. Closing files.");
			System.out.printf("Results can be found in files '%s' and '%s' in the %s directory.", validFileName,
					invalidFileName, file.getAbsoluteFile().getParent());

			writeFile(correctPassword, validFileName);
			writeFile(incorrectPassword, invalidFileName);
		} catch (FileNotFoundException e) {
			System.out.printf("\nFile Error: File '%s' not found! Please save the list before trying to open it.\n",
					inputFileName);
		}
	}

	public static void writeFile(List<String> list, String fileName) {
		try {
			FileWriter myWriter = new FileWriter(fileName);

			for (String line : list) {
				myWriter.write(line);
			}
			myWriter.close();
		} catch (IOException e) {
			System.out.printf("\nFile Error: File '%s' not found! Please save the list before trying to open it.\n",
					fileName);
		}
	}

	public static boolean hasUpper(String text) {
		for (int i = 0; i < text.length(); i++) {
			if (Character.isUpperCase(text.charAt(i))) {
				return true;
			}
		}
		return false;
	}

	public static boolean hasLower(String text) {
		for (int i = 0; i < text.length(); i++) {
			if (Character.isLowerCase(text.charAt(i))) {
				return true;
			}
		}
		return false;
	}

	public static boolean hasNumber(String text) {
		for (int i = 0; i < text.length(); i++) {
			if (Character.isDigit(text.charAt(i))) {
				return true;
			}
		}
		return false;
	}

	public static boolean hasSpecial(String text) {
		List<Character> specialList = Arrays.asList('@', '#', '%', '-', '&', '*');
		for (int i = 0; i < text.length(); i++) {
			if (specialList.contains(text.charAt(i))) {
				return true;
			}
		}
		return false;
	}
}