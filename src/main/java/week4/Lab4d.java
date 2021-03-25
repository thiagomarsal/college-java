package week4;

import java.util.Scanner;

public class Lab4d {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean play_again = false;
        String answer = "";

        // primary program do-while loop
        do {
            int choosenNum = 0;
            int guessCount = 0;
            int randNum = (int) (Math.random() * 100) + 1;
            boolean valid = false;
            boolean found = false;

            System.out.print("This program is a guessing game\n"
                    + "The computer will generate a random integer between 1 and 100. The user will try to guess the number.\n"
                    + "Let's get starter!\n");
            System.out.println("I'm thinking of a number between 1 and 100.");

            // game do-while loop
            do {
                //validate numeric input
                valid = false;
                do {
                    try {
                        System.out.println("What is your guess?");
                        answer = in.nextLine();
                        choosenNum = Integer.parseInt(answer);
                        valid = true;
                    } catch (Exception e) {
                        System.out.println("Error: Please enter a whole number.");
                    }
                } while (!valid);

                guessCount++;
                if (choosenNum == randNum) {
                    found = true;
                    System.out.println("CORRECT! You guessed it in " + guessCount + " tries!!");
                } else {
                    if (choosenNum > randNum) {
                        System.out.println("Your guess is too high. Try again.");
                    } else {
                        System.out.println("Your guess is too low. Try again.");
                    }
                }
            } while (!found);

            // validate non-numerc
            valid = false;
            do {
                System.out.println("Would you like to play again?");
                answer = in.nextLine();
                if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("n")) {
                    valid = true;
                    play_again = answer.equalsIgnoreCase("y");
                } else {
                    System.out.println("Error: Please answer with a 'Y' or 'N'.");
                }
            } while (!valid);
        } while (play_again);
    }
}
