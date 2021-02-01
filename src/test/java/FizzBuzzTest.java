import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    void should_return_fizz_for_3() {
        // Given
        int number = 3;

        // When
        String result = FizzBuzz.getFizzBuzz(number);

        // Then
        assertEquals("FIZZ", result);
    }
}