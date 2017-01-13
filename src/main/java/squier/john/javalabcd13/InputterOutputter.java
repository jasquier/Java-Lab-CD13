package squier.john.javalabcd13;

import java.util.Scanner;

/**
 * Created by johnsquier on 1/13/17.
 */
public class InputterOutputter {

    private Scanner scanner = new Scanner(System.in);

    public void displayHeader() {
        System.out.println("\nWelcome to the SECRET GUESSING GAME!!!!\n");
        System.out.println("Take a stab at guessing my secret number between 1 and 10\n");
        System.out.println("Don't worry, i'll tell you if your number is too high or too low!\n");
    }

    public int promptForGuess() {
        System.out.print("Enter a guess between 1 and 10: ");
        return scanner.nextInt();
    }

    public void printSuccessMessage(int secretNumber, int numberOfGuesses) {
        System.out.printf("You're the BEST!!!  You guessed the secret number %d in %d tries\n",
                secretNumber, numberOfGuesses);
    }

    public void printGuessTooLowMessage() {
        System.out.println("Your guess is LOWER than the secret number");
    }

    public void printGuessTooHighMessage() {
        System.out.println("Your guess is HIGHER than the secret number");
    }

}
