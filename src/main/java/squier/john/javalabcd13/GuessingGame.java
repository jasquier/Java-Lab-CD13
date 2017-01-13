package squier.john.javalabcd13;

/**
 * Created by johnsquier on 1/13/17.
 */
public class GuessingGame {

    private InputterOutputter io = new InputterOutputter();
    private int secretNumber = SecertNumberGenerator.generateSecretNumber();


    public void gameLoop() {

        int guess = -1, previousGuess = -1;
        int numberOfGuesses = 0;

        io.displayHeader();

        while ( guess != secretNumber ) {

            do {
                guess = io.promptForGuess();

                if (guess < secretNumber) {
                    io.printGuessTooLowMessage();
                } else if (guess > secretNumber) {
                    io.printGuessTooHighMessage();
                }
            } while ( guess == previousGuess );

            previousGuess = guess;
            numberOfGuesses++;
        }

        io.printSuccessMessage(secretNumber, numberOfGuesses);
    }
}
