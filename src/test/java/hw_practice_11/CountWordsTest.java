package hw_practice_11;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CountWordsTest extends PracticeTest{
    public static Stream<Arguments> argumentsForWiIvenList(){
        return Stream.of(
                Arguments.of("helo world", 2),
                Arguments.of("my   name is nadya   ", 4),
                Arguments.of("", 0)
        );
    }
    @ParameterizedTest
    @MethodSource("argumentsForWiIvenList")
    public void countWordsWithValidStringTest(String initialString, int expectedResult){
        int actualResult = practice.countWords(initialString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void countWordsWithNullStringTest(){
        assertThrows(NullPointerException.class, () ->{
            practice.countWords(null);
        },"Count words null string should lead NullPointerException ");
    }

}
