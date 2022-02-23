package codes.hubertwo.maven.tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Integration tests.
 * Name of the class ends with "IT" (Integration test)
 */
public class DummyTestIT {

    @Test
    void example_test1() {
        int expected = 5;

        int actual = 5;

        assertEquals(expected, actual);
    }

    @Test
    void example_test2() {
        String givenString = "This is an unit test";
        int expectedLength = 20;

        int actualLength = givenString.length();

        assertEquals(expectedLength, actualLength);
    }

}
