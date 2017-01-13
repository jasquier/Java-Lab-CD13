package squier.john.javalabcd13;

import org.junit.Test;
import org.junit.Assert;

/**
 * Created by johnsquier on 1/13/17.
 */
public class SecretNumberGeneratorTest {

    @Test
    public void secretNumberGeneratorTest() {
        int expected = SecertNumberGenerator.generateSecretNumber();
        Assert.assertTrue( (expected <= 10) && (expected >= 1));
    }
}
