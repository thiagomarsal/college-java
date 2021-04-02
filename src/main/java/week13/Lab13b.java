/*
Class: Lab-13b
Name: Francis Rimoli and Thiago Marsal
Date: 1-Apr-2021
Description: Creating a Form Letter
Instructor Name: Jeff Light
*/
package week13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Lab13b {

	public static void main(String[] args) {
		File csvFile = new File("Student Assignment Scores.csv");
		File txtFile = new File("Warning Letter to Student -.txt");
		String textTemplate = null;
		Scanner scanner = null;

		try {
			scanner = new Scanner(txtFile);
			scanner.useDelimiter("\\Z");
			textTemplate = scanner.next();
			scanner = new Scanner(csvFile);
			
			while (scanner.hasNext()) {
				String[] line = scanner.nextLine().split(",");
				if (Arrays.asList(line).contains("0")) {
					List<String> missingAssignments = new ArrayList<>();
					String name = line[0];
					
					for (int i = 0; i < line.length; i++) {
						if (line[i].equals("0")) {
							missingAssignments.add(String.valueOf(i));
						}
					}
					
					writeFile(textTemplate, name, missingAssignments);
				}
			}
		} catch (IOException e) {
			System.out.println("File not found. " + e.getMessage());
		}
	}

	public static void writeFile(String textTemplate, String name, List<String> missingAssignments) {
		File fileName = new File("Warning Letter to Student -" + name + ".txt");
		
		try {
			FileWriter writer = new FileWriter(fileName);
			writer.write("Dear " + name + ",\n");
			writer.write(textTemplate);
			writer.write("\n");
			
			for (String value : missingAssignments) {
				writer.write("Assignment " + value);
				writer.write("\n");
			}
			
			writer.close();
		} catch (IOException e) {
			System.out.println("File to write file. " + e.getMessage());
		}
	}
}