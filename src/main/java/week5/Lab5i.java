package week5;

import java.util.Scanner;

public class Lab5i {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String answer = "";
        int numberOne = 0;
        int numberTwo = 0;
        int numberThree = 0;
        boolean playAgain = false;

        System.out.println("This program will ask the user for three numbers:\n" +
                "* A starting number\n" +
                "* An ending number\n" +
                "* A multiplier\n");
        System.out.println("The program will multiply each number between the starting number and ending number by the multiplier.");

        do {
            boolean valid = false;
            do {
                System.out.print("Please enter the starting number: ");
                answer = in.nextLine();

                try {
                    numberOne = Integer.parseInt(answer);
                    valid = true;
                } catch (Exception e) {
                    System.out.print("Error: Please enter a whole number. \n");
                }

            } while (!valid);

            valid = false;
            do {
                System.out.print("Please enter the ending number: ");
                answer = in.nextLine();

                try {
                    numberTwo = Integer.parseInt(answer);
                    valid = true;
                } catch (Exception e) {
                    System.out.print("Error: Please enter a whole number. \n");
                }

            } while (!valid);

            valid = false;
            do {
                System.out.print("Please enter the multiplier: ");
                answer = in.nextLine();

                try {
                    numberThree = Integer.parseInt(answer);
                    valid = true;
                } catch (Exception e) {
                    System.out.print("Error: Please enter a whole number. \n");
                }

            } while (!valid);

            for (int i = numberOne; i <= numberTwo; i++) {
                System.out.printf("Multiplying %d by %d results in: %d %n", i, numberThree, (i * numberThree));
            }

            valid = false;
            do {
                System.out.println("Would you like to play again?");
                answer = in.nextLine();
                if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("n")) {
                    valid = true;
                    playAgain = answer.equalsIgnoreCase("y");
                } else {
                    System.out.println("Error: Please answer with a 'Y' or 'N'.");
                }
            } while (!valid);



        } while (playAgain);
    }
}
