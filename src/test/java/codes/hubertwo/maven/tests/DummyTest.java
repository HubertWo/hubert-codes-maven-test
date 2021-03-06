package codes.hubertwo.maven.tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit tests.
 * Name of the class ends with "Test" (Unit test)
 */
class DummyTest {

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
