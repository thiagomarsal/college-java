/*
Class: Lab-10a
Name: Francis Rimoli and Thiago Marsal
Date: 10-Mar-2021
Description: Part 2 - Format Comma Delimited Data
Instructor Name: Jeff Light
*/

package week10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab10b {

    public static void main(String[] args) {
        String fileName = "C:\\Student Assignment Scores.csv";
        File file = null;
        Scanner in = null;
        try {
            file = new File(fileName);
            in = new Scanner(file);

            String[] header = in.nextLine().split(",");
            System.out.printf("%-30s %-10s %-10s %-10s %-10s %-10s %-10s\n", header);
            System.out.println("___________________________________________________________________________________________");

            while (in.hasNext()) {
                String[] line = in.nextLine().split(",");
                System.out.printf("%-30s %-10s %-10s %-10s %-10s %-10s %-10s\n", line);
            }
        } catch (FileNotFoundException e) {
            System.out.printf("Error to read the CSV file '%s'. %s", fileName, e.getMessage());
        }
    }
}