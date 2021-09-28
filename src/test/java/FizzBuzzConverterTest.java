import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzConverterTest {
    private FizzBuzzConverter converter;

    @BeforeEach
    void setUp() {
        converter = new FizzBuzzConverter();
    }

    @Test
    void converter_shouldIgnoreNormalNumbers() {
        assertEquals("1", converter.convert(1));
        assertEquals("2", converter.convert(2));
    }

    @Test
    void converter_shouldConvertMultiplesOfThreeToFizz() {
        assertEquals("Fizz", converter.convert(3));
        assertEquals("Fizz", converter.convert(6));
    }

    @Test
    void converter_shouldConvertMultiplesOfFiveToBuzz() {
        assertEquals("Buzz", converter.convert(5));
        assertEquals("Buzz", converter.convert(10));
    }

    @Test
    void converter_shouldConvertMultiplesOfFiveAndThreeToFizzBuzz() {
        assertEquals("FizzBuzz", converter.convert(15));
        assertEquals("FizzBuzz", converter.convert(30));
    }
}
