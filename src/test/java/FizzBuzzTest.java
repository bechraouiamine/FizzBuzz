import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    void should_return_string_1_for_int_1() {
        // Given
        int number = 1;

        // When
        String result = FizzBuzz.getFizzBuzz(number);

        // Then
        assertEquals("1", result);
    }

    @Test
    void should_return_string_2_for_int_2() {
        // Given
        int number = 2;

        // When
        String result = FizzBuzz.getFizzBuzz(number);

        // Then
        assertEquals("2", result);
    }

    @Test
    void should_return_fizz_for_3() {
        // Given
        int number = 3;

        // When
        String result = FizzBuzz.getFizzBuzz(number);

        // Then
        assertEquals("FIZZ", result);
    }

    @Test
    void should_return_string_4_for_int_4() {
        // Given
        int number = 4;

        // When
        String result = FizzBuzz.getFizzBuzz(number);

        // Then
        assertEquals("4", result);
    }

    @Test
    void should_return_buzz_for_int_5() {
        // Given
        int number = 5;

        // When
        String result = FizzBuzz.getFizzBuzz(number);

        // Then
        assertEquals("BUZZ", result);
    }

    @Test
    void should_return_fizz_for_int_6() {
        // Given
        int number = 6;

        // When
        String result = FizzBuzz.getFizzBuzz(number);

        // Then
        assertEquals("FIZZ", result);
    }

    @Test
    void should_return_string_7_for_int_7() {
        // Given
        int number = 7;

        // When
        String result = FizzBuzz.getFizzBuzz(number);

        // Then
        assertEquals("7", result);
    }
}