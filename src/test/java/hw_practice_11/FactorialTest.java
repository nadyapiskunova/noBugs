package hw_practice_11;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialTest extends PracticeTest{
    public static Stream<Arguments> argumentsForFactorialWithPositiveNumber(){
        return Stream.of(
                Arguments.of(0,1),
                Arguments.of(1,1),
                Arguments.of(5,120),
                Arguments.of(7,5040)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsForFactorialWithPositiveNumber")
    public void factorialWithPositiveNumber(int num, int expectedResult){
        int actualResult = practice.factorial(num);

        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void factorialWithNegativeNumber(){
       assertThrows(IllegalArgumentException.class, () -> {
           practice.factorial(-1);
       }, "Factorial negative number should lead to IllegalArgumentException");
    }


}
