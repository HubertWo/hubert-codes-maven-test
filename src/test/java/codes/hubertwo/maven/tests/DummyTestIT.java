package codes.hubertwo.maven.tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Integration tests.
 * Name of the class ends with "IT" (Integration test)
 */
class DummyTestIT {

    @Test
    void example_integration_test1() {
        int expected = 5;

        int actual = 5;

        assertEquals(expected, actual);
    }

    @Test
    void example_integration_test2() {
        String givenString = "This is an fake integration test";
        int expectedLength = 32;

        int actualLength = givenString.length();

        assertEquals(expectedLength, actualLength);
    }

}
