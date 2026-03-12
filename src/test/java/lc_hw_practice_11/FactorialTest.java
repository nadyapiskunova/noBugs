package lc_hw_practice_11;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialTest extends TaskTest {
    public static Stream<Arguments> forPositiveNumberTest(){
        return Stream.of(
                // positive
                Arguments.of(1, 1),
                Arguments.of(5, 120),
                Arguments.of(7, 5040),
                // corner
                Arguments.of(0, 1)

        );
    }
    @ParameterizedTest
    @MethodSource("forPositiveNumberTest")
    public void factorialWithPositiveNumberTest(int initialNumber, int expectedResult){
        int actualResult = task.factorial(initialNumber);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void factorialNegativeNumbersTest(){
        assertThrows(IllegalArgumentException.class, () -> {
            task.factorial(-1);
        }, "Факториал от отрицательного числа выбрасывает исключение IllegalArgumentException");
    }
}
