package hw_practice_11;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CountVowelsTest extends PracticeTest{
    public static Stream<Arguments> stringForValidatePositiveCase(){
        return Stream.of(
                // positive path
                Arguments.of("hello", 2),
                Arguments.of("java", 2),
                Arguments.of("AEIOU", 5),
                //negative
                Arguments.of("ptrw", 0),
                // corner case
                Arguments.of("", 0)

        );
    }

    @ParameterizedTest
    @MethodSource ("stringForValidatePositiveCase")
    public void countVowelsWhenStringIsValidate(String initialString, int expectedCount){
       int actualCount = practice.countVowels(initialString);

       assertEquals(expectedCount, actualCount);
    }

    @Test
    public void countVowelsStringIsNull(){
        assertThrows(IllegalArgumentException.class, () ->{
            practice.countVowels(null);
        }, "Count vowels null string should lead to IllegalArgumentException");
    }

}
