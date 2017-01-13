package squier.john.javalabcd13;

import java.lang.Math;

/**
 * Created by johnsquier on 1/13/17.
 */
public class SecertNumberGenerator {

    public static int generateSecretNumber() {
        return (int)((Math.random() * 10) + 1);
    }
}
