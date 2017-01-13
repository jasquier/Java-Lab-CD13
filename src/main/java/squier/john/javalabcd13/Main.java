package squier.john.javalabcd13;

/**
 * Created by johnsquier on 1/13/17.
 */
public class Main {

    public static void main(String[] args) {
        InputterOutputter inputOutput = new InputterOutputter();

        int secretNumber = SecertNumberGenerator.generateSecretNumber();

        inputOutput.displayHeader();

        inputOutput.promptForGuess();
    }
}
