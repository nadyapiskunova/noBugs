package practice_11;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ValidateLengthTest extends StringProcessorTest{
    /**
     * Тесты на валидации длины
     * позитивные сценарии:
     * "abba", 3 -> "abba"
     * "abba", 4 -> "abba"
     * негативный сценраий
     * "abba", 3 -> IllegalArgumentException
     * угловые сценарии
     * "abba", 0 -> "abba"
     * "", 0 -> ""
     * "hello", -1 -> IllegalArgumentException
     */
    public static Stream<Arguments> stringForValidatePositiveCase(){
        return Stream.of(
                // позитивные сценарии:
                Arguments.of("abba",3),
                Arguments.of("abba",4),
                Arguments.of("abba",0),
                // угловые сценарии
                Arguments.of("",0)
        );
    }
    @ParameterizedTest
    @MethodSource("stringForValidatePositiveCase")
    public void userCanValidateStringWithLengthMoreOrEqualToMinValue(String initialString, int minValue){
        String expectedResult = stringProcessor.validateLength(initialString, minValue);

        assertEquals(expectedResult, initialString);
    }

    public static Stream<Arguments> stringForValidateNegativeCase(){
        return Stream.of(
                // негативный сценарии:
                Arguments.of("abba",5),
                // угловой
                Arguments.of("hello", -1)
        );
    }
    @ParameterizedTest
    @MethodSource("stringForValidateNegativeCase")
    public void userCanNotValidateStringWithLengthLessThanToMinValue(String initialString, int minValue){
        assertThrows(IllegalArgumentException.class, () -> {
            stringProcessor.validateLength(initialString, minValue);
        }, "Validation of String with length less null minValue should lead to IllegalArgumentException");
    }

}
