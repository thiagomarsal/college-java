/*
Class: Lab-10d
Name: Francis Rimoli and Thiago Marsal
Date: 15-Mar-2021
Description: Student Test Grades
Instructor Name: Jeff Light
*/

package week10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Lab10d {

	public static void main(String[] args) {
        String fileName = "C:\\Student Test Grades.csv";
        File file = null;
        Scanner in = null;
        ArrayList<String[]> classRoster = new ArrayList<String[]>();

        try {
            file = new File(fileName);
            in = new Scanner(file);
            
            String[] header = in.nextLine().split(",");
            classRoster.add(header);

            while (in.hasNext()) {
                String[] line = in.nextLine().split(",");
                classRoster.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.printf("Error to read the CSV file '%s'. %s", fileName, e.getMessage());
        }
        
        in.close();

        for (int i=0; i<classRoster.size();i++) {
        	String[] student = classRoster.get(i);
        	if (i==0) {
                System.out.println("______________________________________________");
                System.out.printf("%-20s %-7s %-7s %-7s\n", student[0], student[1], student[2], student[3]);
                System.out.println("______________________________________________");		
        	} else {
                System.out.printf("%-22s %-7s %-7s %-7s\n", student[0], getLetterGrade(Integer.parseInt(student[1])), getLetterGrade(Integer.parseInt(student[2])), getLetterGrade(Integer.parseInt(student[3])));	
        	}     	       	
        }
	}
	
    public static String getLetterGrade(int numGrade) {
	    String letterGrade = "";
		
		if (numGrade > 94) {
			letterGrade = "A";
		}
		else if (numGrade > 90) {
			letterGrade = "A-";
		}
		else if (numGrade > 87) {
			letterGrade = "B+";
		}
		else if (numGrade > 84) {
			letterGrade = "B";
		}
		else if (numGrade > 80) {
			letterGrade = "B-";
		}
		else if (numGrade > 77) {
			letterGrade = "C+";
		}
		else if (numGrade > 74) {
			letterGrade = "C";
		}
		else if (numGrade > 70) {
			letterGrade = "C-";
		}
		else if (numGrade > 67) {
			letterGrade = "D+";
		}
		else if (numGrade > 64) {
			letterGrade = "D";
		}
		else if (numGrade > 60) {
			letterGrade = "D-";
		}
		else {
			letterGrade = "E";
		}
		return letterGrade;
    }
    
}
