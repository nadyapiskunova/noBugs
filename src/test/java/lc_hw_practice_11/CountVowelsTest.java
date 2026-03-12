package lc_hw_practice_11;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CountVowelsTest extends TaskTest{
    public static Stream<Arguments> argumentsForValidString(){
        return Stream.of(
                Arguments.of("hello", 2),
                Arguments.of("java", 2),
                Arguments.of("AEIOU", 5),
                Arguments.of("", 0),
                Arguments.of("trghf", 0)

        );
    }
    @ParameterizedTest
    @MethodSource("argumentsForValidString")
    public void countVowelsWithValidString(String initialStr, int expectedResult){
        int actualResult = task.countVowels(initialStr);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void countVowelsWithNull(){
        assertThrows(IllegalArgumentException.class, () ->{
            task.countVowels(null);
        }, "При передаче null метод выбрасывает исключение IllegalArgumentException");
    }

}
