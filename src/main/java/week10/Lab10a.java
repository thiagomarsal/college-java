/*
Class: Lab-10a
Name: Francis Rimoli and Thiago Marsal
Date: 10-Mar-2021
Description: Part 1 - Display File Contents
Instructor Name: Jeff Light
*/

package week10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab10a {

    public static void main(String[] args) {
        String fileName = "C:\\Student Assignment Scores.csv";
        File file = null;
        Scanner in = null;
        try {
            file = new File(fileName);
            in = new Scanner(file);

            while (in.hasNext()) {
                System.out.println(in.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.printf("Error to read the CSV file '%s'. %s", fileName, e.getMessage());
        }
    }
}