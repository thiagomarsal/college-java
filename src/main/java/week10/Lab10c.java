/*
Class: Lab-10a
Name: Francis Rimoli and Thiago Marsal
Date: 10-Mar-2021
Description: Part 3 - Filtered Data From a CSV File
Instructor Name: Jeff Light
*/

package week10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Lab10c {

    public static void main(String[] args) {
        String fileName = "C:\\Student Assignment Scores.csv";
        File file = null;
        Scanner in = null;
        try {
            file = new File(fileName);
            in = new Scanner(file);

            String[] header = in.nextLine().split(",");
            System.out.printf("%-20s %-10s\n", header[0], "Assignment with 0");
            System.out.println("______________________________________");

            while (in.hasNext()) {
                String[] line = in.nextLine().split(",");
                if (Arrays.asList(line).contains("0")) {
                    for (int i = 1; i < line.length; i++) {
                        if (line[i].equals("0")) {
                            System.out.printf("%-20s %-10s\n", line[0], i);
                        }
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.printf("Error to read the CSV file '%s'. %s", fileName, e.getMessage());
        }
    }
}